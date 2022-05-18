package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.static_proxy;


import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.ToBPayment;

/**
 * @author Z100
 * @create 2022-05-18 13:19
 * @desc
 **/
public class ToBPaymentProxy implements ToBPayment {
    private ToBPayment toBPayment;

    public ToBPaymentProxy(ToBPayment toBPayment) {
        this.toBPayment = toBPayment;
    }

    @Override
    public void pay() {
        before();
        toBPayment.pay();
        after();
    }

    private void before() {
        System.out.println("从招行取款");
    }

    private void after() {
        System.out.println("支付给商家");
    }
}
