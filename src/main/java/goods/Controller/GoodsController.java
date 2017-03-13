package goods.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import goods.model.GoodsAttribute;
import goods.service.GoodsAttributeService;

public class GoodsController {
	@Autowired
	GoodsAttributeService goodsattbuteService;
	
	@RequestMapping(value="getAttributes")
	public Object getAllGoodsAttributes(HttpServletRequest request)
	{
		String number = request.getParameter("number");
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("number", number);
		List<GoodsAttribute> list = goodsattbuteService.getAllGoodsAttributes(params);
		return list;
	}
	
	@RequestMapping(value="getAttributeById")
	public Object getAttributeById(HttpServletRequest request)
	{
		String attributeId = request.getParameter("attributeId");
		GoodsAttribute goodsAttribute = goodsattbuteService.selectByPrimaryKey(Integer.valueOf(attributeId));
		return goodsAttribute;
	}

}
