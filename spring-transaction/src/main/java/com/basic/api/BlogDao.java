package com.basic.api;

import java.util.HashMap;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
/**
 * @theme DAO--博客
 * @author maoge
 * @date 2020-01-29
 */
public class BlogDao {
    public NamedParameterJdbcTemplate getNamedTemplate() {
        return namedTemplate;
    }
    public void setNamedTemplate(NamedParameterJdbcTemplate namedTemplate) {
        this.namedTemplate = namedTemplate;
    }
    private NamedParameterJdbcTemplate namedTemplate;
    /**
     * 新增
     */
    public void insert(BlogDo blog) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("author", blog.getAuthor());
        map.put("content", blog.getContent());
        map.put("title", blog.getTitle());
        // 注意使用:xxx占位
        namedTemplate.update("insert into blog(author,content,title)values(:author,:content,:title)", map);
    }
}
