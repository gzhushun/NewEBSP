package goods.service;

import java.util.List;
import java.util.Map;

import goods.model.GoodsAttribute;

public interface GoodsAttributeService {
	public List<GoodsAttribute> getAllGoodsAttributes(Map<String, Object> params);
	public GoodsAttribute selectByPrimaryKey(int attributeid);
}
