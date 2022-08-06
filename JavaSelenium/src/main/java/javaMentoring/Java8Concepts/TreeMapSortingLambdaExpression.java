package javaMentoring.Java8Concepts;

import java.util.TreeMap;

public class TreeMapSortingLambdaExpression {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>((i1,i2)->{
			if(i1<i2) {
				return +1;
			}else if(i1>i2) {
				return -1;
			}else {
				return 0;
			}
		});

		map.put(22, "shgfgh");
		map.put(11,  "rtrtrt");
		map.put(5, "asdddd");
		map.put(44, "gfgfg");
		
		System.out.println(map);
		
	}

}
