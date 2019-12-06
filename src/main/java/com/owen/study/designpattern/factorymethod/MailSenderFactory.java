package com.owen.study.designpattern.factorymethod;

import com.owen.study.designpattern.factorymethod.service.MailSender;
import com.owen.study.designpattern.factorymethod.service.Sender;

/**
 * 生产邮件发送器的工厂
 *
 * @author Owen Xu
 * @date 2019/12/6 13:36
 */
public class MailSenderFactory implements SenderFactory {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
