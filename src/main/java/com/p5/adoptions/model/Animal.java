package com.p5.adoptions.model;

public  class Animal {

    private String name;
    private String photoUrl;

    public Animal(){

    }

    public Animal(String name, String photoUrl) {
        this.name = name;
        this.photoUrl = photoUrl;
    }

    public void speak(){
        System.out.println("Animal speaks!");
    }

    protected void walk(){
        System.out.println("Animal walks!");
    }

    public String getName() {
        return name;
    }

    public Animal setName(String newName) {
        this.name = newName;
        return this;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public Animal setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        return this;
    }
}
