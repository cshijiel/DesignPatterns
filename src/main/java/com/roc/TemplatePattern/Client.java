package com.roc.TemplatePattern;

/**
 * 执行入口
 *
 * @author Roc
 * @title DesignPatterns
 * @date 16/8/22
 */
public class Client {
    public static void main(String[] as) {
        AbstractFlow flow = new AbstractFlowImpl();
        flow.exe();

        System.out.println("\n==========================\n");

        flow = new AnotherAbstractFlowImpl();
        flow.exe();
    }
}
