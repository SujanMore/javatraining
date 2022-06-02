package com.training.threaddemo;

class SharedData {

    private int data;
    private boolean writable = true;

    public synchronized void produce(int x) {

        if(writable == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        data = x;
        System.out.println("produced: " + x);
        writable = false;
        notify();
    }

    public synchronized int consume(){

        if(writable == true){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        writable = true;
        notify();
        return data;
    }
}

class Producer extends Thread{

    SharedData d;

    public Producer(SharedData d) {
        this.d = d;
    }

    @Override
    public void run() {

        for(int i = 1; i <=10; i++) {
            d.produce(i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Consumer extends Thread{

    SharedData d;

    public Consumer(SharedData d) {
        this.d = d;
    }

    @Override
    public void run() {

        for(int i = 1; i <=10; i++) {
            System.out.println("consumed value is: " + d.consume());
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadConditionalSynchronized {

    public static void main(String[] args) {

        SharedData d = new SharedData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();

    }
}
