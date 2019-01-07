/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramOnQueue.java
 *  Execution:    java -cp bin com.bridgelabz.util.BinarySearch n
 *  
 *  Purpose: To print the numbers which are prime as well as anagram in the range 0-1000 using Queue
 *  @author  Dhanush
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/
package com.bridgelab.datastructureprograms;

import java.util.LinkedList;
import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.QueueLinkedList;

public class PrimeAnagramOnQueue {

	public static void main(String[] args) {
		QueueLinkedList<Integer> queue=new QueueLinkedList<Integer>();
		List<Integer> list2=new LinkedList<Integer>();
        //List<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<1000;i++)
			list2.add(i);
		System.out.println(list2);
        queue= DataStructureUtility.primeAnagramA(list2); //finding anagram
        System.out.println(queue.size+" is the size of queue");
        System.out.println("Elements in a queue are :");
        while(!queue.isQueueEmpty())
        {
            System.out.print(queue.dequeue()+"   "+queue.dequeue());
            System.out.println();
        }
    }
}
