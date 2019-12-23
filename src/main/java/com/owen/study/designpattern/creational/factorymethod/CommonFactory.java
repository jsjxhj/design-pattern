package com.owen.study.designpattern.creational.factorymethod;


import com.owen.study.designpattern.creational.factorymethod.service.MailSender;
import com.owen.study.designpattern.creational.factorymethod.service.Sender;
import com.owen.study.designpattern.creational.factorymethod.service.SmsSender;

/**
 * 普通工厂模式: 建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 *
 * Created by owen on 2017/1/18.
 */
public class CommonFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
