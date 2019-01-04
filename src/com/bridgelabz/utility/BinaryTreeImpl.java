package com.bridgelabz.utility;

public class BinaryTreeImpl {
	public static int catalan( int n)
	{

		// Calculate value of 2nCn
		int c = binomialCoeff(2 * n, n);

		// return 2nCn/(n+1)
		return c / (n + 1);
	}
	public static int countBST( int n)
	{
		// find nth catalan number
		int count = catalan(n);

		// return nth catalan number
		return count;
	}
	public static int factorial(int n)
	{
		int res = 1;
		for (int i = 1; i <= n; ++i)
		{
			res *= i;
		}

		return res;
	}

	public static  int binomialCoeff(int n, int k)
	{
		int res = 1;

		// Since C(n, k) = C(n, n-k)
		if (k > n-k)
			k = n-k;
		for (int i = 0; i < k; ++i)
		{
			res *= (n - i);
			res /= (i + 1);
		}
		System.out.println( "the total number of coefficient is "+res);
		return res;
	}



}





