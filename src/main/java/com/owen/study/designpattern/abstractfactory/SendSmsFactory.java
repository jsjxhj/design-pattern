package com.owen.study.designpattern.abstractfactory;

import com.owen.study.designpattern.abstractfactory.service.Sender;
import com.owen.study.designpattern.abstractfactory.service.SmsSender;

/**
 * Created by owen on 2017/1/18.
 */
public class SendSmsFactory implements Factory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
