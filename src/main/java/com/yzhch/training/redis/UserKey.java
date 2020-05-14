package com.yzhch.training.redis;

/*
 *@author yzhch
 *@data 2020/5/14 10:37
 */
public class UserKey extends BasePrefix {
    private UserKey(String prefix) {
        super(prefix);
    }

    public static UserKey getById=new UserKey("id");
    public static UserKey getByName=new UserKey("name");
}
