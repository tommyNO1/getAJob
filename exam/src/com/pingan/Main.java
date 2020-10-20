package com.pingan;

import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            List<Integer> list = new ArrayList<>();
            while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
                int temp = in.nextInt();
                list.add(temp);
            }
            HashSet<Integer> set = new HashSet<>(list);
            list.clear();
            list.addAll(set);
            Collections.sort(list);
            Collections.reverse(list);
            for(int i:list){
                System.out.print(i+" ");
            }

        }
}
