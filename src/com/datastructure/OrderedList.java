package com.datastructure;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class OrderedList {
    public static void main(String[] args) {
        LinkedList<Integer> order=new LinkedList<Integer>();
        add(order);
        System.out.println("After sorting the numbers:--------------");
        Collections.sort(order);
        display(order);
        search(order);
    }
    public static void add(LinkedList<Integer> order){
        Scanner scan=new Scanner(System.in);
        System.out.println("You can enter 5 numbers:-----------");
        order.add(scan.nextInt());
        order.add(scan.nextInt());
        order.add(scan.nextInt());
        order.add(scan.nextInt());
        order.add(scan.nextInt());
        display(order);
    }
    public static void display(LinkedList<Integer> order){
        System.out.println(order);
    }
    public static void search(LinkedList<Integer> order){
      Scanner scan=new Scanner(System.in);
      int element;
        System.out.print("Enter the element you want to search: ");
        element=scan.nextInt();
        boolean found=false;
        for (int i=0;i<order.size();i++){
            if(element== order.get(i)){
                found=true;
                System.out.println("Searched element is found at position: "+(i+1));
                System.out.println("After removing the searched element:--------------");
                order.remove(i);
                display(order);
                break;
            }
        }
        if(found==false){
            System.out.println("Searched element not found!");
            System.out.println("After adding searched element to the list:------------");
            order.add(element);
            Collections.sort(order);
            display(order);
        }
    }
}
