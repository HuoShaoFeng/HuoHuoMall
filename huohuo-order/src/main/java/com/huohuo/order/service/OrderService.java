package com.huohuo.order.service;

import java.util.List;

import com.huohuo.common.pojo.TaotaoResult;
import com.huohuo.pojo.TbOrder;
import com.huohuo.pojo.TbOrderItem;
import com.huohuo.pojo.TbOrderShipping;

public interface OrderService {
	TaotaoResult createOrder(TbOrder order, List<TbOrderItem> itemList, TbOrderShipping orderShipping) ;
}
