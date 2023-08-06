package com.example.javaeetest.mysql.business;

public class Message {

    private static final long serialVersionUID = 1L;

    private int id;
    private String description;
    private int someNumber;

    public Message() {
    }

    public Message(String description, int someNumber) {

        this.description = description;
        this.someNumber = someNumber;
    }

    public Message(int id, String description, int someNumber) {

        this.id = id;
        this.description = description;
        this.someNumber = someNumber;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(int someNumber) {
        this.someNumber = someNumber;
    }
}
