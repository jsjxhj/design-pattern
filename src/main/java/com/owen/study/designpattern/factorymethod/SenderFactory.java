package com.owen.study.designpattern.factorymethod;

import com.owen.study.designpattern.factorymethod.service.Sender;

/**
 * 工厂的接口类, 用于定义工厂要提供的产品
 *
 * 本接口定义生产发送器
 *
 * @author Owen Xu
 * @date 2019/12/6 13:30
 */
public interface SenderFactory {
    Sender produce();
}
