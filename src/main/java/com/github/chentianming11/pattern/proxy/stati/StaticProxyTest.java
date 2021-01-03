package com.github.chentianming11.pattern.proxy.stati;

import com.github.chentianming11.pattern.proxy.Business;
import com.github.chentianming11.pattern.proxy.BusinessInterface;

/**
 * @author 陈添明
 * @date 2019/3/31
 */
public class StaticProxyTest {


    public static void main(String[] args) {
        BusinessInterface proxy = new BusinessProxy(new Business());
        proxy.execute();
    }
}
