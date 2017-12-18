package datastructure;

import databases.ConnectDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static databases.ConnectDB.connect;

public class DataReader {

	public static void main(String[] args) throws Exception{
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "\\src\\data\\self-driving-car";
		System.out.println(textFile);
		FileReader fr = null;
		BufferedReader br = null;
		BufferedReader br1= null;

		//connect DB
		ConnectDB connectDB = new ConnectDB();
		//table
		connectDB.CreateTableFormStringToMySql("self_driving_car", "text");

		try {
			fr = new FileReader(textFile);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}
		br = new BufferedReader(fr);
		String text, text1;
		Stack stack = new Stack(); //stack
		LinkedList <String> linkedList = new LinkedList<>();
		int count =0;
		try {
			while ((text = br.readLine())!=null){
				System.out.println(text);
				String[] words = text.split(" ");
				for (int i=0; i<words.length; i++){
					stack.push(words[i]);

					linkedList.add(words[i]);
				}

				connectDB.InsertDataFromStringToMySql(text, "selfdrivingcar","textline");
			}
			System.out.println("Total word count: "+count);

		//ConnectDB connectDB = new ConnectDB();
		//connectDB.CreateTableFormStringToMySql("self_driving_car","text_line" );

		/*ConnectDB.ps = connect.prepareStatement("DROP TABLE IF EXISTS `self_driving_car`;");
		ConnectDB.ps.executeUpdate();
		ConnectDB.ps = connect.prepareStatement("CREATE TABLE `self_driving_car` (`ID` int(11) NOT NULL AUTO_INCREMENT,`text_line` varchar(3000) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
		ConnectDB.ps.executeUpdate();*/
		/*try {
			while((text = br.readLine())!= null){
				System.out.println (text);
             connectDB.InsertDataFromStringToMySql(text, "self_driving_car","text_line");
			}*/

		}catch (IOException e1){
			e1.printStackTrace();
		}finally {
			try{
				br.close();
				fr.close();
			}catch (IOException e2){
				e2.printStackTrace();
			}
		}
        // reading from database
		List<String> input_text = connectDB.readDataBase("selection_sort", "SortingNumbers");
		for(String st1:input_text){
			System.out.println(st1);
		}

		//Retrieving data from LinkedList

		System.out.println("+++++++++++++++++++");
		for (int i=0; i<linkedList.size(); i++){
			System.out.println("FIFO order from LinkedList: "+ linkedList.get(i));
		}



		//Retrieving data from Stack
		System.out.println("++++++++++++++++++");
		for (int i=stack.size()-1; i>=0; i--){
			System.out.println("FILO order from stack: " + stack);
		}

		//use of peek
		System.out.println("Peeking stack: "+ stack.peek());
		System.out.println("Searching stack: "+ stack.search ("steps!"));
		System.out.println("Popping stack: "+ stack.pop());
		System.out.println("Peeking again: " +stack.peek());

		//Retrieving data use for-each loop
		System.out.println("Retrieving data using for-each loop:  ");

		for(object st: stack ) {
			System.out.println(st);
			}
		//Retrieving data using while loop
		while (!stack.empty()){
			System.out.println(stack.pop());

		// iterator
			System.out.println("Retrieving data using iterator: ");
			Iterator it = stack.iterator();
			while (it.hasNext()){
				String obj = (String)it.next();
				System.out.println(obj);
			}

		}
	}

}
