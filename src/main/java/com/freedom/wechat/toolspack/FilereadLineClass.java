package com.freedom.wechat.toolspack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by freedom on 2019/12/21.
 */
public class FilereadLineClass {


    public static List<String> readTextFileIntoStringArray(String filePath){

        ArrayList<String> list = new ArrayList<String>();

        try{
            String encoding = "UTF-8";
            File file = new File(filePath);
            if(file.isFile() && file.exists()){
                int lineNum = 0;
                InputStreamReader inread =  new InputStreamReader(new FileInputStream(file),encoding);
                String lineText = null;
                BufferedReader bufferedReader = new BufferedReader(inread);
                while ((lineText=bufferedReader.readLine()) != null){
                    list.add(lineText);
                    System.out.printf("第一行:%d 内容 %s：", lineNum++, lineText);
                    System.out.println();

                }

                bufferedReader.close();
                inread.close();


            }else {
                System.out.println("文件不存在");
            }




        }catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        return list;


    }




}
