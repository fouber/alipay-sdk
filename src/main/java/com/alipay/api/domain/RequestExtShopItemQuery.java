package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询店铺商品信息入参
 *
 * @author auto create
 * @since 1.0, 2017-04-10 09:54:37
 */
public class RequestExtShopItemQuery extends AlipayObject {

	private static final long serialVersionUID = 4834641225768356131L;

	/**
	 * 品牌标识
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 类目标识
	 */
	@ApiField("category_code")
	private String categoryCode;

	/**
	 * 商品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 店铺商品SKU
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 口碑门店id
	 */
	@ApiField("kb_shop_id")
	private String kbShopId;

	/**
	 * 商品图片
	 */
	@ApiField("picture")
	private String picture;

	/**
	 * 参考价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 店铺商品的名称
	 */
	@ApiField("title")
	private String title;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getKbShopId() {
		return this.kbShopId;
	}
	public void setKbShopId(String kbShopId) {
		this.kbShopId = kbShopId;
	}

	public String getPicture() {
		return this.picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
