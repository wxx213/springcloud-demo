package com.basic.api;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;
import org.apache.commons.dbcp.BasicDataSource;
/**
 * Spring配置类
 */
@Configuration
public class SpringConfig {
    /**
     * 定义数据源bean
     */
    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/sampledb");
        dataSource.setUsername("root");
        dataSource.setPassword("wxx123");
        return dataSource;
    }
    /**
     * 定义事务管理bean
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());// 注入dataSource
        return transactionManager;
    }
    /**
     * 定义TransactionTemplate类型的bean
     */
    @Bean
    public TransactionTemplate transactionTemplate() {
        TransactionTemplate transactionTemplate=new TransactionTemplate();
        transactionTemplate.setTransactionManager(transactionManager());//注入事务管理器
        return transactionTemplate;
    }
    /**
     * 配置namedParameterJdbcTemplate组件
     */
    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource());// 注入dataSource
        return template;
    }
    /**
     * 为BlogDao注册bean
     */
    @Bean
    public BlogDao blogDao() {
        BlogDao blogDao = new BlogDao();
        blogDao.setNamedTemplate(namedParameterJdbcTemplate());// 注入namedParameterJdbcTemplate
        return blogDao;
    }
}

