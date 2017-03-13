package goods.dao.impl;

import org.springframework.stereotype.Repository;

import goods.dao.GoodsPictureDAO;
import goods.model.GoodsPicture;
@Repository(value="goodsPictureDAO")
public class GoodsPictureDAOImpl implements GoodsPictureDAO{
	@Override
    public int deleteByPrimaryKey(Integer pictureid){
    	return 0;
    }

	@Override
	public int insert(GoodsPicture record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(GoodsPicture record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GoodsPicture selectByPrimaryKey(Integer pictureid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(GoodsPicture record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(GoodsPicture record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(GoodsPicture record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
