package com.bridgelab.datastructureprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.bridgelabz.utility.DataStructureUtility;
public class HashingFunction {
	static int i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0;
	static int dataArray0[]=new int[10000];
	static int dataArray1[]=new int[10000];
	static int dataArray2[]=new int[10000];
	static int dataArray3[]=new int[10000];
	static int dataArray4[]=new int[10000];
	static int dataArray5[]=new int[10000];
	static int dataArray6[]=new int[10000];
	static int dataArray7[]=new int[10000];
	static int dataArray8[]=new int[10000];
	static int dataArray9[]=new int[10000];
	static Object[] ans=new Object[100000];
	static HashMap map=new HashMap();
	DataStructureUtility LinkedList=new DataStructureUtility();
	public static int[] devideBy11(DataStructureUtility list) {
		int remArry[]=DataStructureUtility.toIntConv(list);
		for(int i=0;i<remArry.length;i++) {
			remArry[i]=remArry[i]%11;
		}
		return remArry;
	}
	public static void keyCompare(int[] remArry,int[] content){

		for( i=0;i<remArry.length;i++) 
		{
			//remArry[i]=remArry[i]%11;

			if(remArry[i]==0) {
				int arry0=content[i];
				dataArray0[j]=arry0;
				j++;
				//disp(dataArray0,0);
			}
			else if(remArry[i]==1) {
				int arry1=content[i];
				dataArray1[k]=arry1;
				k++;
				disp(dataArray1,1);
			}
			else if(remArry[i]==2) {
				int arry1=content[i];
				dataArray2[l]=arry1;
				l++;
				//disp(dataArray2,2);
			}
			else if(remArry[i]==3) {
				int arry1=content[i];
				dataArray3[m]=arry1;
				m++;
				//	disp(dataArray3,3);
			}
			else if(remArry[i]==4) {
				int arry1=content[i];
				dataArray4[n]=arry1;
				n++;
				//disp(dataArray4,4);
			}
			else if(remArry[i]==5) {
				int arry1=content[i];
				dataArray5[o]=arry1;
				o++;
				//disp(dataArray5,5);
			}
			else if(remArry[i]==6) {
				int arry1=content[i];
				dataArray6[p]=arry1;
				p++;
				//disp(dataArray6,6);
			}
			else if(remArry[i]==7) {
				int arry1=content[i];
				dataArray7[q]=arry1;
				q++;
				//disp(dataArray7,7);
			}
			else if(remArry[i]==8) {
				int arry1=content[i];
				dataArray8[r]=arry1;
				r++;
				//disp(dataArray8,8);
			}
			else  {
				int arry1=content[i];
				dataArray9[s]=arry1;
				s++;
				//disp(dataArray9,9);
			}

		}
//		Object[] a=toObjectArray(dataArray0);
//				Object[] ab=toObjectArray(dataArray0);
//		//		Object[] a=toObjectArray(dataArray0);
		//		Object[] a=toObjectArray(dataArray0);
		//		toObjectArray(dataArray0);
		//		toObjectArray(dataArray0);
		//		toObjectArray(dataArray0);
		//		toObjectArray(dataArray0);
		//		toObjectArray(dataArray0);
//		intToObject(a,0);
//		intToObject(ab,1);
//
				disp(dataArray0,0);
				disp(dataArray1,1);
				disp(dataArray2,2);
				disp(dataArray3,3);
				disp(dataArray4,4);
				disp(dataArray5,5);
				disp(dataArray6,6);
				disp(dataArray7,7);
				disp(dataArray8,8);
				disp(dataArray9,9);
	}
	public static void disp(int[] abc,int h) {
		for(int x=0;x<10;x++)
			if(abc[x]!=0)
				System.out.println(h+" array is"+abc[x]);

	}
	static HashMap<Integer, Object[]> map1= new HashMap<Integer, Object[]>();

	public static void intToObject(Object[] ans,int key) {
		for(Object c:ans)
			map1.put(key, ans);
		Set s=map1.entrySet();
		System.out.println("set is");
		System.out.println(s);
		Iterator itr=s.iterator(); 
		System.out.println("map1 is");
		System.out.println(map1);
		while(itr.hasNext()) {
			Map.Entry map1=(Map.Entry)itr.next();
			int i = (int) map1.getValue();
			System.out.println(map1.getKey()+"....."+i);
		}
	}
	public static Object[] toObjectArray(int[] abc) {
		int xx=0;
		for(int e=0;e<abc.length;e++) {
			Object an = (Integer) abc[e];
			ans[xx]=an;
			xx++;
		}
		return ans;
	}
}



