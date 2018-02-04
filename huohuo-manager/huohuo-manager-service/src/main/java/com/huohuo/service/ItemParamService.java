package com.huohuo.service;

import com.huohuo.common.pojo.TaotaoResult;
import com.huohuo.pojo.TbItemParam;

public interface ItemParamService {
	
	TaotaoResult getItemParamByCid(long cid);
	
	TaotaoResult insertItemParam(TbItemParam itemParam);
}
