import java.util.*;

import com.bridgalabz.util.FunctionalLogic;

public class Example 
{

	public static void main(String[] args)
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		FunctionalLogic<?> fl=new FunctionalLogic<Object>();
		System.out.println("Enter the array length");
		int size=sc.nextInt();
		int k=0;//size of Array
		System.out.println("select any one of the following option");
		int select=sc.nextInt();
		LinkedList<Comparable> l=new LinkedList<Comparable>();	
		int flag=0,i;
		switch(select) 
		{
		case 1: System.out.println("Enter the"+size+" array Elements");
		k=sc.nextInt();
		System.out.println("enter the element to be searched");
		int search=sc.nextInt();
		
		
		for(i=0;i<size;i++)
		{
			int m=sc.nextInt();
			l.add(i,m);
		}
		System.out.println(l);
		 temp=fl.searchInt(l,size);
		break;
		
		case 2: System.out.println("Enter the"+size+" array Elements");

		for(i=0;i<size;i++)
		{
			double d=sc.nextDouble();
			l.add(d);
		}
		break;
		case 3: System.out.print("Enter the"+size+" array Elements");

		for(i=0;i<size;i++)
		{
			String m=sc.nextLine();
			l.add(i,m);
		}
		System.out.println(l);
		System.out.println("enter the element to be searched");
		String d=sc.nextLine();
		Object o=new Object();
		Object obj=d;  
		for(i=0;i<l.size();i++)
		{ 
			if((l.get(i)).equals(d))
			{ 
				temp=1;
				break;
			}
		}


		break;

		default:System.out.println("eneter a valid input");
		break;


		}
		if(temp==1)
			System.out.println("entered element is present in the array");
		else
			System.out.println("entered element is not present in the array");
	}

}
