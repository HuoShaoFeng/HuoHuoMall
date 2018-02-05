package com.huohuo.search.service;

import com.huohuo.search.pojo.SearchResult;

public interface SearchService {
	//update on github 
	SearchResult search(String queryString, int page, int rows) throws Exception ;
	//let see whether this change will show on eclipse or not
}
