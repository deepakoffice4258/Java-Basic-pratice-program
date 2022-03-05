package com.basicprograming;

public class Randomnumberarry {

	public static void main(String[] args) {
		
		
		int[] arr = new int[10];
		
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*1000);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		for (int i=0; i<arr.length;i++) {
			if (arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("minmum elemnet="+min);
		System.out.println("minmum element="+max);
		}

	}

