package com.jyd.common.service;


import com.jyd.common.model.CallResult;

/**
 * @author Jarno
 * 抽象类，将checkParam，checkBiz，finishUp进行默认实现，一些情况下，service代码无需执行所有的动作
 */
public abstract class AbstractTemplateAction<T> implements TemplateAction<T> {
    @Override
    public CallResult<T> checkParam() {
        return CallResult.success();
    }

    @Override
    public CallResult<T> checkBiz() {
        return CallResult.success();
    }

    @Override
    public void finishUp(CallResult<T> callResult) {

    }
}