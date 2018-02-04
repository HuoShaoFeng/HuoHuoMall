package com.huohuo.search.service;

import com.huohuo.search.pojo.SearchResult;

public interface SearchService {
	SearchResult search(String queryString, int page, int rows) throws Exception ;
}
