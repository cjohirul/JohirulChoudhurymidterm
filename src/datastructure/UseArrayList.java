package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<Integer> arrList = new ArrayList<>();
		arrList.add(234);
		arrList.add(341);
		arrList.add(655);
		arrList.add(45);
		arrList.add(33);

		//print Array List
		System.out.println("Retrieving: "+ arrList);

		//use get method to peek the element
		System.out.println(arrList.get(0));

		//remove
		System.out.println("Remove: "+ arrList.remove(2));

		//Retrieving elements
		System.out.println("Re-Retrieving: ");

		// each loop
		for(Integer in:arrList){
			System.out.println("each loop: "+in);
		}
		// use iterator
		Iterator it= arrList.iterator();
		while (it.hasNext()){
			int obj = (int)it.next();
			System.out.println(obj);
		}


	}

}
