package com.huohuo.portal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huohuo.common.pojo.TaotaoResult;
import com.huohuo.portal.pojo.CartItem;


public interface CartService {
	
	TaotaoResult addCartItem(long itemId,int count,HttpServletRequest request,HttpServletResponse response);
	
	List<CartItem> getCartItemList(HttpServletRequest request) ;
	
	 List<CartItem> getCartItemList(HttpServletRequest request, HttpServletResponse response);
	 
	 TaotaoResult deleteCartItem(long itemId, HttpServletRequest request, HttpServletResponse response);

}
