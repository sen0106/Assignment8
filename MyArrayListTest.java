import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyArrayListTest {

	@Test
	void test() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(11);
		list.add(-7);
		list.add(3);
		list.add(42);
		list.add(3);
		list.add(0);
		list.add(14);
		list.add(3);	
		MyArrayList<Integer> copy = new MyArrayList<Integer>();
		
		for(int i = 0; i < list.size(); i++) {
			copy.add(list.get(i));
		}
		
		System.out.println("Before replaced: " + list);
		System.out.println("This is copy" + copy);
		
		list.replaceAll(3, 999);
		System.out.println("After replaced: " + list);
		
		for(int i = 0; i < list.size(); i++) {
			if(i == 2 || i == 4 || i == 7) {
				assertTrue(list.get(i) == 999);
			}else {
				assertTrue(list.get(i) == copy.get(i));
			}
		}
		
		System.out.println();
		int target = 0;
		System.out.println("Last index of " + target + " is " + list.lastIndexOf(target));
		
		assertTrue(copy.indexOf(11) == 0);
		assertTrue(copy.indexOf(10) == -1);
	}

}
