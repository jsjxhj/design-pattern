package com.owen.study.designpattern.factory.service;

/**
 * Created by owen on 2017/1/18.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is mailSender");
    }
}