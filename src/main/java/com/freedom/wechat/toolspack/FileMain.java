package com.freedom.wechat.toolspack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by freedom on 2019/12/21.
 */
public class FileMain {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();

        FilereadLineClass filereadLineClass = new FilereadLineClass();
        stringList = FilereadLineClass.readTextFileIntoStringArray("/Users/ningli/Downloads/root.txt");
        for (String str : stringList){
            System.out.println(">>>> " + str +" <<<<<");
        }


        String[] stringArr = FileByteReadClass.readToString("/Users/ningli/Downloads/root.txt");

        for (int i = 0; i < stringArr.length; i++){
            System.out.println(stringArr[i]);
        }

    }
}
