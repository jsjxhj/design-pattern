package com.owen.study.designpattern.abstractfactory;

import com.owen.study.designpattern.abstractfactory.service.MailSender;
import com.owen.study.designpattern.abstractfactory.service.Sender;

/**
 * Created by owen on 2017/1/18.
 */
public class SendMailFactory implements Factory {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
