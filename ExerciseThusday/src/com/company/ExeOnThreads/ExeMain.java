package com.company.ExeOnThreads;

import java.util.Random;


public class ExeMain {
    public static int max;
    public static  int counter;
    public static int total;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("###### Finding Max value from a random generated array in 4 threads #######");
        int[] arr = new int[1000];

        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }

        MaxValue arr1 = new MaxValue(arr,0,250,max);
        MaxValue arr2 = new MaxValue(arr,250,500,max);
        MaxValue arr3 = new MaxValue(arr,500,750,max);
        MaxValue arr4 = new MaxValue(arr,750,1000,max);

        arr1.start();
        arr2.start();
        arr3.start();
        arr4.start();

        arr1.join();
        arr2.join();
        arr3.join();
        arr4.join();

        System.out.println(max);

        System.out.println("#### Shared Counter ###");

        SharedCounter thread[]= new SharedCounter[10];
        for (int i=0; i<10;i++){

            thread[i] = new SharedCounter();
            thread[i].start();
            thread[i].join();
            System.out.println(counter);

        }

        System.out.println("########## Reverse Hello exe ######");
        ReverseHello reverseHello = new ReverseHello(1);
        reverseHello.start();

    }
}
