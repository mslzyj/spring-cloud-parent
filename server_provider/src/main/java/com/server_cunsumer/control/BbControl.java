package com.server_cunsumer.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gdd")
public class BbControl {

    @RequestMapping("get")
    public String getData(){
        return "提供了数据";
    }
}
