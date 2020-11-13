package com.zhongming.genericity;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends Person> list = null;
        List<? super Person> list1 = null;

        List<Person> list2 = new ArrayList<>();
        List<Student> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();

        list = list3;
        list = list2;
        //list = list4; compile fail

        list1 = list4;
        list1 = list2;
        //list1 = list3; compile fail

        Person person = list.get(0); //compile success
        //Person person1 = list1.get(0); compile fail

        //list.add(new Person()); compile fail
        list1.add(new Person()); //compile success
    }


}

class Person {

}

class Student extends Person {

}

