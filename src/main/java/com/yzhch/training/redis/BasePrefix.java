package com.yzhch.training.redis;

import com.fasterxml.jackson.databind.ser.Serializers;

/*
 *@author yzhch
 *@data 2020/5/14 10:28
 */
public abstract class BasePrefix implements KeyPrefix{
    private int expireSeconds;
    private String prefix;
    public BasePrefix(int expireSeconds,String prefix){
        this.expireSeconds=expireSeconds;
        this.prefix=prefix;
    }
    public BasePrefix(String prefix){this(0,prefix);}

    @Override
    public int expireSeconds() {
        return expireSeconds;
    }

    @Override
    public String getPrefix() {
        String className=getClass().getSimpleName();
        return className+":"+prefix;
    }
}
