package com.zhongming.ioStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class DataInputStreamTest {
    public static void main(String[] args) {
        DataInputStream dataInputStreamTest = null;
        try {
            dataInputStreamTest = new DataInputStream(new FileInputStream("javaLearning/dos.txt"));
            String name = dataInputStreamTest.readUTF();
            int age = dataInputStreamTest.readInt();
            boolean is = dataInputStreamTest.readBoolean();

            System.out.println(name + age + is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataInputStreamTest.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
