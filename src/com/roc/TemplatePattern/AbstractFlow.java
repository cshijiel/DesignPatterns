package com.roc.TemplatePattern;

/**
 * 抽象基类,定义了一些没有实现的细节步骤和共同的流程信息
 *
 * @author Roc
 * @title DesignPatterns
 * @date 16/8/22
 */
public abstract class AbstractFlow {

    // 延迟到子类实现的一个步骤, 权限访问符是protected,不对外公开,可被子类修改.
    // abstract强制子类实现
    protected abstract void step1();

    protected abstract int step2();

    // hook,钩子,可以做一些额外的处理.通常基类有一个空实现.不是必须的.
    protected void hook(String msg) {
        System.out.println("AbstractFlow#" + msg);
    }

    // 对外公开的执行方法,里面是流程详细步骤的组合.
    public void exe() {
        System.out.println("do some thing");
        step1();
        step2();
        hook("Hello");
        System.out.println("do some thing finish!");
    }
}
