package com.bnta.exercise.week5_wed;

public class EmailService {

    private EmailSender emailSender;
    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendEmail(String from, String to,String message){
        if (from.isBlank()||to.isBlank()||message.isBlank()){
            throw new IllegalStateException("cannot be blank");
        }
        emailSender.send(from,to,message);
    }







}
