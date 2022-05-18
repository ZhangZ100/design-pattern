package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.jdk_dynamic_proxy;


import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.ToBPayment;
import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.ToCPayment;
import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.impl.ToBPaymentImpl;
import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.impl.ToCPaymentImpl;

/**
 * @author Z100
 * @create 2022-05-18 13:29
 * @desc
 **/
public class JdkDynamicProxyDemo {
    public static void main(String[] args) {
        ToCPayment toCPayment = new ToCPaymentImpl();
        PaymentInvocationHandler handler1 = new PaymentInvocationHandler(toCPayment);
        ToCPayment toCPaymentProxy = JdkDynamicProxyUtil.newProxyInstance(toCPayment, handler1);
        toCPaymentProxy.pay();
        System.out.println();
        ToBPayment toBPayment = new ToBPaymentImpl();
        PaymentInvocationHandler handler2 = new PaymentInvocationHandler(toBPayment);
        ToBPayment toBPaymentProxy = JdkDynamicProxyUtil.newProxyInstance(toBPayment, handler2);
        toBPaymentProxy.pay();
    }
}
