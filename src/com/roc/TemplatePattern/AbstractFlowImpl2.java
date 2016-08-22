package com.roc.TemplatePattern;

/**
 * @author chenpeng19@baidu.com
 * @version 1.0
 * @title DesignPatterns
 * @date 16/8/22
 */
public class AbstractFlowImpl2 extends AbstractFlow {
    @Override
    protected void step1() {
        System.out.println("AbstractFlowImpl2#step1");

    }

    @Override
    protected int step2() {
        System.out.println("AbstractFlowImpl2#step2");
        return 0;
    }

    @Override
    protected void hook(String msg) {
        System.out.println("AbstractFlowImpl2#" + msg);
    }
}