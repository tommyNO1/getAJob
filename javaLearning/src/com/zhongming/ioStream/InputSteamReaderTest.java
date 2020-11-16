package com.zhongming.ioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSteamReaderTest {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = null;//使用系统默认字符集
        try {
            FileInputStream fileInputStream = new FileInputStream("javaLearning/hello.txt");
            inputStreamReader = new InputStreamReader(fileInputStream);

            char[] cbuf = new char[20];
            int len;
            while ((len = inputStreamReader.read(cbuf)) != -1) {
                String str = new String(cbuf, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
