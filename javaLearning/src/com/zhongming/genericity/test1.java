package com.zhongming.genericity;

import java.util.List;

public class test1 {
    public static void main(String[] args) {
        Tool tool = new Tool();
        System.out.println(tool.show(1));
    }
}

class Tool{
    public <T> T show(T t){
        return t;
    }

    public void test(List<?> list){
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
            
        }
    }
}
