package com.owen.study.designpattern.factory;

import com.owen.study.designpattern.factory.service.MailSender;
import com.owen.study.designpattern.factory.service.Sender;
import com.owen.study.designpattern.factory.service.SmsSender;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by owen on 2017/1/18.
 */
public class StaticFactoryTest {
    @Test
    public void testProduceMailSender(){
        Sender sender = StaticFactory.produceMailSender();
        Assert.assertEquals(sender.getClass(), MailSender.class);
    }

    @Test
    public void testProduceSmsSender(){
        Sender sender = StaticFactory.produceSmsSender();
        Assert.assertEquals(sender.getClass(), SmsSender.class);
    }
}
