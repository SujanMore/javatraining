package com.training.threaddemo;

class MyThread2 extends Thread {

    @Override
    public void run() {

//        try {
//            this.join();                            // DeadLock Condition
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException {

        MyThread2 th1 = new MyThread2();            // Thread-0. Born State
        th1.start();                                // Runnable State

        th1.join();

        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}