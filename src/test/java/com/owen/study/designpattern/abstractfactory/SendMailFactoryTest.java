package com.owen.study.designpattern.abstractfactory;

import com.owen.study.designpattern.abstractfactory.service.Sender;
import com.owen.study.designpattern.abstractfactory.service.MailSender;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by owen on 2017/1/18.
 */
public class SendMailFactoryTest {
    @Test
    public void testProduce(){
        Factory factory = new SendMailFactory();
        Sender sender = factory.produce();
        Assert.assertEquals(sender.getClass(), MailSender.class);
    }
}
