package com.ruiqiang.sp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/page")
public class HelloPageController {

    @RequestMapping("hello")
    public String sayHello(ModelMap map){
        Map<String, String> attr = new HashMap<>();
        attr.put("word","你好,中国!");
        map.addAllAttributes(attr);

        return "hello";
    }
}
