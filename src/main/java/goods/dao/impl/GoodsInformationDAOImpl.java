package goods.dao.impl;

import goods.dao.GoodsInformationDAO;
import goods.model.GoodsInformation;
import goods.model.GoodsInformationWithBLOBs;

public class GoodsInformationDAOImpl implements GoodsInformationDAO{
	@Override
	public int deleteByPrimaryKey(Integer goodsid){
		return 0;
	}

	@Override
	public int insert(GoodsInformationWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(GoodsInformationWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GoodsInformationWithBLOBs selectByPrimaryKey(Integer goodsid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(GoodsInformationWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(GoodsInformationWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(GoodsInformation record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
