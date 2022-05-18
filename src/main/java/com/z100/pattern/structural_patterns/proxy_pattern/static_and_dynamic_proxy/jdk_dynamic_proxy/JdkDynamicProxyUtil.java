package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Z100
 * @create 2022-05-18 13:26
 * @desc
 **/
public class JdkDynamicProxyUtil {
    public static <T> T newProxyInstance(T targetObject, InvocationHandler invocationHandler) {
        ClassLoader classLoader = targetObject.getClass().getClassLoader();
        Class<?>[] interfaces = targetObject.getClass().getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
