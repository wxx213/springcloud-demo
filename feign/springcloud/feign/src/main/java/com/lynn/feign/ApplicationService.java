package com.lynn.feign;

import com.lynn.feign.ApiService;
import com.lynn.feign.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationService implements ApplicationRunner {
	@Autowired
    private ApiService apiService;

	@Override
    public void run(ApplicationArguments args) throws Exception {
		try {
            System.out.println("This is in ApplicationRunner1 : " + apiService.index());
			System.out.println("This is in ApplicationRunner2 : " + apiService.index());
        }catch (Exception e){
            e.printStackTrace();
        }
	}
}
