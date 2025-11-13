package com.demo.test;
import java.util.ArrayList;

import com.demo.array.Array;
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array sa =new Array();
		
		sa.accept();
		sa.display();
		ArrayList<Integer>al=sa.factOfPrime();
		al.forEach(System.out::println);
	}

}
