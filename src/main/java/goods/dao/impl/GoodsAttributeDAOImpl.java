package goods.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import goods.dao.GoodsAttributeDAO;
import goods.model.GoodsAttribute;
@Repository(value="goodsAttributeDAO")
public class GoodsAttributeDAOImpl implements GoodsAttributeDAO{
	@Override
    public int deleteByPrimaryKey(Integer attributeid){
    	return 0;
    }
    @Override
    public int insert(GoodsAttribute record){
    	return 0;
    }
    @Override
    public int insertSelective(GoodsAttribute record){
    	return 0;
    }
	@Override
	public GoodsAttribute selectByPrimaryKey(Integer attributeid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int updateByPrimaryKeySelective(GoodsAttribute record) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateByPrimaryKeyWithBLOBs(GoodsAttribute record) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateByPrimaryKey(GoodsAttribute record) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
    public List<GoodsAttribute> getAllGoodsAttributes(Map<String, Object> params){
		List<GoodsAttribute> list = new ArrayList<GoodsAttribute>();
		return list;
	}
}
