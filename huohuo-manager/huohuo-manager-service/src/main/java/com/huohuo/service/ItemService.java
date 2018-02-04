package com.huohuo.service;

import com.huohuo.common.pojo.EUDataGridResult;
import com.huohuo.common.pojo.TaotaoResult;
import com.huohuo.pojo.TbItem;

public interface ItemService {
	public TbItem getItemById(Long itemId);
	
	public EUDataGridResult getItemList(Integer page,Integer rows);
	
	public TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
	
}
