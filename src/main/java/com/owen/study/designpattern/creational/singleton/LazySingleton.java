package com.owen.study.designpattern.creational.singleton;

/**
 * Created by owen on 2017/1/18.
 * 利用静态内部类来实现懒汉式单例
 * JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的
 */
public class LazySingleton {

    //1.私有的构造函数
    private LazySingleton() {
    }

    //2.私有的静态内部类
    private static class SingletonFactory {
        private static LazySingleton singleton = new LazySingleton();
    }

    //3.获取单例对象的静态方法
    public static LazySingleton getInstance() {
        return SingletonFactory.singleton;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致,
     * 如果没有该方法，则被反序列化出来的对象就是不同的对象，这样就不是单例了。
     *
     * @return
     */
    private Object readResolve() {
        return getInstance();
    }
}