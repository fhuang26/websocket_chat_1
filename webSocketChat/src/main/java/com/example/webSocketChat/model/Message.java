package com.example.webSocketChat.model;

import com.alibaba.fastjson.JSON;

public class Message {
    public static final String ENTER = "ENTER";
    public static final String SPEAK = "SPEAK";
    public static final String QUIT = "QUIT";

    private String username;
    private String message;
    private String type;
    private int onlineCount;

    public Message() {}

    public Message(String username, String message, String type, int onlineCount) {
        this.username = username;
        this.message = message;
        this.type = type;
        this.onlineCount = onlineCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public int getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
    }

    public static String jsonStr(String username, String msg, String type, int onlineTotal) {
        return JSON.toJSONString(new Message(username, msg, type, onlineTotal));
    }

}
