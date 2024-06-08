package yeni1;

import java.util.LinkedList;

public class Envanter {

	public static void main(String[] args) {
		LinkedList<Slot> envanter=new LinkedList();
		Slot slot1= new Slot();
		Slot slot2= new Slot();
		Slot slot3= new Slot();
		Slot slot4= new Slot();
		Slot slot5= new Slot();
		envanter.add(slot1);
		envanter.add(slot2);
		envanter.add(slot3);
		envanter.add(slot4);
		envanter.add(slot5);
		Esya1 n1=new Esya1(1,2);
		Esya2 n2=new Esya2(4,2);
		Esya3 n3=new Esya3(5,2);
		Esya4 n4=new Esya4(6,2);
		Esya5 n5=new Esya5(7,2);
		slot1.Add(n1);

	}

}
