
import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testAppend() {
		
		LinkedList<Person> list = new LinkedList<Person>();//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		list.append(p);
		assertEquals(p, list.get(list.size()-1));
	}

	@Test
	public void testPrepend() {
		LinkedList<Person> list = new LinkedList<Person>();//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		list.prepend(p);
		
		assertEquals(p, list.get(0));
	
	}

	@Test
	public void testAdd() {
		LinkedList<Person> list = new LinkedList<Person>();//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		Person q =  new Person("Charlie", "Coder", 5.9);
		list.add(0, q);
		list.add(1, p);
		assertEquals(p, list.get(1));
	}



	@Test
	public void testRemove() {
		LinkedList<Person> list = new LinkedList<Person>();//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		Person q =  new Person("Charlie", "Coder", 5.9);
		Person z =  new Person("s", "Coder", 5.9);
		list.add(0, q);
		list.prepend(p);
		list.append(z);
		
		list.remove(1);
	
			assertTrue(list.get(1) != q);
	}

	@Test
	public void testSearch() {
		LinkedList<Person> list = new LinkedList<Person>();//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		if(list.search(p, 0, list.size()-1) != -1) ;
			
			
	}

}
