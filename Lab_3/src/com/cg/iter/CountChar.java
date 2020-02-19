package com.cg.iter;

import java.util.*;
class CountChar{

    static void count(char arr[]){
        int alpha[] = new int[256];
        for (char i : arr) {
            alpha[(int)i]++;
        }
        System.out.println("Count of characters: ");
        for (int i = 0; i < alpha.length; i++) {
            if(alpha[i]!=0){
                System.out.println((char)i+" : "+alpha[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of character array: ");
        int n = sc.nextInt();
        char arr[]=new char[n];
        System.out.println("Enter the characters");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        count(arr);
    }
}