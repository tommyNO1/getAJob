package com.zhongming.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.zhongming.reflection.User");

        //获得类的名字
        System.out.println(c1.getName());//获得包名+类名
        System.out.println(c1.getSimpleName());//获得类名

        //获得类的属性
        Field[] fields = c1.getFields(); //只能找到public属性
        fields = c1.getDeclaredFields();//找到全部属性
        Field field = c1.getField("name");
        for (Field field1:fields){
            System.out.println(field1);
        }

        //获得类的方法
        Method[] methods = c1.getMethods();//获得本类及其父类的全部public方法
        Method[] methods1 = c1.getDeclaredMethods();//获得本类的所有方法（不包括父类）
        for(Method method:methods1){
            System.out.println(method);
        }
        //获得指定方法
        //重载
        Method getAge = c1.getMethod("getAge");
        Method setAge = c1.getMethod("setAge", String.class);

        //获得指定的构造器
        Constructor constructor = c1.getConstructor();
        Constructor[] constructors = c1.getConstructors();
    }
}
