package javaMentoring.Java8Concepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingWithLambdaExpression {

	public static void main(String[] args) {
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		intArrList.add(100);
		intArrList.add(25);
		intArrList.add(101);
		intArrList.add(50);
		
		System.out.println("Before Sorting: "+intArrList);
		
		Collections.sort(intArrList, (i1,i2)->{
			if(i1<i2) {
				return -1;
			}else if(i1<i2) {
				return +1;
			}else {
				return 0;
			}
		});
		
		System.out.println("Before Sorting: "+intArrList);
	
		Collections.sort(intArrList, (i1,i2)->{
			if(i1>i2) {
				return +1;
			}else if(i1>i2) {
				return -1;
			}else {
				return 0;
			}
		});		
	}

}


























