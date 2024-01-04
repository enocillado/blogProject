package com.blog.blog.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Getter
@Entity
public class Post {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String content;
    private Integer authorId;
    private Integer numberOfLikes;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public void setNumberOfLikes(Integer numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public Post(int id, String title, String content, Integer authorId, Integer numberOfLikes) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.numberOfLikes = numberOfLikes;
    }

    public Post() {
        super();
    }



    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", authorId='" + authorId + '\'' +
                ", numberOfLikes='" + numberOfLikes + '\'' +
                '}';
    }

}
