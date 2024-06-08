package yeni1;

import java.util.*;

public class Slot {
	LinkedList<Object> slot=new LinkedList();
	public void Add(Object o) {
		if(slot.isEmpty()) {
			slot.add(o);
		}
		else {
			if(o.getClass().equals(slot.getFirst().getClass()))
				slot.add(o);
			else
				System.out.println("");
		}
	}
	public void Delete(int index) {
		slot.remove(index);
	}
}


