package com.bridgalabz.Algorithms.logics;

import java.math.BigInteger;

public class FunctionalLogic {

	public void checkAnagram(int len,String str1,String str2)
	{


		int found=0,not_found = 0;

		for(int i=0; i<len; i++)
		{

			for(int j=0; j<len; j++)
			{
				if(str1.charAt(i) == str2.charAt(j))
				{
					found = 1;
					break;
				}
			}
			if(found == 0)
			{
				not_found = 1;
				break;
			}
		}
		if(not_found== 1)

			System.out.print("Strings are not Anagram to Each Other");
		else

			System.out.print("Strings are Anagram");
	}
	//Prime Numbers
	public boolean checkPrime(long n) 
	{ 

		// Converting long to BigInteger 
		BigInteger b = new BigInteger(String.valueOf(n)); 

		return b.isProbablePrime(1); 
	} 
}
