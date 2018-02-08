package com.huohuo.portal.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.huohuo.portal.pojo.Order;

public interface OrderService {
	 String createOrder(Order order);
}
