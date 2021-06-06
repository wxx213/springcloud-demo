package com.basic.api;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class ApiTest {
    private DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/sampledb");
        dataSource.setUsername("root");
        dataSource.setPassword("wxx123");
        return dataSource;
    }

    private JdbcTemplate jdbcTemplate() {
        JdbcTemplate template = new JdbcTemplate(dataSource());// 注入dataSource
        return template;
    }

    public void testApi() {
        ForumDao forumDao = new ForumDao();
        forumDao.setJdbcTemplate(jdbcTemplate());
        Forum forum = new Forum();
        forum.setForumName("wxx1");
        forum.setForumDesc("wxx2");
        forumDao.addForum(forum);
    }
}
