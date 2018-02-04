package com.huohuo.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.huohuo.common.pojo.TaotaoResult;
import com.huohuo.common.utils.ExceptionUtil;
import com.huohuo.rest.dao.JedisClient;
import com.huohuo.rest.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService {

	@Autowired
	private JedisClient jedisClientSingle;
	
	@Value("${INDEX_CONTENT_REDIS_KEY}")
	private String INDEX_CONTENT_REDIS_KEY;
	
	@Override
	public TaotaoResult syncContent(long contentCid) {
		try {
			jedisClientSingle.hdel(INDEX_CONTENT_REDIS_KEY, contentCid + "");
		} catch (Exception e) {
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return TaotaoResult.ok();
	}
}
