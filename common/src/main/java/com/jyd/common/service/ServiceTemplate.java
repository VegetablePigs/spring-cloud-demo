package com.jyd.common.service;

import com.jyd.common.model.CallResult;

/**
 * @author Jarno
 */
public interface ServiceTemplate {


    /**
     * run in  datasource and execute Transaction
     * @param action
     * @param <T>
     * @return
     */
    <T> CallResult<T> execute(TemplateAction<T> action);

    /**
     * run in  datasource and not execute Transaction
     * @param action
     * @param <T>
     * @return
     */
    <T> CallResult<T> executeQuery(TemplateAction<T> action);
}