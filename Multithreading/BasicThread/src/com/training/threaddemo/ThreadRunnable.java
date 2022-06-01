package com.training.threaddemo;

class MyThread3 implements Runnable {
    MyThread3() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
public class ThreadRunnable {

    public static void main(String[] args) {

        MyThread3 th = new MyThread3();
//        Thread th1 = new Thread(th);
//        th1.start();
    }

}
