package goods.model;

public class GoodsInformationWithBLOBs extends GoodsInformation {
    private String goodsdescription;

    private String marketcondition;

    private String remark;

    private String attachment;

    public String getGoodsdescription() {
        return goodsdescription;
    }

    public void setGoodsdescription(String goodsdescription) {
        this.goodsdescription = goodsdescription == null ? null : goodsdescription.trim();
    }

    public String getMarketcondition() {
        return marketcondition;
    }

    public void setMarketcondition(String marketcondition) {
        this.marketcondition = marketcondition == null ? null : marketcondition.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }
}