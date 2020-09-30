package test;
/*
* 实现Runnable接口创建线程
* 1.创建一个实现了Runnable接口的类
* 2.实现类去实现Runnable中的抽象方法：run()
* 3.创建实现类的对象
* 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类对象
* 5.通过Thread类对象调用start()方法
* */
public class MyThreadImplRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread() + ":" + i);
        }
    }
}
