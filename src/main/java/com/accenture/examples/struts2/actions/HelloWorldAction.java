package com.accenture.examples.struts2.actions;

import com.accenture.examples.struts2.models.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private static final long serialVersionUID = -4505070261254050092L;

    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore();

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}