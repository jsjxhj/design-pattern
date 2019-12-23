package com.owen.study.designpattern.creational.abstractfactory;

import com.owen.study.designpattern.creational.abstractfactory.service.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by owen on 2017/1/18.
 */
public class MailFactoryTest {
    @Test
    public void testProduceSender(){
        AbstractFactory abstractFactory = new MailFactory();
        Sender sender = abstractFactory.produceSender();
        Assert.assertEquals(sender.getClass(), MailSender.class);
    }

    @Test
    public void testProduceReceiver(){
        AbstractFactory abstractFactory = new MailFactory();
        Receiver receiver = abstractFactory.produceReceiver();
        Assert.assertEquals(receiver.getClass(), MailReceiver.class);
    }
}
