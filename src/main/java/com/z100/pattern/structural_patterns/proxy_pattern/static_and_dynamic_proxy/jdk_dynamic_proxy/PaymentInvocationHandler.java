package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Z100
 * @create 2022-05-18 13:23
 * @desc 相当于 Aspect 切面类
 **/
public class PaymentInvocationHandler implements InvocationHandler {
    private Object targetObject;

    public PaymentInvocationHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(targetObject, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("从招行取款");
    }

    private void after() {
        System.out.println("支付给商家");
    }
}
