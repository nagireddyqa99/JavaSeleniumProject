package javaMentoring.Java8Concepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDefaultSorting {
	public static void main(String[] args) {
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		intArrList.add(400);
		intArrList.add(200);
		intArrList.add(101);
		intArrList.add(50);
		
		System.out.println("Before Sorting: "+intArrList);
		
		Collections.sort(intArrList);
		System.out.println("Before Sorting: "+intArrList);
		
	}
}
