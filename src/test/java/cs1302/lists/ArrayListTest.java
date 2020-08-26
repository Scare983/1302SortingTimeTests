
import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListTest {

	
	
	@Test
	public void testAppend() {
		ArrayList<Person> list = new ArrayList<Person>(1);//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		list.append(p);
		assertEquals(p, list.get(list.size()-1));
	//	fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		ArrayList<Person> list = new ArrayList<Person>(3);//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		list.add(1, p);
		assertEquals(p, list.get(1));
	
	}


	@Test
	public void testPrepend() {
		ArrayList<Person> list = new ArrayList<Person>(1);//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		list.prepend(p);
		
		assertEquals(p, list.get(0));
		
	}

	@Test
	public void testRemove() {
		ArrayList<Person> list = new ArrayList<Person>(1);//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		list.prepend(p);
		list.remove(0);
		
			assertTrue(list.get(0) != p);
	}

	@Test
	public void testSearch() {
		ArrayList<Person> list = new ArrayList<Person>(1);//create list of 5 ppl
		Person p = new Person("Kevin", "Coder", 5.9);
		if(list.search(p, 0, list.size()-1) != -1) ;
			
			
		
		
	}

}
