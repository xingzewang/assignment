package com.xingze.test;

public class JunitTest02 {
   public static int GetMaxAddOfArray(int arr[], int sz)
   {
	    if (arr == null || sz <= 1)
	        return 0;
	    int MAX = arr[0];
	    int sum = arr[0];
	    for (int i = 1; i < sz; i++)
	    {
	        if (sum < 0)
	            sum = arr[i];
	        else
	        {
	            sum += arr[i];
	        }

	        if (sum > MAX)
	            MAX = sum;
	    }
	    if(MAX<0)
	    {
	    	return 0;
	    }
	    return MAX;
	}
}
