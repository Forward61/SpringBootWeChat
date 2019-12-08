package com.freedom.wechat.service;

import com.freedom.wechat.bean.User;

import java.util.List;

/**
 * Created by freedom on 2019/12/8.
 */
public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    boolean updateUser(User user);


    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 根据用户名字查询用户信息
     * @param userName
     */
    User findUserByName(String userName);



    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
