package BST;

import java.util.*;

public class AnaSinif {

	public static void main(String[] args) {
		Scanner mycevap= new Scanner(System.in);
		
		bst b1=new bst();
		System.out.println("ad:");
		String ad=mycevap.nextLine();
		
		Node n1=new Node("Cafer");
		Node n2=new Node("Deniz");
		Node n3=new Node("Beyza");
		Node n4=new Node("Ali");
		Node n5=new Node(ad);
		Node n6= new Node("Ceylin");
		Node n7= new Node("Bz");
		b1.add(n1);
		b1.add(n2);
		b1.add(n3);
		b1.add(n4);
		b1.add(n5);
		b1.add(n6);
		b1.add(n7);
		
		//n1.onGezinti();
		n1.onGezinti();
		

	}

}
