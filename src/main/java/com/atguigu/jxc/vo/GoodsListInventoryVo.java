package com.atguigu.jxc.vo;

/**
 * @PackageName: com.atguigu.jxc.vo
 * @ClassName: GoodsListInventoryVo
 * @Description:
 * @author: sdl
 * @date: 2022/7/24/10:41
 */
public class GoodsListInventoryVo {

    /**
     * 商品编号id
     */
    private Integer goodsId;

    /**
     * 商品编号
     */
    private String goodsCode;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 库存数量
     */
    private Integer inventoryQuantity;

    /**
     * 上次进价
     */
    private double lastPurchasingPrice;

    /**
     * 库存下限
     */
    private Integer minNum;

    /**
     * 商品型号
     */
    private String goodsModel;

    /**
     * 生产厂商
     */
    private String goodsProducer;

    /**
     * 采购价格
     */
    private double purchasingPrice;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 出售价格
     */
    private double sellingPrice;

    /**
     * 当前状态
     */
    private Integer state;// 0 初始化状态 1 期初库存入仓库  2  有进货或者销售单据

    /**
     * 商品单位
     */
    private String goodsUnit;

    /**
     * 商品类别id
     */
    private Integer goodsTypeId;

    /**
     * 商品类别
     */
    private String goodsTypeName;

    /**
     * 销售总量
     */
    private Integer saleTotal;// 销售总量


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public double getLastPurchasingPrice() {
        return lastPurchasingPrice;
    }

    public void setLastPurchasingPrice(double lastPurchasingPrice) {
        this.lastPurchasingPrice = lastPurchasingPrice;
    }

    public Integer getMinNum() {
        return minNum;
    }

    public void setMinNum(Integer minNum) {
        this.minNum = minNum;
    }

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
    }

    public String getGoodsProducer() {
        return goodsProducer;
    }

    public void setGoodsProducer(String goodsProducer) {
        this.goodsProducer = goodsProducer;
    }

    public double getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public Integer getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(Integer saleTotal) {
        this.saleTotal = saleTotal;
    }

}
