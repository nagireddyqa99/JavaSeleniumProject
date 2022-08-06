package javaMentoring.Java8Concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find2ndBiggestNumber {

	public static void main(String[] args) {
 
			Integer a[]={1,2,5,6,3,2};  
			List<Integer> list=Arrays.asList(a); 
			Collections.sort(list);  
			int total = list.size();
			int element=list.get(total-2); 
			System.out.println("Second Largest: "+element);  
			
  
			
			
	}

}
