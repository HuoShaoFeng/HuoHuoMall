package com.huohuo.service;

import java.util.List;

import com.huohuo.common.pojo.EUTreeNode;

public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);
}
