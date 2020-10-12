package com.lynn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Thread;

@RestController
public class HelloController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index(){
	try {
		Thread.sleep(1000000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

        return "Hello World!,端口："+port;
    }
}
