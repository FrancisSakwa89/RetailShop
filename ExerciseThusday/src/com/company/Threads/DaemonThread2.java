package com.company.Threads;

public class DaemonThread2 extends Thread {

    public void run(){
        System.out.println("Name: "+ Thread.currentThread().getName());
        System.out.println("Daemon: "+ Thread.currentThread().isDaemon());
    }
}
