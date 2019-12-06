package com.owen.study.designpattern.abstractfactory.service;


/**
 * @author Owen Xu
 * @date 2019/12/6 12:38
 */
public class MailReceiver implements Receiver {

    @Override
    public void receive() {
        System.out.println("This is MailReceiver");
    }
}
