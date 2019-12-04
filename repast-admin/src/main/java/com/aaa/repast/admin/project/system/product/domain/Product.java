package com.aaa.repast.admin.project.system.product.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.aaa.repast.admin.framework.web.domain.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表 pms_product
 * 
 * @author Seven Lee
 * @date 2019-12-04
 */
public class Product extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long id;
	/** 店铺ID */
	private Long shopId;
	/** 品牌ID */
	private Long brandId;
	/** 产品类别ID */
	private Long productCategoryId;
	/** 产品属性类别ID */
	private Long productAttributeCategoryId;
	/**  */
	private String name;
	/**  */
	private String pic;
	/** 货号 */
	private String productSn;
	/** 删除状态：0->未删除；1->已删除 */
	private Integer deleteStatus;
	/** 上架状态：0->下架；1->上架 */
	private Integer publishStatus;
	/** 新品状态:0->不是新品；1->新品 */
	private Integer newStatus;
	/** 推荐状态；0->不推荐；1->推荐 */
	private Integer recommandStatus;
	/** 排序 */
	private Integer sort;
	/** 销量 */
	private Integer sale;
	/**  */
	private BigDecimal price;
	/** 促销价格 */
	private BigDecimal promotionPrice;
	/** 赠送的积分 */
	private Integer giftPoint;
	/** 副标题 */
	private String subTitle;
	/** 商品描述 */
	private String description;
	/** 市场价 */
	private BigDecimal originalPrice;
	/** 库存 */
	private Integer stock;
	/** 库存预警值 */
	private Integer lowStock;
	/** 单位 */
	private String unit;
	/** 商品重量，默认为克 */
	private BigDecimal weight;
	/** 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮 */
	private String serviceIds;
	/**  */
	private String keywords;
	/**  */
	private String note;
	/** 画册id */
	private Long albumId;
	/**  */
	private String detailTitle;
	/**  */
	private String detailDesc;
	/** 产品详情网页内容 */
	private String detailHtml;
	/** 移动端网页详情 */
	private String detailMobileHtml;
	/** 促销开始时间 */
	private Date promotionStartTime;
	/** 促销结束时间 */
	private Date promotionEndTime;
	/** 活动限购数量 */
	private Integer promotionPerLimit;
	/** 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购 */
	private Integer promotionType;
	/** 品牌名称 */
	private String brandName;
	/** 商品分类名称 */
	private String productCategoryName;
	/** 币种，0-> 人民币;  1-> 积分 */
	private Integer currency;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setShopId(Long shopId) 
	{
		this.shopId = shopId;
	}

	public Long getShopId() 
	{
		return shopId;
	}
	public void setBrandId(Long brandId) 
	{
		this.brandId = brandId;
	}

	public Long getBrandId() 
	{
		return brandId;
	}
	public void setProductCategoryId(Long productCategoryId) 
	{
		this.productCategoryId = productCategoryId;
	}

	public Long getProductCategoryId() 
	{
		return productCategoryId;
	}
	public void setProductAttributeCategoryId(Long productAttributeCategoryId) 
	{
		this.productAttributeCategoryId = productAttributeCategoryId;
	}

	public Long getProductAttributeCategoryId() 
	{
		return productAttributeCategoryId;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setPic(String pic) 
	{
		this.pic = pic;
	}

	public String getPic() 
	{
		return pic;
	}
	public void setProductSn(String productSn) 
	{
		this.productSn = productSn;
	}

	public String getProductSn() 
	{
		return productSn;
	}
	public void setDeleteStatus(Integer deleteStatus) 
	{
		this.deleteStatus = deleteStatus;
	}

	public Integer getDeleteStatus() 
	{
		return deleteStatus;
	}
	public void setPublishStatus(Integer publishStatus) 
	{
		this.publishStatus = publishStatus;
	}

	public Integer getPublishStatus() 
	{
		return publishStatus;
	}
	public void setNewStatus(Integer newStatus) 
	{
		this.newStatus = newStatus;
	}

	public Integer getNewStatus() 
	{
		return newStatus;
	}
	public void setRecommandStatus(Integer recommandStatus) 
	{
		this.recommandStatus = recommandStatus;
	}

	public Integer getRecommandStatus() 
	{
		return recommandStatus;
	}
	public void setSort(Integer sort) 
	{
		this.sort = sort;
	}

	public Integer getSort() 
	{
		return sort;
	}
	public void setSale(Integer sale) 
	{
		this.sale = sale;
	}

	public Integer getSale() 
	{
		return sale;
	}
	public void setPrice(BigDecimal price) 
	{
		this.price = price;
	}

	public BigDecimal getPrice() 
	{
		return price;
	}
	public void setPromotionPrice(BigDecimal promotionPrice) 
	{
		this.promotionPrice = promotionPrice;
	}

	public BigDecimal getPromotionPrice() 
	{
		return promotionPrice;
	}
	public void setGiftPoint(Integer giftPoint) 
	{
		this.giftPoint = giftPoint;
	}

	public Integer getGiftPoint() 
	{
		return giftPoint;
	}
	public void setSubTitle(String subTitle) 
	{
		this.subTitle = subTitle;
	}

	public String getSubTitle() 
	{
		return subTitle;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getDescription() 
	{
		return description;
	}
	public void setOriginalPrice(BigDecimal originalPrice) 
	{
		this.originalPrice = originalPrice;
	}

	public BigDecimal getOriginalPrice() 
	{
		return originalPrice;
	}
	public void setStock(Integer stock) 
	{
		this.stock = stock;
	}

	public Integer getStock() 
	{
		return stock;
	}
	public void setLowStock(Integer lowStock) 
	{
		this.lowStock = lowStock;
	}

	public Integer getLowStock() 
	{
		return lowStock;
	}
	public void setUnit(String unit) 
	{
		this.unit = unit;
	}

	public String getUnit() 
	{
		return unit;
	}
	public void setWeight(BigDecimal weight) 
	{
		this.weight = weight;
	}

	public BigDecimal getWeight() 
	{
		return weight;
	}
	public void setServiceIds(String serviceIds) 
	{
		this.serviceIds = serviceIds;
	}

	public String getServiceIds() 
	{
		return serviceIds;
	}
	public void setKeywords(String keywords) 
	{
		this.keywords = keywords;
	}

	public String getKeywords() 
	{
		return keywords;
	}
	public void setNote(String note) 
	{
		this.note = note;
	}

	public String getNote() 
	{
		return note;
	}
	public void setAlbumId(Long albumId) 
	{
		this.albumId = albumId;
	}

	public Long getAlbumId() 
	{
		return albumId;
	}
	public void setDetailTitle(String detailTitle) 
	{
		this.detailTitle = detailTitle;
	}

	public String getDetailTitle() 
	{
		return detailTitle;
	}
	public void setDetailDesc(String detailDesc) 
	{
		this.detailDesc = detailDesc;
	}

	public String getDetailDesc() 
	{
		return detailDesc;
	}
	public void setDetailHtml(String detailHtml) 
	{
		this.detailHtml = detailHtml;
	}

	public String getDetailHtml() 
	{
		return detailHtml;
	}
	public void setDetailMobileHtml(String detailMobileHtml) 
	{
		this.detailMobileHtml = detailMobileHtml;
	}

	public String getDetailMobileHtml() 
	{
		return detailMobileHtml;
	}
	public void setPromotionStartTime(Date promotionStartTime) 
	{
		this.promotionStartTime = promotionStartTime;
	}

	public Date getPromotionStartTime() 
	{
		return promotionStartTime;
	}
	public void setPromotionEndTime(Date promotionEndTime) 
	{
		this.promotionEndTime = promotionEndTime;
	}

	public Date getPromotionEndTime() 
	{
		return promotionEndTime;
	}
	public void setPromotionPerLimit(Integer promotionPerLimit) 
	{
		this.promotionPerLimit = promotionPerLimit;
	}

	public Integer getPromotionPerLimit() 
	{
		return promotionPerLimit;
	}
	public void setPromotionType(Integer promotionType) 
	{
		this.promotionType = promotionType;
	}

	public Integer getPromotionType() 
	{
		return promotionType;
	}
	public void setBrandName(String brandName) 
	{
		this.brandName = brandName;
	}

	public String getBrandName() 
	{
		return brandName;
	}
	public void setProductCategoryName(String productCategoryName) 
	{
		this.productCategoryName = productCategoryName;
	}

	public String getProductCategoryName() 
	{
		return productCategoryName;
	}
	public void setCurrency(Integer currency) 
	{
		this.currency = currency;
	}

	public Integer getCurrency() 
	{
		return currency;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shopId", getShopId())
            .append("brandId", getBrandId())
            .append("productCategoryId", getProductCategoryId())
            .append("productAttributeCategoryId", getProductAttributeCategoryId())
            .append("name", getName())
            .append("pic", getPic())
            .append("productSn", getProductSn())
            .append("deleteStatus", getDeleteStatus())
            .append("publishStatus", getPublishStatus())
            .append("newStatus", getNewStatus())
            .append("recommandStatus", getRecommandStatus())
            .append("sort", getSort())
            .append("sale", getSale())
            .append("price", getPrice())
            .append("promotionPrice", getPromotionPrice())
            .append("giftPoint", getGiftPoint())
            .append("subTitle", getSubTitle())
            .append("description", getDescription())
            .append("originalPrice", getOriginalPrice())
            .append("stock", getStock())
            .append("lowStock", getLowStock())
            .append("unit", getUnit())
            .append("weight", getWeight())
            .append("serviceIds", getServiceIds())
            .append("keywords", getKeywords())
            .append("note", getNote())
            .append("albumId", getAlbumId())
            .append("detailTitle", getDetailTitle())
            .append("detailDesc", getDetailDesc())
            .append("detailHtml", getDetailHtml())
            .append("detailMobileHtml", getDetailMobileHtml())
            .append("promotionStartTime", getPromotionStartTime())
            .append("promotionEndTime", getPromotionEndTime())
            .append("promotionPerLimit", getPromotionPerLimit())
            .append("promotionType", getPromotionType())
            .append("brandName", getBrandName())
            .append("productCategoryName", getProductCategoryName())
            .append("currency", getCurrency())
            .toString();
    }
}
