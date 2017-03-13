package goods.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import goods.dao.GoodsAttributeDAO;
import goods.model.GoodsAttribute;
import goods.service.GoodsAttributeService;
@Service(value="goodsAttributeService")
public class GoodsAttributeServiceImpl implements GoodsAttributeService {
	@Autowired
	GoodsAttributeDAO goodsAttributeDAO;
	
	@Override
	public List<GoodsAttribute> getAllGoodsAttributes(Map<String, Object> params){
		return goodsAttributeDAO.getAllGoodsAttributes(params);
	}
	
	@Override
	public GoodsAttribute selectByPrimaryKey(int attributeid){
		return this.goodsAttributeDAO.selectByPrimaryKey(attributeid);
	}

}
