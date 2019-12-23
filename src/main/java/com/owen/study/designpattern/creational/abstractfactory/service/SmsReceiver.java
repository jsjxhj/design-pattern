package com.owen.study.designpattern.creational.abstractfactory.service;

/**
 * @author Owen Xu
 * @date 2019/12/6 12:40
 */
public class SmsReceiver implements Receiver {

    @Override
    public void receive() {
        System.out.println("This is SmsReceiver");
    }
}
