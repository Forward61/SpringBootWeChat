package com.freedom.wechat.toolspack;


import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Created by freedom on 2019/12/4.
 */
public class BeansUtils {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Students students = new Students();
        BeanUtils.setProperty(students, "name","name");
        BeanUtils.setProperty(students, "password", "password1");
        System.out.println(students.getName() + "  " + students.getPassword() );

        try {
            Map<String,String > map = BeanUtils.describe(students);
            for (String key:map.keySet()){
                System.out.println("map   " + key + map.get(key));
            }

            map.put("name", "mapName");
            BeanUtils.populate(students,map);
            System.out.println("convert " + students.getName());

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }


}
