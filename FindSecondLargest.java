package home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
public static void main(String[] args) {
	
	
 List <Integer> num = new ArrayList  <Integer>();
 
	num.add(10);
	num.add(20);
	num.add(40);
	num.add(30);
	num.add(60);
	num.add(50);
	
	Collections.sort(num);
	
	Collections.reverse(num);
	
	
	int secondLargest = num.get(1);
	
      System.out.println(secondLargest);
	
}
}
