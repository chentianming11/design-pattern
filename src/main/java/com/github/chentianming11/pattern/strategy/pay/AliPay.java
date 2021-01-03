package com.github.chentianming11.pattern.strategy.pay;


/**
 * 支付宝支付
 * @author mac
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}