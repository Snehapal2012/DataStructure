package com.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class UnorderedList {
    public static void main(String[] args) {
        LinkedList<String> words=new LinkedList<String>();
add(words);
display(words);
search(words);
    }
    public static void add(LinkedList<String> words){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the words in the list");
        System.out.println("You can enter 5 words:----------");
        words.add(scan.nextLine());
        words.add(scan.nextLine());
        words.add(scan.nextLine());
        words.add(scan.nextLine());
        words.add(scan.nextLine());
    }
    public static void display(LinkedList<String> words){
        System.out.println(words);
    }
    public static void search(LinkedList<String> words){
        String search;
        int position = 0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the word you want to search: ");
        search=scan.nextLine();
        boolean found=false;
        for (int i=0;i<words.size();i++){
            if(search.compareTo(words.get(i))==0)
            {
                found=true;
                position=i;
                System.out.println("Searched word is found at position: "+(position+1));
                words.remove(position);
                display(words);
                break;
            }
        }
        if (found==false) {
            System.out.println("Sorry , searched word not found!");
            System.out.println("After adding the searched word:-----------");
            words.addLast(search);
            display(words);
        }
    }
}
