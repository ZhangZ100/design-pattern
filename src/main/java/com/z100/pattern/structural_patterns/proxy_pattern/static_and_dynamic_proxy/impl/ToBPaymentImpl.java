package com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.impl;


import com.z100.pattern.structural_patterns.proxy_pattern.static_and_dynamic_proxy.ToBPayment;

/**
 * @author Z100
 * @create 2022-05-18 13:16
 * @desc
 **/
public class ToBPaymentImpl implements ToBPayment {
    @Override
    public void pay() {
        System.out.println("以公司名义支付~");
    }
}
