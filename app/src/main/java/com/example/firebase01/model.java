package com.example.firebase01;

public class model{
    String email,name,origin,purl;

    public model() {
    }

    public model(String email, String name, String origin, String purl) {
        this.email = email;
        this.name = name;
        this.origin = origin;
        this.purl = purl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}





