package com.yzhch.training.redis;

public interface KeyPrefix {
    public int expireSeconds();
    public String getPrefix();
}
