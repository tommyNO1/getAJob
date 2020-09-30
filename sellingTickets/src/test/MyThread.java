package test;
/*
* 继承Thread类的线程创建方法
* 1.创建一个继承于Thread类的子类
* 2.重写Thread类的run()方法，将此线程执行的操作声明在run()中
* 3.创建Thread类的子类对象
* 4.调用此对象的start()方法：启动当前线程，调用当前线程的run方法
* */
public class MyThread extends Thread {
    public MyThread() {

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + ":" + i);
        }
    }

}
