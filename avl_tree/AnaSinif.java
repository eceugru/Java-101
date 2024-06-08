package yeni;

public class AnaSinif {

	public static void main(String[] args) {
		Dugum kok= new Dugum(100);
		Dugum e1= new Dugum(50);
		Dugum e2= new Dugum(200);
		Dugum e3= new Dugum(10);
		Dugum e4= new Dugum(40);
		Dugum e5= new Dugum(190);
		Dugum e6= new Dugum(210);
		kok.ekle(e1);
		kok.ekle(e2);
		kok.ekle(e3);
		kok.ekle(e4);
		kok.ekle(e5);
		kok.ekle(e6);
		kok.rotasyon();
		kok.araGezinti();
	}

}
