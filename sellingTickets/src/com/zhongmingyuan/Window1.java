package com.zhongmingyuan;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Window1 implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
