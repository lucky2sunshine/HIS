package com.ysu.pojo;

public class Website {
    int id;
    String name;
    String url;
    int alexa;
    String country;

    public Website(int id, String name, String url, int alexa, String country) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.alexa = alexa;
        this.country = country;
    }

    public Website(){

    }

    @Override
    public String toString() {
        return "Website{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", alexa=" + alexa +
                ", country='" + country + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAlexa() {
        return alexa;
    }

    public void setAlexa(int alexa) {
        this.alexa = alexa;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

