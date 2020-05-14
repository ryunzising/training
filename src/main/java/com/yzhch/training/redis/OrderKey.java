package com.yzhch.training.redis;

/*
 *@author yzhch
 *@data 2020/5/14 10:31
 */
public class OrderKey extends BasePrefix {
    public OrderKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
}