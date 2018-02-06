package com.huohuo.portal.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.huohuo.common.pojo.TaotaoResult;
import com.huohuo.common.utils.HttpClientUtil;
import com.huohuo.common.utils.JsonUtils;
import com.huohuo.portal.pojo.Order;
import com.huohuo.portal.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Value("${ORDER_BASE_URL}")
	private String ORDER_BASE_URL;
	@Value("${ORDER_CREATE_URL}")
	private String ORDER_CREATE_URL;

	@Override
	public String createOrder(Order order) {
		//调用huohuo-order的服务提交订单。
		String json = HttpClientUtil.doPostJson(ORDER_BASE_URL + ORDER_CREATE_URL, JsonUtils.objectToJson(order));
		//把json转换成huohuoResult
		TaotaoResult huohuoResult = TaotaoResult.format(json);
		if (huohuoResult.getStatus() == 200) {
//			Object orderId = huohuoResult.getData();
			Long orderId = (Long) huohuoResult.getData();
			return orderId.toString();
		}
		return "";//失败时返回空串
	}
}
