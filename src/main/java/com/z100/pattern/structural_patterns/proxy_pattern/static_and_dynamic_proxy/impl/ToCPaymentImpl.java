package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.impl;


import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.ToCPayment;

/**
 * @author Z100
 * @create 2022-05-18 13:15
 * @desc
 **/
public class ToCPaymentImpl implements ToCPayment {
    @Override
    public void pay() {
        System.out.println("个人支付~");
    }
}
