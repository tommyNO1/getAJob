package com.test;

public class Main {
    public static void main(String[] args) {
/*        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        myThread1.start();
        myThread2.start();
        myThread3.start();*/
        MyThreadImplRunnable myThreadImplRunnable = new MyThreadImplRunnable();
        Thread thread1 = new Thread(myThreadImplRunnable);
        Thread thread2 = new Thread(myThreadImplRunnable);
        Thread thread3 = new Thread(myThreadImplRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


