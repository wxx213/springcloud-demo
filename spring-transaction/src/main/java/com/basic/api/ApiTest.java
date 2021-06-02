package com.basic.api;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class ApiTest {
    public void testApi(String[] args) {
        // 获取容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 容器中获取TransactionTemplate
        TransactionTemplate transactionTemplate = (TransactionTemplate) context.getBean("transactionTemplate");
        // 容器中获取数据库操作组件
        final BlogDao blogDao = (BlogDao) context.getBean("blogDao");
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            // 注意！该方法中的操作会实现事务
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus arg0) {
                BlogDo blog = new BlogDo();
                blog.setAuthor("wxx");
                blog.setTitle("wxx-title");
                blog.setContent("test");
                blogDao.insert(blog);
                int a = 1 / 0;// 发生异常，导致事务回滚，所以并不会插入任何一行数据
                blogDao.insert(blog);
            }
        });
    }
}
