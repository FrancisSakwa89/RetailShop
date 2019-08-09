package com.company;

import java.util.*;

public class MapInterfaceAndCollectionExe {

    public void copyHashSetToArray(){
        HashSet hset = new HashSet();
//
        hset.add(1);
        hset.add(2);
        hset.add(3);

        hset.add("Francis");
        hset.add("Dennis");


        Object[] object = hset.toArray();

        System.out.println("HashSet elements are being copied into an array. The array now contains...");

//        for (int i=0; i< object.length;i++){
//            System.out.println(object[i]);
//        }
        for (Object o: object){
            System.out.println(o);
        }

    }

    public void treeSetSize(){
        TreeSet<Integer> tSet = new TreeSet();
        System.out.println("############ This is a treeset #####");

        System.out.println("Initial Size of TreeSet without elements : " + tSet.size());

        //add elements to TreeSet object
        tSet.add(4);
        tSet.add(Integer.valueOf("2"));
        tSet.add(Integer.valueOf("3"));
        tSet.add(Integer.valueOf("5"));

        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");


        System.out.println("Size of TreeSet after addition : " + tSet.size());

        System.out.println("################# This is the lowest value ####################");
        System.out.println("This is the lowest value of set: " + tSet.first());
        System.out.println("This is the highest value of set: " + tSet.last());


        //remove one element from TreeSet using remove method
        tSet.remove(Integer.valueOf("1"));
        System.out.println("Size of TreeSet after removal of first element : " + tSet.size());

        System.out.println("##### This is a tree set of strings ####");
        TreeSet stringtSet = new TreeSet();

        stringtSet.add("Franco");
        stringtSet.add("Harriet");
        stringtSet.add("Johntech");
        stringtSet.add("Agnes");
        stringtSet.add("George");
        System.out.println("Size of TreeSet : " + stringtSet.size());
        System.out.println(stringtSet);

        /** DONE FOR MY OWN EXPOSURE TO TREE SET METHODS **/

        System.out.println("###### Add all method in action(adding elements of the same datatype): Add A,B,C to the first string set #####");
        System.out.println(stringtSet.addAll(treeSet));
        System.out.println(stringtSet);




    }

    public void hashMap(){
        HashMap<Integer,String> hashMap = new HashMap();

        hashMap.put(109,"Francis");
        hashMap.put(102,"Jack");
        hashMap.put(108,"Dennis");

        System.out.println("Initial list of elements: ");
        for (Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+ "" + m.getValue());
        }

        System.out.println("After replacing: Dennis with Edwin: This is the updated list:");
        hashMap.replace(108,"Edwin");
        for (Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+ "" + m.getValue());
        }

        System.out.println("##########Checking whether an element exist in hashmap ######");

        System.out.println("Is value Francis present ? "+ hashMap.containsValue("Francis"));

        System.out.println("###### To find out if the HashMap is empty #####");

        System.out.println("Is the hash map empty ? "+ hashMap.isEmpty());


        System.out.println("####Iterate through keys of hash map : from an Integer#######");
        for (Integer key:hashMap.keySet()){
            System.out.println("Key = "+ key);
        }

        /** STRING DATA TYPE HASH MAP EXAMPLE **/

        HashMap<String,String> hash = new HashMap();
        hash.put("N0.1","Systech");
        hash.put("NO.2", "Moringa");
        System.out.println("Here is the list of String(k),String(v) hash map");
        for (Map.Entry m: hash.entrySet()){
            System.out.println(m.getKey() + " - "+  m.getValue());
        }

        System.out.println("####Iterate through keys of hash map : from a String#######");

        for (String n:hash.keySet()){
            System.out.println("Key = "+ n);
        }

    }

    public void addingSpecificIndexElementInArray(){
        System.out.println("####### Adding an element at a specific index in ArrayList(add 56 and 38 at index(0,1) respectively #######");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(34);
        arrayList.add(0,56);
        arrayList.add(1,38);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("####### Adding an element at a specific index in Array2 in a string respectively #######");
        ArrayList<String> array2 = new ArrayList<>();
        array2.add("Mary");
        array2.add("Caro");
        array2.add(0,"Sister");

        Iterator itr = array2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
