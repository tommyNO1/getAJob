package com.zhongming.ioStream;

//从内存中鞋出数据到硬盘文件中

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        //提供File类的对象，指明写出到的文件
        File file = new File("javaLearning/dream.txt");

        //提供FileWriter的对象，用于数据写出
        FileWriter fileWriter = new FileWriter(file);

        //写出的操作
        fileWriter.write("I have a dream!");

        //流资源的关闭
        fileWriter.close();

    }

}
