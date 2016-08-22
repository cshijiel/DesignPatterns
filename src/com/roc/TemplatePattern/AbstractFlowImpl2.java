package com.roc.TemplatePattern;

/**
 * 另一个实现类,实现需要差异化的细节步骤
 *
 * @author Roc
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
}
