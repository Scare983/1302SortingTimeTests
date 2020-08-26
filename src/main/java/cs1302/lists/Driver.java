
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
 * Welcome to Kevin's list implementation
 * We implemented the DoublyLinkList, ArrayList, and LinkLists
 * This is to be able to gain more knowledge of the  
 * speed of each of the methods based on the expnential growth
 * of populations.  
 * 
 * Made by: Kevin Linnane
 * 
 * 
 */
public class Driver {
 


	
	public static void main(String []args) { //tests methods, each creation of array list will do , 10, 1000, 10000, 100,000 and 1,000,000 tets
	
	
	createArrayListAttempt();
		createLinkedListAttempt();
		createDoubleLinkedListAttempt();
		
	}

	

		
		
		
		
		
		
	
	 static void createDoubleLinkedListAttempt() {
			long start, end;
			File DoubleLinkedList = new File("DoubleLinkedList.txt");
			try {
			
				DoubleLinkedList.createNewFile(); //creates files to input intel about arraylist
				
			
		
			FileWriter aListWriter = new FileWriter(DoubleLinkedList, false); //used to write into created file.
			
			
			
			DoubleLinkedList<Person> list1000 = new DoubleLinkedList<Person>();//array of 1000 ints
			aListWriter.write("Array of 100 people:");
			aListWriter.close();
			aListWriter = new FileWriter(DoubleLinkedList, true);
			BufferedWriter bListWriter = new BufferedWriter(aListWriter);
			bListWriter.newLine();
			

			
			
			populate10(list1000); //make it random persons
			
			
			
			
			///////////////
			start = System.nanoTime();
			list1000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
			end = System.nanoTime();
			bListWriter.write("Prepending Jackie Chan: " + (end - start));
			bListWriter.write("\n");
			bListWriter.newLine();
			/////////////
			start = System.nanoTime();
			list1000.append(new Person("John Cena", "Wrestler", 6.6));
			end = System.nanoTime();
			bListWriter.write("Appending John Cena " + (end - start));
			bListWriter.write("\n");
			bListWriter.newLine();
			
			/////////////////
			start = System.nanoTime();
			
			Person p = list1000.get(5);
			end = System.nanoTime();
			bListWriter.write("Getting person at location 5: " + (end - start));
			bListWriter.newLine();
			//////////////////
			start = System.nanoTime();
		list1000.remove(5);
		end = System.nanoTime();
		bListWriter.write("Removing at index 5:" + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		///////////////////
		start = System.nanoTime();
		list1000.search(new Person("Misc", "Wrestler", 6.6), 0, list1000.size()-1) ;

		end = System.nanoTime();
		
		bListWriter.write("Search for person not in list: " + (end - start));
		bListWriter.write("\n");
		bListWriter.write("\n");
		bListWriter.newLine();
		bListWriter.newLine();
		
		/////////////////////
		
		
		
		
		
		
		
		
		DoubleLinkedList<Person> list10000 = new DoubleLinkedList<Person>();
		
			bListWriter.write("Array of 1000 People:");
			populate1000(list10000); //make it random persons
			///////////////
			start = System.nanoTime();
			list10000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
			end = System.nanoTime();
			bListWriter.write("Prepending Jackie Chan: " + (end - start));
			bListWriter.write("\n");
			bListWriter.newLine();
			/////////////
			start = System.nanoTime();
			list10000.append(new Person("John Cena", "Wrestler", 6.6));
			end = System.nanoTime();
			bListWriter.write("Appending John Cena " + (end - start));
			bListWriter.write("\n");
			bListWriter.newLine();
			/////////////////
			start = System.nanoTime();
			 p = list10000.get(500);
			 end = System.nanoTime();
				bListWriter.write("Getting person at index 500:  " + (end - start));
				bListWriter.newLine();
			///////////////
			start = System.nanoTime();
		
		
		list10000.remove(500);
		end = System.nanoTime();
		bListWriter.write("Removing person: " + p.getName() +" at index 500" + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		///////////////////
		start = System.nanoTime();
		
		list10000.search(new Person("Hello", "Dancer", 5.5), 0, list10000.size()-1);
		end = System.nanoTime();
		
		bListWriter.write("Search for person not in list: " + (end - start));
		bListWriter.write("\n");
		bListWriter.write("\n");
		bListWriter.newLine();
		bListWriter.newLine();
		/////////////////////
			
		
		
		
		
		
		DoubleLinkedList<Person> list100000 = new DoubleLinkedList<Person>();
			
			bListWriter.write("Array of 10000 People:");
			populate10000(list100000); //make it random persons
			///////////////
			start = System.nanoTime();
			list100000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
			end = System.nanoTime();
			bListWriter.write("Prepending Jackie Chan: " + (end - start));
			bListWriter.write("\n");
			bListWriter.newLine();
			/////////////
			start = System.nanoTime();
			list100000.append(new Person("John Cena", "Wrestler", 6.6));
			end = System.nanoTime();
			bListWriter.write("Appending John Cena " + (end - start));
			bListWriter.write("\n");
			bListWriter.newLine();
			/////////////////
			start = System.nanoTime();
			p = list100000.get(5000);
			end = System.nanoTime();
			bListWriter.write("Getting person at index 5000:   " + (end - start));
			bListWriter.write("\n");
			bListWriter.newLine();
			
			
			
			////////////////////
			start = System.nanoTime();
		
		
		list100000.remove(5000);
		end = System.nanoTime();
		bListWriter.write("Removing person" + p.getName() + "at index 5000:  " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		///////////////////
		start = System.nanoTime();
		
		list100000.search(new Person("Hello", "Dancer", 5.5), 0, list100000.size()-1);
		end = System.nanoTime();
		
		bListWriter.write("Search for person not in list: " + (end - start));	
		bListWriter.write("\n");
		bListWriter.write("\n");
		bListWriter.newLine();
		bListWriter.newLine();
		
			//////////////////////////////////////////
		DoubleLinkedList<Person> list1000000 = new DoubleLinkedList<Person>();
			bListWriter.write("Array of 100000 people:");
			populate100000(list1000000); //make it random persons
			///////////////
			start = System.nanoTime();
			list1000000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
			end = System.nanoTime();
			bListWriter.write("Prepending Jackie Chan: " + (end - start) + "\n");
			/////////////
			bListWriter.newLine();
			start = System.nanoTime();
			list1000000.append(new Person("John Cena", "Wrestler", 6.6));
			end = System.nanoTime();
			bListWriter.write("Appending John Cena " + (end - start)+ "\n");
			bListWriter.newLine();
			/////////////////
			start = System.nanoTime();
			p = list1000000.get(50000);
			end = System.nanoTime();
			bListWriter.write("Getting person at index 50000:  " + (end - start)+ "\n");
			bListWriter.newLine();
			////////////////////////////
			
			
			start = System.nanoTime();
		list1000000.remove(50000);
		end = System.nanoTime();
		bListWriter.write("Removing " + p.getName() +" person at index 50000:  " + (end - start)+ "\n");
		///////////////////
		bListWriter.newLine();
		start = System.nanoTime();
		
		list1000000.search(new Person("Hello", "Dancer", 5.5), 0, list1000000.size()-1);
		end = System.nanoTime();
		
		bListWriter.write("Search for person not in list: " + (end - start)+ "\n\n");		
		bListWriter.newLine();
		bListWriter.newLine();
			
			/////////////////////////////////////////////////
			/*
		
		DoubleLinkedList<Person> list10000000 = new DoubleLinkedList<Person>();
		bListWriter.write("Array of 1000000 people:");
		populate1000000(list10000000); //make it random persons
		///////////////
		start = System.nanoTime();
		list10000000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start) + "\n");
		/////////////
		bListWriter.newLine();
		start = System.nanoTime();
		list10000000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start)+ "\n");
		bListWriter.newLine();
		/////////////////
		start = System.nanoTime();
		p = list10000000.get(500000);
		end = System.nanoTime();
		bListWriter.write("Getting person at index 500000:  " + (end - start)+ "\n");
		bListWriter.newLine();
		////////////////////////////
		
		
		start = System.nanoTime();
		list10000000.remove(500000);
	end = System.nanoTime();
	bListWriter.write("Removing " + p.getName() +" person at index 500000:  " + (end - start)+ "\n");
	///////////////////
	bListWriter.newLine();
	start = System.nanoTime();
	
	list1000000.search(new Person("Hello", "Dancer", 5.5), 0, list10000000.size()-1);
	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start)+ "\n\n");		
	bListWriter.newLine();
	bListWriter.newLine();
		
		
		
		
		*/
			
			bListWriter.close();
			aListWriter.close();
			
			System.out.println("End");
			
			
			////////////////////////////////
			//end of arrayList testing.
			////////////////////////////////////////////
			
			
			
			
			
			
			
			
			
			

			
			}catch(IOException e) {
				System.out.println("Problem with file." + e.getMessage());
			}
			
			
		
	}










	static void createArrayListAttempt() {
		long start, end;
		File arrayList = new File("ArrayList.txt");
		try {
		
			arrayList.createNewFile(); //creates files to input intel about arraylist
			
		
	
		FileWriter aListWriter = new FileWriter(arrayList, false); //used to write into created file.
		
		
		
		ArrayList<Person> list1000 = new ArrayList<Person>(10);//array of 1000 ints
		aListWriter.write("Array of 10 people:");
		aListWriter.close();
		aListWriter = new FileWriter(arrayList, true);
		BufferedWriter bListWriter = new BufferedWriter(aListWriter);
		bListWriter.newLine();
		populateArray(list1000); //make it random persons
		///////////////
		start = System.nanoTime();
		list1000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////
		start = System.nanoTime();
		list1000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		
		/////////////////
		start = System.nanoTime();
		
		Person p = list1000.get(5);
		end = System.nanoTime();
		bListWriter.write("Getting person at location 5: " + (end - start));
		bListWriter.newLine();
		//////////////////
		start = System.nanoTime();
	list1000.remove(5);
	end = System.nanoTime();
	bListWriter.write("Removing: " + p.getName() + "at index 5:" + (end - start));
	bListWriter.write("\n");
	bListWriter.newLine();
	///////////////////
	start = System.nanoTime();
	list1000.search(new Person("Misc", "Wrestler", 6.6), 0, list1000.size()-1) ;

	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start));
	bListWriter.write("\n");
	bListWriter.write("\n");
	bListWriter.newLine();
	bListWriter.newLine();
	
	/////////////////////
		
	
	
	
	
	
	
	
	ArrayList<Person> list10000 = new ArrayList<Person>(1000);
	
		bListWriter.write("Array of 1000 People:");
		populateArray(list10000); //make it random persons
		///////////////
		start = System.nanoTime();
		list10000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////
		start = System.nanoTime();
		list10000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////////
		start = System.nanoTime();
		 p = list10000.get(500);
		 end = System.nanoTime();
			bListWriter.write("Getting person at index 500:  " + (end - start));
			bListWriter.newLine();
		///////////////
		start = System.nanoTime();
	
	
	list10000.remove(500);
	end = System.nanoTime();
	bListWriter.write("Removing person: " + p.getName() +" at index 500" + (end - start));
	bListWriter.write("\n");
	bListWriter.newLine();
	///////////////////
	start = System.nanoTime();
	
	list10000.search(new Person("Hello", "Dancer", 5.5), 0, list10000.size()-1);
	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start));
	bListWriter.write("\n");
	bListWriter.write("\n");
	bListWriter.newLine();
	bListWriter.newLine();
	/////////////////////
		
	
	
	
	
	
	ArrayList<Person> list100000 = new ArrayList<Person>(10000);
		
		bListWriter.write("Array of 10000 People:");
		populateArray(list100000); //make it random persons
		///////////////
		start = System.nanoTime();
		list100000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////
		start = System.nanoTime();
		list100000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////////
		start = System.nanoTime();
		p = list100000.get(5000);
		end = System.nanoTime();
		bListWriter.write("Getting person at index 5000:   " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		
		
		
		////////////////////
		start = System.nanoTime();
	
	
	list100000.remove(5000);
	end = System.nanoTime();
	bListWriter.write("Removing person" + p.getName() + "at index 5000:  " + (end - start));
	bListWriter.write("\n");
	bListWriter.newLine();
	///////////////////
	start = System.nanoTime();
	
	list100000.search(new Person("Hello", "Dancer", 5.5), 0, list100000.size()-1);
	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start));	
	bListWriter.write("\n");
	bListWriter.write("\n");
	bListWriter.newLine();
	bListWriter.newLine();
	
		//////////////////////////////////////////
	ArrayList<Person> list1000000 = new ArrayList<Person>(100000);
		bListWriter.write("Array of 100000 people:");
		populateArray(list1000000); //make it random persons
		///////////////
		start = System.nanoTime();
		list1000000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start) + "\n");
		/////////////
		bListWriter.newLine();
		start = System.nanoTime();
		list1000000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start)+ "\n");
		bListWriter.newLine();
		/////////////////
		start = System.nanoTime();
		p = list1000000.get(50000);
		end = System.nanoTime();
		bListWriter.write("Getting person at index 50000:  " + (end - start)+ "\n");
		bListWriter.newLine();
		////////////////////////////
		
		
		start = System.nanoTime();
	list1000000.remove(50000);
	end = System.nanoTime();
	bListWriter.write("Removing " + p.getName() +" person at index 50000:  " + (end - start)+ "\n");
	///////////////////
	bListWriter.newLine();
	start = System.nanoTime();
	
	list1000000.search(new Person("Hello", "Dancer", 5.5), 0, list1000000.size()-1);
	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start)+ "\n\n");		
	bListWriter.newLine();
	bListWriter.newLine();
		
		/////////////////////////////////////////////////
		
	
		
		bListWriter.close();
		aListWriter.close();
		System.out.println("End");
		
		
		////////////////////////////////
		//end of arrayList testing.
		////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		

		
		}catch(IOException e) {
			System.out.println("Problem with file." + e.getMessage());
		}
		
		
		
	}
	static void createLinkedListAttempt(){
		long start, end;
		File linkedList = new File("LinkedList.txt");
		try {
		
			linkedList.createNewFile(); //creates files to input intel about arraylist
			
		
	
		FileWriter aListWriter = new FileWriter(linkedList, false); //used to write into created file.
		
		
		
		LinkedList<Person> list1000 = new LinkedList<Person>();//array of 1000 ints
		aListWriter.write("Array of 100 people:");
		aListWriter.close();
		aListWriter = new FileWriter(linkedList, true);
		BufferedWriter bListWriter = new BufferedWriter(aListWriter);
		bListWriter.newLine();
		populate10(list1000); //make it random persons
		///////////////
		start = System.nanoTime();
		list1000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////
		start = System.nanoTime();
		list1000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		
		/////////////////
		start = System.nanoTime();
		
		Person p = list1000.get(5);
		end = System.nanoTime();
		bListWriter.write("Getting person at location 5: " + (end - start));
		bListWriter.newLine();
		//////////////////
		start = System.nanoTime();
	list1000.remove(5);
	end = System.nanoTime();
	bListWriter.write("Removing: " + p.getName() + "at index 5:" + (end - start));
	bListWriter.write("\n");
	bListWriter.newLine();
	///////////////////
	start = System.nanoTime();
	list1000.search(new Person("Misc", "Wrestler", 6.6), 0, list1000.size()-1) ;

	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start));
	bListWriter.write("\n");
	bListWriter.write("\n");
	bListWriter.newLine();
	bListWriter.newLine();
	
	/////////////////////
		
	
	
	
	
	
	
	
	LinkedList<Person> list10000 = new LinkedList<Person>();
	
		bListWriter.write("Array of 1000 People:");
		populate1000(list10000); //make it random persons
		///////////////
		start = System.nanoTime();
		list10000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////
		start = System.nanoTime();
		list10000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////////
		start = System.nanoTime();
		 p = list10000.get(500);
		 end = System.nanoTime();
			bListWriter.write("Getting person at index 500:  " + (end - start));
			bListWriter.newLine();
		///////////////
		start = System.nanoTime();
	
	
	list10000.remove(500);
	end = System.nanoTime();
	bListWriter.write("Removing person: " + p.getName() +" at index 500" + (end - start));
	bListWriter.write("\n");
	bListWriter.newLine();
	///////////////////
	start = System.nanoTime();
	
	list10000.search(new Person("Hello", "Dancer", 5.5), 0, list10000.size()-1);
	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start));
	bListWriter.write("\n");
	bListWriter.write("\n");
	bListWriter.newLine();
	bListWriter.newLine();
	
	/////////////////////
		
	
	
	
	
	
	LinkedList<Person> list100000 = new LinkedList<Person>();
		
		bListWriter.write("Array of 10000 People:");
		populate10000(list100000); //make it random persons
		///////////////
		start = System.nanoTime();
		list100000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////
		start = System.nanoTime();
		list100000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		/////////////////
		start = System.nanoTime();
		p = list100000.get(5000);
		end = System.nanoTime();
		bListWriter.write("Getting person at index 5000:   " + (end - start));
		bListWriter.write("\n");
		bListWriter.newLine();
		
		
		
		////////////////////
		start = System.nanoTime();
	
	
	list100000.remove(5000);
	end = System.nanoTime();
	bListWriter.write("Removing person" + p.getName() + "at index 5000:  " + (end - start));
	bListWriter.write("\n");
	bListWriter.newLine();
	///////////////////
	start = System.nanoTime();
	
	list100000.search(new Person("Hello", "Dancer", 5.5), 0, list100000.size()-1);
	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start));	
	bListWriter.write("\n");
	bListWriter.write("\n");
	bListWriter.newLine();
	bListWriter.newLine();
	
		//////////////////////////////////////////
	LinkedList<Person> list1000000 = new LinkedList<Person>();
		bListWriter.write("Array of 100000 people:");
		populate100000(list1000000); //make it random persons
		///////////////
		start = System.nanoTime();
		list1000000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start) + "\n");
		/////////////
		bListWriter.newLine();
		start = System.nanoTime();
		list1000000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start)+ "\n");
		bListWriter.newLine();
		/////////////////
		start = System.nanoTime();
		p = list1000000.get(50000);
		end = System.nanoTime();
		bListWriter.write("Getting person at index 50000:  " + (end - start)+ "\n");
		bListWriter.newLine();
		////////////////////////////
		
		
		start = System.nanoTime();
	list1000000.remove(50000);
	end = System.nanoTime();
	bListWriter.write("Removing " + p.getName() +" person at index 50000:  " + (end - start)+ "\n");
	///////////////////
	bListWriter.newLine();
	start = System.nanoTime();
	
	list1000000.search(new Person("Hello", "Dancer", 5.5), 0, list1000000.size()-1);
	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start)+ "\n\n");		
	bListWriter.newLine();
	bListWriter.newLine();
		
		/////////////////////////////////////////////////
		
/*
		//////////////////////////////////////////
	LinkedList<Person> list10000000 = new LinkedList<Person>();
		bListWriter.write("Array of 1000000 people:");
		populate1000000(list10000000); //make it random persons
		///////////////
		start = System.nanoTime();
		list10000000.prepend(new Person("Jackie Chan", "Fighter", 5.5));
		end = System.nanoTime();
		bListWriter.write("Prepending Jackie Chan: " + (end - start) + "\n");
		/////////////
		bListWriter.newLine();
		start = System.nanoTime();
		list10000000.append(new Person("John Cena", "Wrestler", 6.6));
		end = System.nanoTime();
		bListWriter.write("Appending John Cena " + (end - start)+ "\n");
		bListWriter.newLine();
		/////////////////
		start = System.nanoTime();
		p = list10000000.get(500000);
		end = System.nanoTime();
		bListWriter.write("Getting person at index 500000:  " + (end - start)+ "\n");
		bListWriter.newLine();
		////////////////////////////
		
		
		start = System.nanoTime();
		list10000000.remove(500000);
	end = System.nanoTime();
	bListWriter.write("Removing " + p.getName() +" person at index 500000:  " + (end - start)+ "\n");
	///////////////////
	bListWriter.newLine();
	start = System.nanoTime();
	
	list1000000.search(new Person("Hello", "Dancer", 5.5), 0, list10000000.size()-1);
	end = System.nanoTime();
	
	bListWriter.write("Search for person not in list: " + (end - start)+ "\n\n");		
	bListWriter.newLine();
	bListWriter.newLine();
		*/
		/////////////////////////////////////////////////
		
	
		
		
	
	
	
	
		
		bListWriter.close();
		aListWriter.close();
		System.out.println("End");
		
		
		
		
		
		
		
		
		
		////////////////////////////////
		//end of arrayList testing.
		////////////////////////////////////////////
		
		
		
		
		
		
		
		
		
		

		
		}catch(IOException e) {
			System.out.println("Problem with file." + e.getMessage());
		}
		
		
		
		
	
		
		
		
		
		
	}
	static void populateArray(List<Person> array)  {
		char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v','w', 'x', 'y','z'};
		int length  = array.size();
		for(int i = 0; i < length; i++) {
			double random = (double)(Math.random()*10);
			  int letter = (int)(Math.random() * ((25) + 1));
			String nameGenerator = "";
			nameGenerator += letters[letter]  ; 
			if(i ==0) {
				array.prepend(new Person(nameGenerator,nameGenerator, random));
				
			}
			else if(i == length) {
				array.append(new Person(nameGenerator,nameGenerator, random));
			}
			else {
			array.add(i,new Person(nameGenerator,nameGenerator, random));
			}
			}
			
		
			
		
		}
	static void populate10(List<Person> array)  {
		char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v','w', 'x', 'y','z'};
		int length  = array.size();
		for(int i = 0; i < 10; i++) {
			double random = (double)(Math.random()*10);
			  int letter = (int)(Math.random() * ((25) + 1));
			String nameGenerator = "";
			nameGenerator += letters[letter]  ; 

		
			array.add(i,new Person(nameGenerator,nameGenerator, random));
			
			
			
		
			
		
		}
	}

	static void populate100(List<Person> array)  {
		char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v','w', 'x', 'y','z'};
		int length  = array.size();
		for(int i = 0; i < 100; i++) {
			double random = (double)(Math.random()*10);
			  int letter = (int)(Math.random() * ((25) + 1));
			String nameGenerator = "";
			nameGenerator += letters[letter]  ; 

		
			array.add(i,new Person(nameGenerator,nameGenerator, random));
			
		}
			
		
			
		
		}
		static void populate1000(List<Person> array)  {
			char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v','w', 'x', 'y','z'};
			int length  = array.size();
			for(int i = 0; i < 1000; i++) {
				double random = (double)(Math.random()*10);
				  int letter = (int)(Math.random() * ((25) + 1));
				String nameGenerator = "";
				nameGenerator += letters[letter]  ; 

			
				array.add(i,new Person(nameGenerator,nameGenerator, random));
				
				
				
			
				
			
			}
	}
		static void populate10000(List<Person> array)  {
			char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v','w', 'x', 'y','z'};
			int length  = array.size();
			for(int i = 0; i < 10000; i++) {
				double random = (double)(Math.random()*10);
				  int letter = (int)(Math.random() * ((25) + 1));
				String nameGenerator = "";
				nameGenerator += letters[letter]  ; 

			
				array.add(i,new Person(nameGenerator,nameGenerator, random));
				
				
				
			
				
			
			}
	}
		static void populate100000(List<Person> array)  {
			char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v','w', 'x', 'y','z'};
			int length  = array.size();
			for(int i = 0; i < 100000; i++) {
				double random = (double)(Math.random()*10);
				  int letter = (int)(Math.random() * ((25) + 1));
				String nameGenerator = "";
				nameGenerator += letters[letter]  ; 

			
				array.add(i,new Person(nameGenerator,nameGenerator, random));
				
				
				
			
				
			
			}
	}
		static void populate1000000(List<Person> array)  {
			char letters[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u','v','w', 'x', 'y','z'};
			int length  = array.size();
			for(int i = 0; i < 1000000; i++) {
				double random = (double)(Math.random()*10);
				  int letter = (int)(Math.random() * ((25) + 1));
				String nameGenerator = "";
				nameGenerator += letters[letter]  ; 

			
				array.add(i,new Person(nameGenerator,nameGenerator, random));
			
		}
		}
}



