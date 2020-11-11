package com.zhongming.ioStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterTest {
    //将hello.txt文件内容读入程序中，并输出到控制台
    public static void main(String[] args) throws IOException {
        //1.实例化File类对象，指明要操作的文件
        File file = new File("javaLearning/hello.txt");
        //2.提供具体的流
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            //3.数据的读入
            //read():返回读入的一个字符。如果达到文件的末尾，返回-1
            int data;
            while ((data=fr.read())!=-1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr!=null){
                    //4.流的关闭操作
                    fr.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
