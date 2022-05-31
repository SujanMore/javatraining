package com.training.threaddemo1;

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
public class ThreadDemo1 {

    public static void main(String[] args) {

        Thread th = new MyThread();
        th.start();
    }
}
