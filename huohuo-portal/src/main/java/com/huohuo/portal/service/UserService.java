package com.huohuo.portal.service;

import com.huohuo.pojo.TbUser;

public interface UserService {
	TbUser getUserByToken(String token);
}
