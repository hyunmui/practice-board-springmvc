package com.flexibledev.practice_board.entity;

import java.time.LocalDateTime;

public class Post {

    private int id;
    private String title;
    private String content;
    private String author;
    private String thumbnailUrl;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    public Post() {
    }

    public Post(int id, String title, String content, String author, String thumbnailUrl, LocalDateTime createdDateTime,
                LocalDateTime updatedDateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.thumbnailUrl = thumbnailUrl;
        this.createdDateTime = createdDateTime;
        this.updatedDateTime = updatedDateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getThumbnailUrl() {
        return !thumbnailUrl.isEmpty() ? thumbnailUrl : "/dist/images/blank_thumbnail.png";
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

}
