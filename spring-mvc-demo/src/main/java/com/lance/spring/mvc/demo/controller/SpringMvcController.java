package com.lance.spring.mvc.demo.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lance")
public class SpringMvcController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value ="/search",produces={"application/json; charset=UTF-8"})
    @ResponseBody
    public JSONObject search(@RequestParam("keyword") String keyword) {

        JSONObject resultJson = new JSONObject();

        resultJson.put("Status", "200");
        resultJson.put("Message", "查询成功");
        resultJson.put("result", keyword);


        return resultJson;

    }
}

