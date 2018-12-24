package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import java.util.*;

public class Merge_Sort
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Merge sort");
        int i;
        System.out.println("Enter the size of your array");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the elements");

        for( i=0;i<n;i++)
        {   
            arr[i]=sc.next();
        }
       
        AlgorithmUtility.mergeSort(arr,0,n);
        System.out.println("Elements after sorting");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");
        }

    }

}

