package com.lynn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController{

    @RequestMapping("hello")
    String hello() {
        return "Hello World!";
    }

	 /**
     * 测试接收json数据
     * */
    @RequestMapping(value = "/jsonData", method = RequestMethod.POST)
    public String jsonData(@RequestBody TestModel tm){
        String result = "receive name = "+tm.getName()+" age = "+tm.getAge();
        System.out.println(result);
        return result;
    }


}
