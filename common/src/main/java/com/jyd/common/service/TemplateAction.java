package com.jyd.common.service;

import com.jyd.common.model.CallResult;

/**
 * @author Jarno
 * 定义模板要执行的动作
 */
public interface TemplateAction<T> {
    //第一步 检查参数
    CallResult<T> checkParam();
	//第二步 检查业务逻辑是否符合需求
    CallResult<T> checkBiz();
	//第三步 执行
    CallResult<T> doAction();
	//第四步 执行完成之后 要进行的操作
    void finishUp(CallResult<T> callResult);
}