package com.huohuo.rest.service;

import com.huohuo.common.pojo.TaotaoResult;

public interface RedisService {
	TaotaoResult syncContent(long contentCid) ;

}
