package com.company.Threads;

import com.company.Main;

public class MyThreadFindingTotal extends Thread {
    int [] a;
    int s,e;


    public MyThreadFindingTotal(int[] a, int s, int e) {
        this.a = a;
        this.s = s;
        this.e = e;
    }


    public void run(){
        for (int i=s;i<e;i++){
            Main.total+=a[i];
        }
    }



}


