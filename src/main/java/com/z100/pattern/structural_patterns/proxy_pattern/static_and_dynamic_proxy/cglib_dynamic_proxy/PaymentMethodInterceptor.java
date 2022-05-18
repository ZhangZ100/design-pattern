package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.cglib_dynamic_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Z100
 * @create 2022-05-18 13:49
 * @desc
 **/
public class PaymentMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
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
