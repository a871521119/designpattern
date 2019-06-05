package com.sz.ucar.责任链模式;

/**
 * 责任链执行代码
 */
public class HelloChain {
    public static void main(String[] args) {
        //创建责任链
        Handler handlerStart = makeChain();

        //让责任链处理小于50的整数
        for (int i = 0; i < 50; i = i + 3) {
            //调用第一个执行者开始执行
            handlerStart.handle(new Trouble(i));
        }

    }

    /**
     * 创建并返回责任链
     */
    public static Handler makeChain() {
        Handler handlerStart = new HandlerStart();
        Handler handler10 = new Handler10();
        Handler handler20 = new Handler20();
        Handler handler30 = new Handler30();
        Handler handler45 = new Handler45();

        handlerStart.setNext(handler10).setNext(handler20).setNext(handler30).setNext(handler45);

        return handlerStart;
    }


}
