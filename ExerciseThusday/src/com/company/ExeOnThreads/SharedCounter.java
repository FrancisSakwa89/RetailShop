package com.company.ExeOnThreads;

public class SharedCounter extends Thread {

    public void run(){
        for (int i=0; i<10;i++){
            ExeMain.counter+=1;
        }
    }
}
