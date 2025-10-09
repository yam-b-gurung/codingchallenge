package codingchallenge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateNumbersinArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,2,4,7};
		duplicateNumbersArray2(arr);
	}
	
	static void duplicateNumbersArray(int[] arr){
		
		System.out.println("....duplicateNumbersArray...");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
	}
	
	static void duplicateNumbersArray2(int[] arr){
		
		System.out.println("....duplicateNumbersArray2...");

		
		Set<Integer> hset=new HashSet<Integer>();
		Set<Integer> duplicates=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			
			if(!hset.add(arr[i])) {
				duplicates.add(arr[i]);
			};
		}
		
		Iterator<Integer> iterator=duplicates.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
