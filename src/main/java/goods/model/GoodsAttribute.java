package goods.model;

public class GoodsAttribute {
    private Integer attributeid;

    private Integer attributetypeid;

    private String attributename;

    private String inputtype;

    private String attributegroup;

    private String indexstatus;

    private String linked;

    private String choosable;

    private String attributevalues;

    public Integer getAttributeid() {
        return attributeid;
    }

    public void setAttributeid(Integer attributeid) {
        this.attributeid = attributeid;
    }

    public Integer getAttributetypeid() {
        return attributetypeid;
    }

    public void setAttributetypeid(Integer attributetypeid) {
        this.attributetypeid = attributetypeid;
    }

    public String getAttributename() {
        return attributename;
    }

    public void setAttributename(String attributename) {
        this.attributename = attributename == null ? null : attributename.trim();
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype == null ? null : inputtype.trim();
    }

    public String getAttributegroup() {
        return attributegroup;
    }

    public void setAttributegroup(String attributegroup) {
        this.attributegroup = attributegroup == null ? null : attributegroup.trim();
    }

    public String getIndexstatus() {
        return indexstatus;
    }

    public void setIndexstatus(String indexstatus) {
        this.indexstatus = indexstatus == null ? null : indexstatus.trim();
    }

    public String getLinked() {
        return linked;
    }

    public void setLinked(String linked) {
        this.linked = linked == null ? null : linked.trim();
    }

    public String getChoosable() {
        return choosable;
    }

    public void setChoosable(String choosable) {
        this.choosable = choosable == null ? null : choosable.trim();
    }

    public String getAttributevalues() {
        return attributevalues;
    }

    public void setAttributevalues(String attributevalues) {
        this.attributevalues = attributevalues == null ? null : attributevalues.trim();
    }
}