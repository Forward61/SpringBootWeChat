package com.freedom.wechat.service.impl;

import com.freedom.wechat.bean.User;
import com.freedom.wechat.dao.BaseDao;
import com.freedom.wechat.dao.master.UserDaoD;
import com.freedom.wechat.service.UserServiceD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by freedom on 2019/12/8.
 */
@Service
public class UserServiceDImpl  extends BaseServiceImpl<User> implements UserServiceD{
    @Autowired
    private UserDaoD userDaoD2;

    @Override
    protected BaseDao<User> getMapper() {
        return this.userDaoD2;
    }


}
