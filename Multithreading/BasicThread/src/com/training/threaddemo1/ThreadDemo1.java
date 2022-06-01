package com.training.threaddemo1;

class MyThread extends Thread {

    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
public class ThreadDemo1 {

    public static void main(String[] args) {

        MyThread th1 = new MyThread();      // Thread 0
        MyThread th2 = new MyThread();      // Thread 1
        th1.start();
        th2.start();
    }
}
