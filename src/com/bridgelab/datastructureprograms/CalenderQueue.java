package com.bridgelab.datastructureprograms;

import com.bridgelabz.utility.DataStructureUtility;
import com.bridgelabz.utility.QueueLinkedList;

public class CalenderQueue {
	public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int year = Integer.parseInt(args[1]);
        String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && DataStructureUtility.isLeapYear(year)) {
            days[month] = 29;
        }
        System.out.println("\t\t " + months[month] + " " + year);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        int d = DataStructureUtility.day(month, 1, year);
        QueueLinkedList<QueueLinkedList<Integer>> mainQueue=new QueueLinkedList<QueueLinkedList<Integer>>();
        QueueLinkedList<Integer> queue2=new QueueLinkedList<Integer>();
       
       
        for (int i = 1; i <= days[month]; i++) {
            queue2.enqueue(i);
            if (((i + d) % 7 == 0 || i==days[month]) ) {
                mainQueue.enqueue(queue2);
                queue2=new QueueLinkedList<Integer>();
                continue;
            }
        }   
        for (int i = 0; i < d; i++)
        System.out.print("\t");
        for(int i=0;i<=mainQueue.getSize();i++)
        {
            QueueLinkedList<Integer> week=mainQueue.dequeue();
            for(int j=0;j<week.getSize();j++)
            {
                System.out.print(week.dequeue()+"\t");
            }
            System.out.println();
        }
    }
}