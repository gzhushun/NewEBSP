package goods.dao;

import java.util.List;
import java.util.Map;

import goods.model.GoodsAttribute;

public interface GoodsAttributeDAO {
    public int deleteByPrimaryKey(Integer attributeid);

    public int insert(GoodsAttribute record);

    public int insertSelective(GoodsAttribute record);

    public GoodsAttribute selectByPrimaryKey(Integer attributeid);

    public int updateByPrimaryKeySelective(GoodsAttribute record);

    public int updateByPrimaryKeyWithBLOBs(GoodsAttribute record);

    public int updateByPrimaryKey(GoodsAttribute record);
    
    public List<GoodsAttribute> getAllGoodsAttributes(Map<String, Object> params);
}