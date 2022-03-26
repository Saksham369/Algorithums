package com.sort.merge;

import java.util.*;
//Bubble Sort
public class Bubble {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] a = new int[n];

        for(int i =0; i<n; i++)
            a[i] = ss.nextInt();

        for(int i =0; i<n; i++){
                  boolean f = true;
            for(int j=1; j<n-i; j++){
                if(a[j-1] > a[j]){
                        f = false;
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;

                }

            }
            if(f){
                break;
            }
        }
        for(int k : a)
            System.out.print(k);
    }
}
