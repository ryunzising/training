package com.yzhch.training.dao;

import com.yzhch.training.POJO.User;
import org.apache.ibatis.annotations.Param;

/*
 *@author yzhch
 *@data 2020/5/14 9:54
 */
public interface UserDao {
    public User getID(Integer id);
    public int insert(User user);
}
