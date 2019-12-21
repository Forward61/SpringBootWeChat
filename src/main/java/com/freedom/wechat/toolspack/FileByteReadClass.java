package com.freedom.wechat.toolspack;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by freedom on 2019/12/21.
 */
public class FileByteReadClass {

    public static String [] readToString(String filePath){
        File file = new File(filePath);
        Long fileLength = file.length();
        byte [] fileContent = new byte[fileLength.intValue()];

        try {
            FileInputStream in  = new FileInputStream(file);
            in.read(fileContent);
            in.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        String [] fileContentArr = new String(fileContent).split("\r\n");
        return fileContentArr;

    }
}
