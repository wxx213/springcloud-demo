package com.basic.api;

/**
 * @theme 数据对象--博客
 * @author maoge
 * @date 2020-01-27
 */
public class BlogDo {
    private Long id;
    private String title;
    private String author;
    private String content;
    // 省略get set

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
