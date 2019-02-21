package com.internship.model;

import java.util.List;

import lombok.Data;

/**
 * SearchResult
 */

@Data
public class SearchResult {

    private long id;
    private String name;
    private long number;
    private List<Company> companyList;
    
}