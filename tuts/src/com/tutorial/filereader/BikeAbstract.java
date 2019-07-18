package com.tutorial.filereader;

public abstract class BikeAbstract {
   public BikeAbstract(){
        System.out.println("Bike is created..");}
        public abstract void run();
        public void changeGear(){
            System.out.println("gear changed....");
        }
    }

class Honda extends BikeAbstract{
    public void run(){
        System.out.println("running safely..");
    }
}
