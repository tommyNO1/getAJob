package com.zhongming.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//通过反射获得泛型
public class Test11 {
    public void test1(Map<String, User> map, List<User> list) {
        System.out.println("test1");
    }

    public Map<String, User> test2() {
        System.out.println("test2");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method test1 = Test11.class.getDeclaredMethod("test1", Map.class, List.class);
        Type[] genericParameterTypes = test1.getGenericParameterTypes();
        for (Type type : genericParameterTypes) {
            System.out.println(type);
        }
    }
}
