package com.sz.ucar.责任链模式;

/**
 * 抽象执行者
 */
public abstract class Handler {

    /**
     * 责任链模式的基本特征：
     * 上一个处理对象必须含有下一个处理对象的引用，形成一个单向链表
     */
    private Handler next;

    
    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }
    /**
     * 执行or调用下一个执行者
     */
    public final void handle(Trouble trouble) {
        if(resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.handle(trouble);
        } else {
            fail(trouble);
        }
    }
    protected abstract String getName();

    /**
     * 由子类实现
     * @return 返回是否满足执行条件
     */
    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble) {
        System.out.println("[事件 "+trouble.getNumber()+" ]" + " 被 [" + this.getName() + "] 处理了");
    }
    protected void fail(Trouble trouble) {  // 未解决
        System.out.println("[事件 "+trouble.getNumber()+" ]" + " 不能处理");
    }
}