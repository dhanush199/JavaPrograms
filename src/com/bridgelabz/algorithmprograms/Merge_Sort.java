package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.AlgorithmUtility;
import com.bridgelabz.utility.FunctionalUtility;

import java.util.*;

public class Merge_Sort
{

    public static void main(String[] args)
    {
        System.out.println("Merge sort");
        int i;
        System.out.println("Enter the size of your array");
        int n=FunctionalUtility.readInteger();
        String arr[]=new String[n];
        System.out.println("Enter the elements");
        for( i=0;i<n;i++)
        {   
            arr[i]=FunctionalUtility.readString();
        }
        AlgorithmUtility.mergeSort(arr,0,n);
        System.out.println("Elements after sorting");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");
        }

    }

}

