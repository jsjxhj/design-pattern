package com.owen.study.designpattern.creational.factorymethod;

import com.owen.study.designpattern.creational.factorymethod.service.MailSender;
import com.owen.study.designpattern.creational.factorymethod.service.Sender;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by owen on 2017/1/18.
 */
public class CommonFactoryTest {
    @Test
    public void testProduce() {
        CommonFactory factory = new CommonFactory();
        Sender sender = factory.produce("mail");
        Assert.assertEquals(sender.getClass(), MailSender.class);
    }
}
