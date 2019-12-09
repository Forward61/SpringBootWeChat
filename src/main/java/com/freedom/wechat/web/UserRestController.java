package com.freedom.wechat.web;

import com.freedom.wechat.bean.User;
import com.freedom.wechat.service.UserServiceD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by freedom on 2019/12/8.
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {
    @Autowired
    private UserServiceD userService;

//    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
//    public boolean addUser( User user) {
//        System.out.println("开始新增...");
//        return userService.addUser(user);
//    }
//
//    @RequestMapping(value = "/user", method = RequestMethod.PUT)
//    public boolean updateUser( User user) {
//        System.out.println("开始更新...");
//        return userService.updateUser(user);
//    }
//
//    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
//    public boolean delete(@RequestParam(value = "userName", required = true) int userId) {
//        System.out.println("开始删除...");
//        return userService.deleteUser(userId);
//    }
//
//
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    public User findByUserName(@RequestParam(value = "userName", required = true) String userName) {
//        System.out.println("开始查询...");
//        return userService.findUserByName(userName);
//    }




    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> findByUser(User user) {
        System.out.println("开始查询...");
        return userService.findByListEntity(user);
    }
//    @RequestMapping(value = "/userA", method = RequestMethod.GET)
//    public List<User> findByUserAge() {
//        System.out.println("开始查询所有数据...");
//        return userService.findAll();
//    }
}
