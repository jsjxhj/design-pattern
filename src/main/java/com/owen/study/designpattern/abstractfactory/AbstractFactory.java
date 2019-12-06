package com.owen.study.designpattern.abstractfactory;

import com.owen.study.designpattern.abstractfactory.service.Receiver;
import com.owen.study.designpattern.abstractfactory.service.Sender;

/**
 * 工厂方法模式的问题是，类的创建依赖工厂类，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，
 * 抽象工厂模式可以解决这个问题，创建多个工厂类，需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
 *
 * 抽象工厂模式（Abstract AbstractFactory）：新增一个操作方式类，对应的新增一个实现该接口的工厂类，用于生产出新增的操作方式类。
 *
 * Created by owen on 2017/1/18.
 */
public interface AbstractFactory {
    /**
     * 定义生产Sender的接口
     */
    Sender produceSender();

    /**
     * 定义生产Receiver的接口
     */
    Receiver produceReceiver();
}