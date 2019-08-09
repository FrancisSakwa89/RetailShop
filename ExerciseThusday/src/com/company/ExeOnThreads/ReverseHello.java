package com.company.ExeOnThreads;


public class ReverseHello extends Thread{
     int ref;

    public ReverseHello(int ref) {
        this.ref = ref;
    }

    public void run()
    {

        if (this.ref < 50){
            ReverseHello reverseHello = new ReverseHello(ref+1);
            reverseHello.start();
            try {
                reverseHello.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Hello from thread "+ ref);
    }




//        for(int i=0;i <=50;i--)
//            System.out.println("Hello from Thread <"+(i+1)+">");
//        try{
//            Thread.sleep(1000);
//        }
//        catch(Exception e)
//        {System.out.println(e);}
//    }

}


