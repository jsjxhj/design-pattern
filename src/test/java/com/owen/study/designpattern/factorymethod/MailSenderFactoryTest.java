package com.owen.study.designpattern.factorymethod;

import com.owen.study.designpattern.factorymethod.service.MailSender;
import com.owen.study.designpattern.factorymethod.service.Sender;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by owen on 2017/1/18.
 */
public class MailSenderFactoryTest {
    @Test
    public void testProduceSender(){
        SenderFactory senderFactory = new MailSenderFactory();
        Sender sender = senderFactory.produce();
        Assert.assertEquals(sender.getClass(), MailSender.class);
    }

}
