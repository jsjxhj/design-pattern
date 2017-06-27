package com.owen.study.designpattern.factorymethod;

import com.owen.study.designpattern.factorymethod.service.MailSender;
import com.owen.study.designpattern.factorymethod.service.Sender;
import com.owen.study.designpattern.factorymethod.service.SmsSender;

/**
 * 静态工厂方法模式: 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 * 大多数情况，我们会选择静态工厂这种工厂方法模式
 *
 * Created by owen on 2017/1/18.
 */
public class StaticFactory {
    public static Sender produceMailSender() {
        return new MailSender();
    }

    public static Sender produceSmsSender() {
        return new SmsSender();
    }
}
