package com.owen.study.designpattern.creational.factorymethod;

import com.owen.study.designpattern.creational.factorymethod.service.MailSender;
import com.owen.study.designpattern.creational.factorymethod.service.Sender;
import com.owen.study.designpattern.creational.factorymethod.service.SmsSender;

/**
 * 多个方法工厂模式: 对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个方法工厂模式是提供多个方法给工厂类，分别创建对象
 * <p>
 * Created by owen on 2017/1/18.
 */
public class MultipleMethodsFactory {
    public Sender produceMailSender() {
        return new MailSender();
    }

    public Sender produceSmsSender() {
        return new SmsSender();
    }
}
