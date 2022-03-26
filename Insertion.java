package com.sort.merge;
import java.util.*;
import java.io.*;
public class Insertion {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        int n = 5;
        int[] a = {8, 2, 4, 1 ,3};

        /*   for(int i=0; i<n; i++)
            a[i] = ss.nextInt();

     for(int i = 1 ; i< n; i++){

            for(int j =i-1; j>=0; j--){
                if(a[j] > a[j+1]){
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
                }
            }
        }
        for(int k : a){
            System.out.print(k + " ");
        }*/


        for(int i =1; i <n; i++){
            int current = a[i];
            int j = i-1;
            while(j>=0 && a[j] > current){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        System.out.println(Arrays.toString(a));
    }
}
