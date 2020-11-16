package com.zhongming.ioStream;

import java.io.*;

public class BufferSteamTest {
    public static void main(String[] args) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File srcFile = new File("javaLearning/coal2.jpg");
            File destFile = new File("javaLearning/coal_copy.jpg");

            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);

            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] buffer = new byte[10];
            int len;
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //先关闭外层的流，再关内层的流
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //在关闭外层流的同时，内层流也会自动的进行关闭
//        fileInputStream.close();
//        fileOutputStream.close();

        }
    }
}
