package com.bliss.csc.chatapp;

public class ChatData {

    //message, nickname, isMine - Data Transfer Object : 데이터 전달 객체
    private String msg;
    private String nickname;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
