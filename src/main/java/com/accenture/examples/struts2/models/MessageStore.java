package com.accenture.examples.struts2.models;

public class MessageStore {
    private String message;

    public MessageStore() {
        message = "Hello world from Accenture!";
    }

    public String getMessage() {
        return message;
    }
}