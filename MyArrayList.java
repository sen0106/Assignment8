

import java.util.ArrayList;

public class MyArrayList<Integer> extends ArrayList<Integer> {
	
	public void replaceAll(Integer a, Integer b) {
		for(int i = 0; i < this.size(); i++) {
			if (this.get(i) == a) {
				this.set(i, b);
			}
		}
	}
	
	public int lastIndexOf(Object value) {
		Integer v = (Integer) value;
		if(!this.contains(v)) {
			return -1;
		}
		int index = 0;
		for(int i = 0; i < this.size(); i++) {
			if (this.get(i) == v) {
				index = i;
			}
		}
		return index;
	}
}


