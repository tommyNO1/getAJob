package com.zhongming.ioStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriterTest2 {
    //对read()操作升级，使用read的重载方法
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            File file = new File("javaLearning/hello.txt");
            fileReader = new FileReader(file);
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf))!=-1){
//                for (int i = 0; i <len ; i++) {
//                    System.out.print(cbuf[i]);
//                }
                String str = new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }
}
