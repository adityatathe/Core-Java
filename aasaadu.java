package com.nt;

import java.util.Scanner;

public class assaadu {

	
	public static int arrMax(int[]arr) {
		int max=arr[0];
		
		for(int i:arr) {
			
			if(max<i) {
				max=i;
			}
		}
		return max;
		 	
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size of array");
		size=sc.nextInt();
		int []arr1=new int[size];

	
		
	  System.out.println("Enter the values one by one");
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int a=arrMax(arr1);
		System.out.println(a);

	}
}
