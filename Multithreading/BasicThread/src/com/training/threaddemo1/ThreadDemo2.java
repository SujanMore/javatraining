package com.training.threaddemo1;

class MyThread1 extends Thread {

    @Override
    public void run() {

        int c;
        c = 10/0;
    }
}
public class ThreadDemo2 {

    public static void main(String[] args) {

        MyThread1 th1 = new MyThread1();      // Thread-0
//        MyThread1 th2 = new MyThread1();      // Thread-1
        th1.start();
//        th2.start();
    }
}