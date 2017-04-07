package test;

import java.util.ArrayList;

public class TestClass {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		myList.add(1);
		myList.add(1);
		myList.add(1);
		
		for(int i : myList){
			System.out.println(i);
		}
		
		myList.remove(1);
		myList.remove(1);
		
		for(int i:myList){
			System.out.println(i);
		}
	}
}
