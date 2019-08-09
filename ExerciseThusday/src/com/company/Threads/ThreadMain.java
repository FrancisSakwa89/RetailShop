package com.company.Threads;

import static com.company.Main.total;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("##### Finding total from 4 threads ############");
        int[] a = new int[1000];

        for (int i = 0; i < 1000; i++) {
            a[i] = i;
        }

        MyThreadFindingTotal t1 = new MyThreadFindingTotal(a, 0, 250);
        MyThreadFindingTotal t2 = new MyThreadFindingTotal(a, 250, 500);
        MyThreadFindingTotal t3 = new MyThreadFindingTotal(a, 500, 750);
        MyThreadFindingTotal t4 = new MyThreadFindingTotal(a, 750, 1000);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(total);


        System.out.println("###### A daemon Thread Example ###########");

//        MyDaemonThread myDaemonThread = new MyDaemonThread();
//        MyDaemonThread myDaemonThread_ = new MyDaemonThread();
//        MyDaemonThread myDaemonThread__ = new MyDaemonThread();
//        myDaemonThread.setDaemon(true);
//        myDaemonThread.start();
//        myDaemonThread_.start();
//        myDaemonThread__.start();



        MyDaemonThread myDaemonThread = new MyDaemonThread();
        MyDaemonThread myDaemonThread1 = new MyDaemonThread();
        MyDaemonThread myDaemonThread2 = new MyDaemonThread();

        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        try {
            myDaemonThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myDaemonThread1.start();
        try {
            myDaemonThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myDaemonThread2.start();
        try {
            myDaemonThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println("########## Daemon Thread Example 2 #####");
//
//        DaemonThread2 daemonThread2 = new DaemonThread2();
//        DaemonThread2 daemonThread_ = new DaemonThread2();
//        daemonThread2.start();
//        daemonThread2.setDaemon(true);
//
//        daemonThread_.start();



//        System.out.println(myDaemonThread);
//        System.out.println("############################");





        ImplementingRunnableThread runnableThread = new ImplementingRunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();

        ExtendingClassAndInterface extend = new ExtendingClassAndInterface();
        extend.sum(23,56,78);
        Thread thread1 = new Thread(extend);
        thread1.start();



    }
}
