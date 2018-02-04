package com.huohuo.portal.service;

import com.huohuo.portal.pojo.SearchResult;

public interface SearchService {
	SearchResult search(String queryString, int page);
}
