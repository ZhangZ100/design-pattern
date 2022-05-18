package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.cglib_dynamic_proxy;

import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.ToCPayment;
import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.impl.ToCPaymentImpl;
import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.jdk_dynamic_proxy.JdkDynamicProxyUtil;
import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.jdk_dynamic_proxy.PaymentInvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author Z100
 * @create 2022-05-18 13:57
 * @desc
 **/
public class CglibDynamicProxyDemo {
    public static void main(String[] args) {
//        CommonPayment commonPayment = new CommonPayment();
//        PaymentInvocationHandler handler = new PaymentInvocationHandler(commonPayment);
//        CommonPayment proxy1 = JdkDynamicProxyUtil.newProxyInstance(commonPayment, handler);
//        proxy1.pay();

        /**
         * Exception in thread "main" java.lang.ClassCastException:
         * com.sun.proxy.$Proxy0 cannot be cast to
         *
         * com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy
         * .cglib_dynamic_proxy.CommonPayment
         */

        /**
         * 说明JDK动态代理是 让代理类“实现” 和 被代理类同样的接口，来替代被代理类的
         * 如果被代理类没有实现任何接口，则无法使用JDK动态代理
         */

        MethodInterceptor methodInterceptor = new PaymentMethodInterceptor();

        CommonPayment commonPayment = new CommonPayment();
        CommonPayment commonPaymentProxy = CglibDynamicProxyUtil.createProxy(commonPayment, methodInterceptor);
        commonPaymentProxy.pay();

        System.out.println();

        ToCPayment toCPayment = new ToCPaymentImpl();
        ToCPayment toCPaymentProxy = CglibDynamicProxyUtil.createProxy(toCPayment, methodInterceptor);
        toCPaymentProxy.pay();

    }
}
