package com.training.threaddemo;

class MyThread extends Thread {

    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
public class ThreadBasic {

    public static void main(String[] args) {

        MyThread th1 = new MyThread();      // Thread 0
        MyThread th2 = new MyThread();      // Thread 1
        th1.start();
        th2.start();
    }
}
