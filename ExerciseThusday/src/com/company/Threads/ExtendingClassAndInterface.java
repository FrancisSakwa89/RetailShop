package com.company.Threads;

import com.company.exe.arrays.Calculation;

public class ExtendingClassAndInterface extends Calculation implements Runnable {
    @Override
    public void run() {
        System.out.println(" This is a thread plus and extends calculator man ");
           }
}
