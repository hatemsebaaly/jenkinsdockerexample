package com.hatem.websocketdemo;

public class NameMessage {

    private String name;

    public NameMessage() {
    }

    public NameMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}