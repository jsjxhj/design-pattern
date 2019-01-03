package com.owen.study.designpattern.templatemethod;

/**
 * 提供tea的冲泡机制
 * @Author Owen Xu
 * @Date 2018/11/30
 */
public class Tea extends RefreshBeverageAbstract {
    @Override
    protected void brew() {
        System.out.println("80度热水泡茶叶5分钟");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }
}
