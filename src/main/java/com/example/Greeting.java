package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {

    private long id;
    private String content;

    public Greeting () {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


//    public Greeting(long id, String content) {
//        this.id = id;
//        this.content = content;
//    }


    @Override
    public String toString() {
        return "Greeting{" +
                "id='" + id + '\'' +
                ", content=" + content +
                '}';
    }
}