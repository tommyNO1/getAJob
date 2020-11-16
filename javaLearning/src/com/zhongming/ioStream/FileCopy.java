package com.zhongming.ioStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //创建File对象，指明写入和写出的文件
            File srcFile = new File("javaLearning/hello.txt");
            File destFile = new File("javaLearning/hello_copy.txt");
            //创建输入流和输出流的对象
            fileReader = new FileReader(srcFile);
            fileWriter = new FileWriter(destFile);
            //数据的读入和写出操作
            char[] cbuf = new char[2];
            int len;
            while ((len = fileReader.read(cbuf)) != -1) {
                fileWriter.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
