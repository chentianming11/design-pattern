package com.github.chentianming11.pattern.strategy.pay;


/**
 * 微信支付
 * @author mac
 */
public class WeChatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 100;
    }
}