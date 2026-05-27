package com.ulisses.compositiondois.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Post {

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    public Post(String title, String content) {
        this.moment = LocalDateTime.now(); // Data e hora atual
        this.title = title;
        this.content = content;
        this.likes = 0; // Inicializa com 0 curtidas
    }

    List<Comment> comments = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void likes(){
        this.likes++;
    }

    public void addComment(){

    }

    public void removeComment(){

    }

}
