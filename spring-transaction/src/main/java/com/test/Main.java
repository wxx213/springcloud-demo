package com.test;

import com.smart.dao.ForumDao;
import com.smart.domain.Forum;
import com.smart.service.ForumService1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

class Test{
    public void testForumService() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ForumService1 forumService1 = (ForumService1) ctx.getBean("forumService1");
        Forum forum = new Forum();
        forum.setForumDesc("desc");
        forum.setForumName("name");
        forumService1.addForum(forum);
        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        new Test().testForumService();
    }
}
