package com.owen.study.designpattern.factory;

import com.owen.study.designpattern.factory.service.MailSender;
import com.owen.study.designpattern.factory.service.Sender;
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
