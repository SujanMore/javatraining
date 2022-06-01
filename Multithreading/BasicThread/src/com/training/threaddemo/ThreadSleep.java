package com.training.threaddemo;

class MyThread1 extends Thread {

    @Override
    public void run() {

        Thread th = Thread.currentThread();
        String name = th.getName();

        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " " + name);

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class ThreadSleep {

    public static void main(String[] args) {

        MyThread1 th1 = new MyThread1();            // Thread-0. Born State
        th1.start();                                // Runnable State

        Thread th = Thread.currentThread();
        String name = th.getName();

        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(250);          // Time Waiting State
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}