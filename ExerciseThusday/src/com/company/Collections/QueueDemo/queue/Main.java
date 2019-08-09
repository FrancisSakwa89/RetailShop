package com.company.Collections.QueueDemo.queue;

import com.company.Collections.QueueDemo.QueueCollection;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        QueueCollection queueCollection = new QueueCollection();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i=10;i>0;i--){
            priorityQueue.add(i);
        }

        System.out.println(priorityQueue.size());
//        System.out.println(priorityQueue.peek());
        priorityQueue.poll();
        System.out.println(priorityQueue.size());

//        System.out.println(priorityQueue.r);



    }
}
