package com.huohuo.rest.service;

import java.util.List;

import com.huohuo.pojo.TbContent;

public interface ContentService {
	List<TbContent> getContentList(long contentCid);
}
