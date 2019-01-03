package com.owen.study.designpattern.templatemethod;

/**
 * 提供咖啡的冲制方法
 * @Author Owen Xu
 * @Date 2018/11/30
 */
public class Coffee extends RefreshBeverageAbstract {
    @Override
    protected void brew() {
        System.out.println("沸水冲泡coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
