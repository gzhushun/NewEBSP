package goods.dao;

import goods.model.GoodsPicture;

public interface GoodsPictureDAO {
    public int deleteByPrimaryKey(Integer pictureid);

    public int insert(GoodsPicture record);

    public int insertSelective(GoodsPicture record);

    public GoodsPicture selectByPrimaryKey(Integer pictureid);

    public int updateByPrimaryKeySelective(GoodsPicture record);

    public int updateByPrimaryKeyWithBLOBs(GoodsPicture record);

    public int updateByPrimaryKey(GoodsPicture record);
}