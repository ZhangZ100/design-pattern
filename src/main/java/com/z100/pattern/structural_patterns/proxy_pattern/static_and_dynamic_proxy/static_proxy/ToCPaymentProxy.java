package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.static_proxy;


import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.ToCPayment;

/**
 * @author Z100
 * @create 2022-05-18 13:17
 * @desc
 **/
public class ToCPaymentProxy implements ToCPayment {
    private ToCPayment toCPayment;
    public ToCPaymentProxy(ToCPayment toCPayment){
        this.toCPayment=toCPayment;
    }

    @Override
    public void pay(){
        before();
        toCPayment.pay();
        after();
    }

    private void before(){
        System.out.println("从招行取款");
    }
    private void after(){
        System.out.println("支付给商家");
    }

}
