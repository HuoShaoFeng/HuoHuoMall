package com.huohuo.sso.service;

import com.huohuo.common.pojo.TaotaoResult;
import com.huohuo.pojo.TbUser;

public interface UserService {
	 TaotaoResult checkData(String content, Integer type) ;
	 TaotaoResult createUser(TbUser user) ;
	 TaotaoResult userLogin(String username, String password);
	 
	 TaotaoResult getUserByToken(String token);
}
