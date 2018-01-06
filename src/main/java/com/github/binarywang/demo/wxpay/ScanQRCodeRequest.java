package com.github.binarywang.demo.wxpay;

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
public class ScanQRCodeRequest {
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

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getIsSubscribe() {
		return isSubscribe;
	}

	public void setIsSubscribe(String isSubscribe) {
		this.isSubscribe = isSubscribe;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

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

	  @XStreamAlias("openid")
	  protected String openid;
	  
	  @XStreamAlias("is_subscribe")
	  protected String isSubscribe;
	  
	  @XStreamAlias("nonce_str")
	  protected String nonceStr;
	  
	  @XStreamAlias("product_id")
	  protected String productId;
	  
	  @XStreamAlias("sign")
	  protected String sign;
}