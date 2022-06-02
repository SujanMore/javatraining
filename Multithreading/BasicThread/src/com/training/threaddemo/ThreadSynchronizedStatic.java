package com.training.threaddemo;

class Table1 {

    public synchronized static void display(int n) {

//            synchronized (Table1.class){

                for (int i = 1; i <= 10; i++) {
                    System.out.println(n * i);
                }
//            }


    }
}

class Thread3 extends Thread {

    public void run() {

        Table1.display(5);
    }
}

class Thread4 extends Thread {

    public void run() {

        Table1.display(7);
    }
}

public class ThreadSynchronizedStatic {

    public static void main(String[] args) {

        Thread3 th1 = new Thread3();
        Thread4 th2 = new Thread4();

        th1.start();
        th2.start();
    }
}
