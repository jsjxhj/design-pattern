package com.owen.study.designpattern.abstractfactory;

import com.owen.study.designpattern.abstractfactory.service.Receiver;
import com.owen.study.designpattern.abstractfactory.service.Sender;
import com.owen.study.designpattern.abstractfactory.service.SmsReceiver;
import com.owen.study.designpattern.abstractfactory.service.SmsSender;

/**
 * Created by owen on 2017/1/18.
 */
public class SmsFactory implements AbstractFactory {
    @Override
    public Sender produceSender() {
        return new SmsSender();
    }

    @Override
    public Receiver produceReceiver() {
        return new SmsReceiver();
    }
}
