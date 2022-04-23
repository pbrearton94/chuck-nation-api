package com.chuck.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Jokes")
public class Joke {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "joke")
    private String joke;

    @Column(name = "published")
    private Boolean published;

    @Column(name = "published_by")
    private String publishedBy;

    public Joke(String joke, Boolean published, String publishedBy){
        this.joke = joke;
        this.published = published;
        this.publishedBy = publishedBy;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getJoke(){
        return joke;
    }

    public void setJoke(String joke){
        this.joke = joke;
    }

    public Boolean getPublished(){
        return published;
    }

    public void setPublished(Boolean published){
        this.published = published;
    }

    public String getPublishedBy(){
        return publishedBy;
    }

    public void setPublishedBy(String publishedBy){
        this.publishedBy = publishedBy;
    }

    @Override
    public String toString(){
        return "Joke [id= " + id + ", published= " + published + ", publishedBy= " + publishedBy + "]";
    }
    
}
