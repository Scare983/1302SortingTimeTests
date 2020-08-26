/*
 * Person class
 * The object we decided to do was a person
 * We add random chars for the profession and name, and random number from 1-10 for height.
 * 
 * 
 * 
 */



import org.junit.Test;

public class Person implements Comparable<Person>{
	private String name;
	private double height;
	private String proffession;
	Person(String name, String proffession, double height) {
		
		this.name = name;
		this.proffession = proffession;
		this.height = height;
		
		
	}
	public String getName() {
		
		return name;
	}
	public double getHeight() {
		return height;
		
	}
	public String getProffession() {
		return proffession;
		
	}

	@Override
	public int compareTo(Person o) {
		if(getName() == o.getName() && getHeight() == o.getHeight() && getProffession() == o.getProffession()) {
			
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
	
}
