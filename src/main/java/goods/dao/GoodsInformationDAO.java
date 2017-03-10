package goods.dao;

import goods.model.GoodsInformation;
import goods.model.GoodsInformationWithBLOBs;

public interface GoodsInformationDAO {
    public int deleteByPrimaryKey(Integer goodsid);

    public int insert(GoodsInformationWithBLOBs record);

    public int insertSelective(GoodsInformationWithBLOBs record);

    public GoodsInformationWithBLOBs selectByPrimaryKey(Integer goodsid);

    public int updateByPrimaryKeySelective(GoodsInformationWithBLOBs record);

    public int updateByPrimaryKeyWithBLOBs(GoodsInformationWithBLOBs record);

    public int updateByPrimaryKey(GoodsInformation record);
}