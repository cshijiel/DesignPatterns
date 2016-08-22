package com.roc.TemplatePattern;

/**
 * @author chenpeng19@baidu.com
 * @version 1.0
 * @title DesignPatterns
 * @date 16/8/22
 */
public class Client {
    public static void main(String[] as) {
        AbstractFlow flow = new AbstractFlowImpl() ;
        flow.exe();
        flow = new AbstractFlowImpl2() ;
        flow.exe();
    }
}
