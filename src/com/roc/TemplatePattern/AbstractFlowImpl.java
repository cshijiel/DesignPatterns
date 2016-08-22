package com.roc.TemplatePattern;

/**
 * 一个实现类,实现需要差异化的细节步骤
 *
 * @author Roc
 * @title DesignPatterns
 * @date 16/8/22
 */
public class AbstractFlowImpl extends AbstractFlow {

    @Override
    protected void step1() {
        System.out.println("AbstractFlowImpl1#step1");

    }

    @Override
    protected int step2() {
        System.out.println("AbstractFlowImpl1#step2");
        return 0;
    }

    // 可以覆盖,但不是必须的.
    @Override
    protected void hook(String msg) {
        System.out.println("AbstractFlowImpl1#" + msg);
    }
}
