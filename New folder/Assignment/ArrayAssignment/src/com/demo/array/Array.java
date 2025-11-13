package com.demo.array;
import java.util.ArrayList;
import java.util.Scanner;
public class Array {
	Scanner sc=new Scanner(System.in);
	private int[] arr;
	int sz;


	public void accept() {
		
		System.out.println("enter size of array");
		sz=sc.nextInt();
arr= new int[sz];
		System.out.println("enter values in array");
		for(int i=0;i<sz;i++) {
			arr[i]=sc.nextInt();
		}
		
	}
	
	
	public void display() {
		for(int i=0;i<sz;i++) {
			System.out.print( arr[i]+" ");
	}
}
	
	
	public ArrayList<Integer> factOfPrime() {
		ArrayList<Integer> al=new ArrayList<>();
		int l =1;
		for(int i=0;i<sz;i++) {
			
				int f =fact(arr[i]);
				al.add(f);
			}
		return al;
		}
		
		
		
	


//	private boolean isPrime(int n) {
//		if(n<=1)
//			return false;
//		else {
//			for(int i=2;i<= Math.sqrt(n);i++) {
//				if(n%i==0)
//					return false;
//			}
//			return true;
//		}
//		
//	}
//
	private int fact(int n) {
		int f=1;
		for(int j=1;j<n;j++) {
			f=f*j;
		}
		return f;
	}
}
