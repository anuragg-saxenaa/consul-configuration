package com.arrayindex.consulconfiguration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppContoller {

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/test")
    String getValue(){
        return appConfig.getName();
    }
}
