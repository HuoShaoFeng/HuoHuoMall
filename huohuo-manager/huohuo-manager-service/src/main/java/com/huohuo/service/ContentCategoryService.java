package com.huohuo.service;

import java.util.List;

import com.huohuo.common.pojo.EUTreeNode;
import com.huohuo.common.pojo.TaotaoResult;

public interface ContentCategoryService {
	List<EUTreeNode> getCategoryList(long parentId);
	TaotaoResult insertContentCategory(long parentId, String name);
}
