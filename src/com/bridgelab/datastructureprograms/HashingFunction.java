package com.bridgelab.datastructureprograms;

import com.bridgelabz.utility.DataStructureUtility;
public class HashingFunction {
	public static int[] devideBy11(DataStructureUtility list) {
		int remArry[]=DataStructureUtility.toIntConv(list);
		for(int i=0;i<remArry.length;i++) {
			remArry[i]=remArry[i]%11;
		}
		return remArry;
	}
}

