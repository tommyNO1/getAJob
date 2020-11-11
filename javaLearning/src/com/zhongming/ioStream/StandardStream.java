package com.zhongming.ioStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardStream {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
            while (true){
                String data = bufferedReader.readLine();
                if(data.equalsIgnoreCase("e")||data.equalsIgnoreCase("exit")){
                    System.out.println("程序结束");
                    break;
                }
                String s = data.toUpperCase();
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
