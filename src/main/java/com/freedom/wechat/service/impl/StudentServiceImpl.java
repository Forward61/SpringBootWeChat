package com.freedom.wechat.service.impl;

import com.freedom.wechat.bean.Student;
import com.freedom.wechat.dao.BaseDao;
import com.freedom.wechat.dao.master.StudentDao;
import com.freedom.wechat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by freedom on 2019/12/8.
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    protected BaseDao<Student> getMapper() {
        return this.studentDao;
    }
}
