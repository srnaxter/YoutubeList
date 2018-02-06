package com.example.marco.rssyoutube.model;

/**
 * Created by marco on 3/02/18.
 */

public class Videos {
    private String title;
    private String author;
    private String image;
    private String views;
    private String id;

    // Constructores

    public Videos() {
    }

    public Videos(String title, String author, String views) {
        this.title = title;
        this.author = author;
        this.views = views;
    }

    public Videos(String title, String author, String image, String views, String id) {
        this.title = title;
        this.author = author;
        this.image = image;
        this.views = views;
        this.id = id;
    }

    // Accesores


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getTitle() + ": " + getAuthor() + ". " + getViews();
    }
}
