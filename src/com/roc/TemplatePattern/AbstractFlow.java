package com.roc.TemplatePattern;

/**
 * @author chenpeng19@baidu.com
 * @version 1.0
 * @title DesignPatterns
 * @date 16/8/22
 */
public abstract class AbstractFlow {
    protected abstract void step1();

    protected abstract int step2();

    protected abstract void hook(String msg);

    public void exe() {
        System.out.println("do some thing");
        step1();
        step2();
        hook("Hello");
        System.out.println("do some thing finish!");
    }
}
