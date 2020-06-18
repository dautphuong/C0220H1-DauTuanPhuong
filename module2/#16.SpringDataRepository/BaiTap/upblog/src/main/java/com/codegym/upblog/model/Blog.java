package com.codegym.upblog.model;

import javax.persistence.*;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String theme;
    private String content;
    private String author;
    private String date;

    //khoa ngoai
    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Blog() {
    }

    public Blog(String theme, String content, String author, String date) {
        this.theme = theme;
        this.content = content;
        this.author = author;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
