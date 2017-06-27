package com.owen.study.designpattern.abstractfactory;

import com.owen.study.designpattern.abstractfactory.service.Sender;
import com.owen.study.designpattern.abstractfactory.service.SmsSender;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by owen on 2017/1/18.
 */
public class SendSmsFactoryTest {
    @Test
    public void testProduce(){
        Factory factory = new SendSmsFactory();
        Sender sender = factory.produce();
        Assert.assertEquals(sender.getClass(), SmsSender.class);
    }
}
