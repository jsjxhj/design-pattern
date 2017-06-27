package com.owen.study.designpattern.singleton;

/**
 * 单例模式，其实就是确保静态工厂方法只创建一个实例
 * 饥饿式单例
 * Created by owen on 2017/1/18.
 */
public class EagerSingleton {
    //1.私有的构造函数
    private EagerSingleton(){}

    //2.私有的静态成员变量
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    //3.获取单例对象的静态方法
    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}