package com.huohuo.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.huohuo.search.pojo.SearchResult;

public interface SearchDao {
	SearchResult search(SolrQuery query) throws Exception;
}
