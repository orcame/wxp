package com.github.binarywang.demo.wxpay;

import static com.github.binarywang.wxpay.constant.WxPayConstants.SignType.ALL_SIGN_TYPES;

import org.apache.commons.lang3.StringUtils;

import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.util.SignUtils;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
@XStreamAlias("xml")
public class ScanQRCodeResponse {
	/**
	 * <pre>
	 * 字段名：公众账号ID
	 * 变量名：appid
	 * 是否必填：是
	 * 类型：String(32)
	 * 示例值：wxd678efh567hg6787
	 * 描述：微信分配的公众账号ID（企业号corpid即为此appId）
	 * </pre>
	 */
	@XStreamAlias("appid")
	protected String appid;
	/**
	 * <pre>
	 * 字段名：商户号
	 * 变量名：mch_id
	 * 是否必填：是
	 * 类型：String(32)
	 * 示例值：1230000109
	 * 描述：微信支付分配的商户号
	 * </pre>
	 */
	@XStreamAlias("mch_id")
	protected String mchId;

	@XStreamAlias("return_code")
	protected String returnCode;

	@XStreamAlias("return_msg")
	protected String returnMsg;

	@XStreamAlias("nonce_str")
	protected String nonceStr;

	@XStreamAlias("prepay_id")
	protected String prepayId;

	@XStreamAlias("result_code")
	protected String resultCode;

	@XStreamAlias("err_code_des")
	protected String errCodeDes;

	@XStreamAlias("sign")
	protected String sign;

	
	public String getAppid() {
		return appid;
	}


	public void setAppid(String appid) {
		this.appid = appid;
	}


	public String getMchId() {
		return mchId;
	}


	public void setMchId(String mchId) {
		this.mchId = mchId;
	}


	public String getReturnCode() {
		return returnCode;
	}


	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}


	public String getReturnMsg() {
		return returnMsg;
	}


	public void setReturnMsg(String returnMsg) {
		this.returnMsg = returnMsg;
	}


	public String getNonceStr() {
		return nonceStr;
	}


	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}


	public String getPrepayId() {
		return prepayId;
	}


	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}


	public String getResultCode() {
		return resultCode;
	}


	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}


	public String getErrCodeDes() {
		return errCodeDes;
	}


	public void setErrCodeDes(String errCodeDes) {
		this.errCodeDes = errCodeDes;
	}


	public String getSign() {
		return sign;
	}


	public void setSign(String sign) {
		this.sign = sign;
	}


	public void checkAndSign(WxPayConfig config, boolean isIgnoreSignType) {
		
	    if (StringUtils.isBlank(getAppid())) {
	      this.setAppid(config.getAppId());
	    }

	    if (StringUtils.isBlank(getMchId())) {
	      this.setMchId(config.getMchId());
	    }

	    if (StringUtils.isBlank(this.getNonceStr())) {
	      this.setNonceStr(String.valueOf(System.currentTimeMillis()));
	    }

	    //设置签名字段的值
	    this.setSign(SignUtils.createSign(this, "MD5", config.getMchKey(),isIgnoreSignType));
	}
}
