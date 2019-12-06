package com.owen.study.designpattern.factorymethod;

import com.owen.study.designpattern.factorymethod.service.Sender;
import com.owen.study.designpattern.factorymethod.service.SmsSender;

/**
 * 生产短信发送器的工厂
 *
 * @author Owen Xu
 * @date 2019/12/6 13:39
 */
public class SmsSenderFactory implements SenderFactory {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
