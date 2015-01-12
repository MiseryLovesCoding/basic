package com.misery.smart.base;

/**
 * 控制层 基类
 * @author meng.wang
 */
public abstract class BaseController {
    
    /**
     * 作用：通用异常类
     * meng.wang
     * 2015-1-12 下午5:40:13
     */
    protected void exception(Exception e){
        e.printStackTrace();
    }
}
