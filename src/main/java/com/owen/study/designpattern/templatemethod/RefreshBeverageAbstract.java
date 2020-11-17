package com.owen.study.designpattern.templatemethod;

/**
 * 基础操作抽象父类，为所有子类提供算法框架，定义默认行为，以及特定行为接口
 *
 * @Author Owen Xu
 * @Date 2018/11/30
 */
public abstract class RefreshBeverageAbstract {
    /**
     * 模板方法，封装了所有子类共同遵循的算法框架
     */
    public final void prepareBeverageTemplate() {
        //1. 将水煮沸
        boilWater();
        //2. 泡制饮料
        brew();
        //3. 将饮料倒入杯中
        pourInCup();
        //4. 加入调味料
        addCondiments();
    }

    private void boilWater() {
        System.out.println("将水煮沸");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("将饮料倒入杯中");
    }

    protected abstract void addCondiments();
}
