package com.project.wewed.api.controller;

import com.project.wewed.api.common.ApiResponse;
import com.project.wewed.api.service.OjdbcConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/connection")
public class OjdbcConnectionController {

    @Autowired
    private OjdbcConnectionService ojdbcConnectionService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ApiResponse ojdbcConnectionTest() {
        ApiResponse res = ojdbcConnectionService.ojdbcConnectionTest();
        System.out.println(res);
        return res;
    }

}
