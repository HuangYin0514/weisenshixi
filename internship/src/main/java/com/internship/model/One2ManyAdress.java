package com.internship.model;

 
import java.util.List;

import lombok.Data;

/**
 * One2ManyAdress
 */
@Data
public class One2ManyAdress {

    private long id;
    private long name;
    private List<Company> compList;
    
}