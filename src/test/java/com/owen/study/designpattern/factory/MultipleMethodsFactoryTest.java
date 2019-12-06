package com.owen.study.designpattern.factory;

import com.owen.study.designpattern.factory.service.MailSender;
import com.owen.study.designpattern.factory.service.Sender;
import com.owen.study.designpattern.factory.service.SmsSender;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by owen on 2017/1/18.
 */
public class MultipleMethodsFactoryTest {
    @Test
    public void testProduceMailSender(){
        MultipleMethodsFactory sendFactory = new MultipleMethodsFactory();
        Sender sender = sendFactory.produceMailSender();
        Assert.assertEquals(sender.getClass(), MailSender.class);
    }

    @Test
    public void testProduceSmsSender(){
        MultipleMethodsFactory sendFactory = new MultipleMethodsFactory();
        Sender sender = sendFactory.produceSmsSender();
        Assert.assertEquals(sender.getClass(), SmsSender.class);
    }
}
