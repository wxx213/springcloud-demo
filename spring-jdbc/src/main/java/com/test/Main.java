package com.test;

import com.basic.api.ApiTest;
import com.smart.dao.ForumDao;
import com.smart.domain.Forum;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

class Test {
    public void testAddForum() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ForumDao forumDao = (ForumDao) ctx.getBean("forumDao");

        Forum forum = new Forum();
        forum.setForumName("1二手市场");
        forum.setForumDesc("1二手货物的交流论坛。");
        forumDao.addForum(forum);
        System.out.println("wxx id: "+ forum.getForumId());
        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // new Test().testAddForum();
        new ApiTest().testApi();
    }
}
