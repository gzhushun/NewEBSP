package goods.model;

public class GoodsInformation {
    private Integer goodsid;

    private String goodsname;

    private String goodssku;

    private String goodsattributesku;

    private Integer categoryid;

    private Integer pictureid;

    private String purchaser;

    private Integer supplierid;

    private Integer stocking;

    private Integer stocktotal;

    private Integer soldquantity;

    private Integer stockup;

    private String isspot;

    private String isorder;

    private String ordertime;

    private Integer miniorderquantity;

    private String listingdate;

    private String saleplatform;

    private String barcode;

    private Integer proweightclear;

    private Integer goodsweight;

    private Integer goodslength;

    private Integer goodswidth;

    private Integer goodsheight;

    private Double purchasegoodsprice;

    private Double goodscost;

    private Double goodsmarketprice;

    private Double goodssaleprice;

    private Double vipprice;

    private Double activityprice;

    private String limitbuy;

    private Integer limitamount;

    private Integer roadday;

    private String popular;

    private String goodsstatus;

    private String isfragile;

    private String recover;

    private String isdown;

    private String overseaposition;

    private String qualitycheck;

    private String instock1name;

    private String instock2name;

    private String instock3name;

    private String creator;

    private String createtime;

    private String modifier;

    private String modifytime;

    private String lifestyle;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodssku() {
        return goodssku;
    }

    public void setGoodssku(String goodssku) {
        this.goodssku = goodssku == null ? null : goodssku.trim();
    }

    public String getGoodsattributesku() {
        return goodsattributesku;
    }

    public void setGoodsattributesku(String goodsattributesku) {
        this.goodsattributesku = goodsattributesku == null ? null : goodsattributesku.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser == null ? null : purchaser.trim();
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getStocking() {
        return stocking;
    }

    public void setStocking(Integer stocking) {
        this.stocking = stocking;
    }

    public Integer getStocktotal() {
        return stocktotal;
    }

    public void setStocktotal(Integer stocktotal) {
        this.stocktotal = stocktotal;
    }

    public Integer getSoldquantity() {
        return soldquantity;
    }

    public void setSoldquantity(Integer soldquantity) {
        this.soldquantity = soldquantity;
    }

    public Integer getStockup() {
        return stockup;
    }

    public void setStockup(Integer stockup) {
        this.stockup = stockup;
    }

    public String getIsspot() {
        return isspot;
    }

    public void setIsspot(String isspot) {
        this.isspot = isspot == null ? null : isspot.trim();
    }

    public String getIsorder() {
        return isorder;
    }

    public void setIsorder(String isorder) {
        this.isorder = isorder == null ? null : isorder.trim();
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    public Integer getMiniorderquantity() {
        return miniorderquantity;
    }

    public void setMiniorderquantity(Integer miniorderquantity) {
        this.miniorderquantity = miniorderquantity;
    }

    public String getListingdate() {
        return listingdate;
    }

    public void setListingdate(String listingdate) {
        this.listingdate = listingdate == null ? null : listingdate.trim();
    }

    public String getSaleplatform() {
        return saleplatform;
    }

    public void setSaleplatform(String saleplatform) {
        this.saleplatform = saleplatform == null ? null : saleplatform.trim();
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public Integer getProweightclear() {
        return proweightclear;
    }

    public void setProweightclear(Integer proweightclear) {
        this.proweightclear = proweightclear;
    }

    public Integer getGoodsweight() {
        return goodsweight;
    }

    public void setGoodsweight(Integer goodsweight) {
        this.goodsweight = goodsweight;
    }

    public Integer getGoodslength() {
        return goodslength;
    }

    public void setGoodslength(Integer goodslength) {
        this.goodslength = goodslength;
    }

    public Integer getGoodswidth() {
        return goodswidth;
    }

    public void setGoodswidth(Integer goodswidth) {
        this.goodswidth = goodswidth;
    }

    public Integer getGoodsheight() {
        return goodsheight;
    }

    public void setGoodsheight(Integer goodsheight) {
        this.goodsheight = goodsheight;
    }

    public Double getPurchasegoodsprice() {
        return purchasegoodsprice;
    }

    public void setPurchasegoodsprice(Double purchasegoodsprice) {
        this.purchasegoodsprice = purchasegoodsprice;
    }

    public Double getGoodscost() {
        return goodscost;
    }

    public void setGoodscost(Double goodscost) {
        this.goodscost = goodscost;
    }

    public Double getGoodsmarketprice() {
        return goodsmarketprice;
    }

    public void setGoodsmarketprice(Double goodsmarketprice) {
        this.goodsmarketprice = goodsmarketprice;
    }

    public Double getGoodssaleprice() {
        return goodssaleprice;
    }

    public void setGoodssaleprice(Double goodssaleprice) {
        this.goodssaleprice = goodssaleprice;
    }

    public Double getVipprice() {
        return vipprice;
    }

    public void setVipprice(Double vipprice) {
        this.vipprice = vipprice;
    }

    public Double getActivityprice() {
        return activityprice;
    }

    public void setActivityprice(Double activityprice) {
        this.activityprice = activityprice;
    }

    public String getLimitbuy() {
        return limitbuy;
    }

    public void setLimitbuy(String limitbuy) {
        this.limitbuy = limitbuy == null ? null : limitbuy.trim();
    }

    public Integer getLimitamount() {
        return limitamount;
    }

    public void setLimitamount(Integer limitamount) {
        this.limitamount = limitamount;
    }

    public Integer getRoadday() {
        return roadday;
    }

    public void setRoadday(Integer roadday) {
        this.roadday = roadday;
    }

    public String getPopular() {
        return popular;
    }

    public void setPopular(String popular) {
        this.popular = popular == null ? null : popular.trim();
    }

    public String getGoodsstatus() {
        return goodsstatus;
    }

    public void setGoodsstatus(String goodsstatus) {
        this.goodsstatus = goodsstatus == null ? null : goodsstatus.trim();
    }

    public String getIsfragile() {
        return isfragile;
    }

    public void setIsfragile(String isfragile) {
        this.isfragile = isfragile == null ? null : isfragile.trim();
    }

    public String getRecover() {
        return recover;
    }

    public void setRecover(String recover) {
        this.recover = recover == null ? null : recover.trim();
    }

    public String getIsdown() {
        return isdown;
    }

    public void setIsdown(String isdown) {
        this.isdown = isdown == null ? null : isdown.trim();
    }

    public String getOverseaposition() {
        return overseaposition;
    }

    public void setOverseaposition(String overseaposition) {
        this.overseaposition = overseaposition == null ? null : overseaposition.trim();
    }

    public String getQualitycheck() {
        return qualitycheck;
    }

    public void setQualitycheck(String qualitycheck) {
        this.qualitycheck = qualitycheck == null ? null : qualitycheck.trim();
    }

    public String getInstock1name() {
        return instock1name;
    }

    public void setInstock1name(String instock1name) {
        this.instock1name = instock1name == null ? null : instock1name.trim();
    }

    public String getInstock2name() {
        return instock2name;
    }

    public void setInstock2name(String instock2name) {
        this.instock2name = instock2name == null ? null : instock2name.trim();
    }

    public String getInstock3name() {
        return instock3name;
    }

    public void setInstock3name(String instock3name) {
        this.instock3name = instock3name == null ? null : instock3name.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime == null ? null : modifytime.trim();
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle == null ? null : lifestyle.trim();
    }
}