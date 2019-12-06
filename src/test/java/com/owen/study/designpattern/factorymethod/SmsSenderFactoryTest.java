package com.owen.study.designpattern.factorymethod;

import com.owen.study.designpattern.factorymethod.service.Sender;
import com.owen.study.designpattern.factorymethod.service.SmsSender;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by owen on 2017/1/18.
 */
public class SmsSenderFactoryTest {
    @Test
    public void testProduceSender(){
        SenderFactory senderFactory = new SmsSenderFactory();
        Sender sender = senderFactory.produce();
        Assert.assertEquals(sender.getClass(), SmsSender.class);
    }

}