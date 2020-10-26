package com.zhongming.reflection;

public class Test01 {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        //方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //方式二：forName获得
        Class c2 = Class.forName("com.zhongming.reflection.Student");
        System.out.println(c2.hashCode());

        //方式三：通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //方式四：基本类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;

        //获得父类型
        Class c5 = c1.getSuperclass();
    }


}

class Person{
    public String name;

    public Person(){};

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}