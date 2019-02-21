package com.internship.mapper;

import java.util.List;

import com.internship.model.SearchResult;

import org.springframework.stereotype.Repository;
/**
 * SearchResultMapper
 */

@Repository
public interface SearchResultMapper {

    List<SearchResult> getList();
}