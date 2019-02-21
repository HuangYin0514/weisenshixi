package com.internship.services.impl;

import java.util.List;


import com.internship.mapper.SearchResultMapper;
import com.internship.model.SearchResult;
import com.internship.services.SearchItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SearchItemServiceImpl
 */
@Service
public class SearchItemServiceImpl implements SearchItemService {

    @Autowired
    private SearchResultMapper searchResultMapper;

    public List<SearchResult> search() {
        // Query query = new Query();
        // List<SearchResult> searchResult =
        List<SearchResult> result = searchResultMapper.getList();
        return result;
    }

}
