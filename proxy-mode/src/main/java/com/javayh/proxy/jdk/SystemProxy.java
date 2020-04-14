package com.javayh.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>
 * 代理
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-12 14:23
 */
public class SystemProxy<T> implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理!");
        return null;
    }

}
