package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.static_proxy;


import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.ToBPayment;
import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.ToCPayment;
import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.impl.ToBPaymentImpl;
import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.impl.ToCPaymentImpl;

/**
 * @author Z100
 * @create 2022-05-18 13:17
 * @desc
 **/
public class StaticProxyDemo {
    public static void main(String[] args) {
        ToCPayment toCPaymentProxy = new ToCPaymentProxy(new ToCPaymentImpl());
        ToBPayment toBPaymentProxy = new ToBPaymentProxy(new ToBPaymentImpl());

        toCPaymentProxy.pay();
        System.out.println();
        toBPaymentProxy.pay();
    }
}
