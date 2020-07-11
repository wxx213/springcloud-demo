package com.lynn.demo;

import com.lynn.demo.Application;
import com.lynn.demo.entity.User;
import com.lynn.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationService implements ApplicationRunner {
	@Autowired
	private UserService userService;

	@Override
    public void run(ApplicationArguments args) throws Exception {
		User user = new User();
        user.setName("lynn");
        user.setAge(10);
        try {
            userService.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
        }
	}
}
