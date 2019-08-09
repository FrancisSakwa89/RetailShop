package com.company.ExeOnThreads;

public class MaxValue extends  Thread{
    int[] a;
    int small,large;
    int max;

    public MaxValue(int[] a, int small, int large, int max) {
        this.a = a;
        this.small = small;
        this.large = large;
        this.max = max;
    }



    public void run(){
        for (int i=small; i<large; i++) {
            if (a[i] >ExeMain.max) {
               ExeMain.max = a[i];
            }
        }
    }
    public int getMax(){
        return max;
    }
}

