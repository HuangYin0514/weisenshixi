
package com.internship.controller;

import java.util.List;

import com.internship.model.SearchResult;
import com.internship.pojo.TestPojo;
import com.internship.services.SearchItemService;
import com.internship.services.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController
 */

@RestController
@RequestMapping("/index")
public class IndexController {

    // @Autowired
    // private TestService testService;
    @Autowired
    private SearchItemService searchItemService;

    @GetMapping("h1")
    public String test() {
        // for (TestPojo p : testService.getPojos()) {
        // System.out.println(p.toString());
        // System.out.println(p.getContent());
        // }
        // return testService.getPojos().toString();
        return null;
    }

    @GetMapping("h2")
    public List<SearchResult> test1(Model model) {
        // for (TestPojo p : testService.getPojos()) {
        // model.addAttribute("info", p.getContent());
        // }
        System.out.println("hello");
        List<SearchResult> result = searchItemService.search();
        System.out.println(result);
        return result;
    }

}