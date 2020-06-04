package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("gdd")
public class BbControl {

    private final String url = "http://localhost:8001/gdd/get";
    @RequestMapping("mpp")
    public String get(){
        RestTemplate restTemplate = new RestTemplate();
        String data = restTemplate.getForObject(url,String.class);
        return data;
    }
}
