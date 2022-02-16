package com.bnta.exercise.week5_wed;

public class BaiduEmailService implements EmailSender{

    @Override
    public void send(String from, String to, String message) {
        System.out.println("send email by baidu");

    }
}
