package Yeni;

import java.util.LinkedList;


public class Karma {
	LinkedList<Eleman>[] bl;
	public Karma() {
		bl=new LinkedList[29];
		for(int i=0; i<29; i++) {
			bl[i]=new LinkedList();
		}
	}
	
	char alfabe[]={'a','b','c','ç','d','e','f','g','ğ','h','i','ı','j','k','l','m','n','o','p','r','s','ş','t','u','ü','v','y','z'};
	
	public void Add(Eleman yeni) {
		for(int i=0; i<alfabe.length;i++) {
			if(alfabe[i]==yeni.isim.toLowerCase().charAt(0)) {
				bl[i].addFirst(yeni);
			}
	    }
	}
	
	
	public void delete(Eleman yeni) {
		char m=yeni.isim.toLowerCase().charAt(0);
		for(int i=0;i<29;i++) {
				if(alfabe[i]==m) {// liste char karşılaştırması yapmakta
					for (Eleman eleman:bl[i]) { //ilgili alandaki listenin içinde arama yapmakta
						if(eleman.isim==yeni.isim) {
							bl[i].remove(eleman);
							return;
						}
					}
				}
			}
	}
	
	public void cekeme(Eleman yeni) {
		char m=yeni.isim.toLowerCase().charAt(0);
		for(int i=0;i<29;i++) {
				if(alfabe[i]==m) {
						if(bl[i].contains(yeni)) {
							System.out.println("İsim: "+yeni.isim+" "+"Soyisim: "+yeni.soyisim+" "+"Telefon Numarası: "+yeni.telno);
							return;
						}
						else {
							System.out.println("Eleman yoktur.");
							return;
						}
					}
		   }
	 }
	
	public void lenght() {
		int sayac=0;
		for(int i=0;i<29;i++) {
			for(Eleman eleman: bl[i]) {
				sayac++;
			}
		}
		System.out.println("Karma Tabloda "+sayac+" Tane Eleman Bulunmaktadır.");
	}
	
	public void durumag_Lenght(char harf) {
		char harf1=Character.toLowerCase(harf);
		int sayac=0;
		for(int i=0; i<29;i++) {
			for(Eleman eleman:bl[i]) {//begenmedim :/
				if(alfabe[i]==harf1) {
					sayac++;
				}
			}
		}
		System.out.println("'"+harf+"' Harfine Ait Karma Tablo Eleman Sayısı "+sayac+"'dir");
	}
	
	public void listele() {
		for(int i=0;i<28;i++) {
			System.out.println(alfabe[i]+"-->");
			for(Eleman eleman :bl[i]) {                  // tekrar bak
				System.out.print(eleman.isim+" ");
			}
			System.out.println();
		}
	}
	
	public void duruma_gListeleme(char harf) {
		char harf1=Character.toLowerCase(harf);
		for(int i=0;i<29;i++) {
			for(Eleman eleman: bl[i]) {
				if(alfabe[i]==harf1) {
					System.out.println("İsim: "+eleman.isim+" "+"Soyisim: "+eleman.soyisim+" "+"Telefon Numarası: "+eleman.telno);
				}
			}
		}
	}
}
