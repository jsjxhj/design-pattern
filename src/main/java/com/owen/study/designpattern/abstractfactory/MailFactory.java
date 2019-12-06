package com.owen.study.designpattern.abstractfactory;

import com.owen.study.designpattern.abstractfactory.service.MailReceiver;
import com.owen.study.designpattern.abstractfactory.service.MailSender;
import com.owen.study.designpattern.abstractfactory.service.Receiver;
import com.owen.study.designpattern.abstractfactory.service.Sender;

/**
 * Created by owen on 2017/1/18.
 */
public class MailFactory implements AbstractFactory {
    @Override
    public Sender produceSender() {
        return new MailSender();
    }

    @Override
    public Receiver produceReceiver() {
        return new MailReceiver();
    }
}
