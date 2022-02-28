package com.bnta.exercise.week5_wed;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender= new GmailEmailService();
        EmailService emailService = new EmailService(emailSender);
        emailService.sendEmail("222","111","222");

    }
}
