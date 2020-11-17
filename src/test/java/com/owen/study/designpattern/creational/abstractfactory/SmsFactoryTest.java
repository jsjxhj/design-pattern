package com.owen.study.designpattern.creational.abstractfactory;

import com.owen.study.designpattern.creational.abstractfactory.service.Receiver;
import com.owen.study.designpattern.creational.abstractfactory.service.Sender;
import com.owen.study.designpattern.creational.abstractfactory.service.SmsReceiver;
import com.owen.study.designpattern.creational.abstractfactory.service.SmsSender;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by owen on 2017/1/18.
 */
public class SmsFactoryTest {
    @Test
    public void testProduceSender() {
        AbstractFactory abstractFactory = new SmsFactory();
        Sender sender = abstractFactory.produceSender();
        Assert.assertEquals(sender.getClass(), SmsSender.class);
    }

    @Test
    public void testProduceReceiver() {
        AbstractFactory abstractFactory = new SmsFactory();
        Receiver receiver = abstractFactory.produceReceiver();
        Assert.assertEquals(receiver.getClass(), SmsReceiver.class);
    }
}
