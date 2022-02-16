package com.bnta.exercise.week5_wed;

public class YahooEmailService implements EmailSender{

    @Override
    public void send(String from, String to, String message) {
        System.out.println("send email by Yahoo");
    }
}
