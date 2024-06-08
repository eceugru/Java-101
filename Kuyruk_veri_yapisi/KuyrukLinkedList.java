package Odev;

import java.util.*;



public class KuyrukLinkedList {
	
	 private LinkedList<Eleman> kuyrukList;
	 
	 public KuyrukLinkedList() {
	        kuyrukList = new LinkedList<>();
	    }
	 
	 
	 public boolean bos() {
		 return kuyrukList.isEmpty();
	 }
	 public void Add(Eleman yeni) {
		 kuyrukList.addLast(yeni);
	 }
	 
	 
	 public void delete() { //bastan delete
		 if(bos()) {
			 System.out.println("Kuyruk boş");
		 }
		 Eleman yeni=kuyrukList.removeFirst();
		 System.out.println("Kuyruktan silinen kişi: "+yeni.ad+" "+yeni.soyad+" "+yeni.dogum_tarihi+" "+yeni.telefon_num);
		 System.out.println("Silme işlemi tamamlanmıştır");
	 }
	 public void elemansize() {
		 int yeni=kuyrukList.size();
		 System.out.println("Kuyrukda "+yeni+" adet eleman vardır.");
	 }
	 
	
	Eleman search(String ad) {
	    Eleman tmp = null;
	    int sira = 0;
	    
	    for (int i = 0; i < kuyrukList.size(); i++) {
	        sira++;
	        tmp = kuyrukList.get(i);
	        if (ad.equals(tmp.ad)) {
	            System.out.println("Aranan isim kuyruğun " + sira + ". sırasında bulunuyor.");
	            return tmp;
	        }
	    }
	    
	    System.out.println("Kuyrukta aranan " + ad + " bulunamadı.");
	    return null;
	}

	
	 public void listele() {
		 
	        if (!kuyrukList.isEmpty()) {
	            for (Eleman eleman : kuyrukList) {
	                System.out.println("Ad:"+eleman.ad+" "+"Soyad:"+eleman.soyad+" "+"Doğum tarihi:"+eleman.dogum_tarihi+" "+"Telefon numarası:"+eleman.telefon_num);
	            }
	        } else {
	            System.out.println("Kuyruk boş.");
	        }
	    }
	
	

}
