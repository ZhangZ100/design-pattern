package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author Z100
 * @create 2022-05-18 13:52
 * @desc cglib util
 **/
public class CglibDynamicProxyUtil {
    public static <T> T createProxy(T targetObject, MethodInterceptor methodInterceptor) {
        Object ret = Enhancer.create(targetObject.getClass(), methodInterceptor);
        return (T)ret;
    }
}
