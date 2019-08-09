package com.company.Threads;

public class MyDaemonThread extends Thread{

    public void run() {
        if (Thread.currentThread().isDaemon()){
            System.out.println("This is a Daemon Thread");
        }
        else {
            System.out.println(" This is a user Thread");
        }
    }
}
