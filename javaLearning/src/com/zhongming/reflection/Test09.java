package com.zhongming.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//通过反射动态的创建对象
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得class对象
        Class c1 = Class.forName("com.zhongming.reflection.User");

        //构造一个对象
        User o = (User) c1.newInstance();
        System.out.println(o);

        //通过构造器创建对象
        Constructor constructor = c1.getConstructor(String.class, String.class);
        User user2 = (User) constructor.newInstance("tommy", "25");
        System.out.println(user2);

        //通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        //通过反射获得一个方法
        Method setAge = c1.getDeclaredMethod("setAge", String.class);
        //invoke:激活的意思
        //（对象，“方法的值”）
        setAge.invoke(user3, "25");
        System.out.println(user3);

        //通过反射操作属性
        Field name = c1.getDeclaredField("name");
        name.set(user3, "zhongming");
        System.out.println(user3);

        //通过反射操作私有属性
        Field age = c1.getDeclaredField("age");
        age.setAccessible(true);
        age.set(user3, "20");
        System.out.println(user3);

    }
}
