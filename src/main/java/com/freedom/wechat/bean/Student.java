package com.freedom.wechat.bean;

import lombok.Data;

/**
 * Created by freedom on 2019/12/8.
 */
@Data
public class Student {

    /** 编号 */
    private int id;
    /** 姓名 */
    private String name;
    /** 年龄 */
    private int age;

    public Student(){
    }

}
