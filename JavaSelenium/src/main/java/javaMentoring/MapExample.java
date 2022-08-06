package javaMentoring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {


		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		hmap.put(1, 200);
		hmap.put(8, 100);
		hmap.put(5, 300);
		hmap.put(17, 400);
		hmap.put(21, 600);

		System.out.println(hmap);
		
		for(Map.Entry<Integer, Integer> entry: hmap.entrySet() ) {
			System.out.println(entry);
		}
		
		
		for(Integer k: hmap.keySet()) {
			System.out.println(k+"-->"+hmap.get(k));
		}
		
		Iterator<Integer> iter = hmap.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println(hmap.get(iter.next()));
		}
		
		LinkedHashMap<Integer, Integer> lmap = new LinkedHashMap<Integer, Integer>(hmap);
		System.out.println(hmap);
		System.out.println(lmap);
		
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>(hmap);
		System.out.println(tmap);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
