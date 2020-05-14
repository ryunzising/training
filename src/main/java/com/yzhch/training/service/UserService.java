package com.yzhch.training.service;

import com.yzhch.training.POJO.User;
import com.yzhch.training.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/*
 *@author yzhch
 *@data 2020/5/14 10:12
 */
public class UserService {
    @Resource
    UserDao userDao;
    public User getById(int id){return userDao.getID(id);}

    @Transactional
    public boolean tx(){
        User u1=new User();
        u1.setName("cas");

        userDao.insert(u1);
        return true;
    }
}
