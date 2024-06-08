package Odev;


import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        KuyrukLinkedList kuyruk = new KuyrukLinkedList();
		
        
		
		System.out.println("1. Kuyruğa Ekle");
        System.out.println("2. Kuyruktan Sil");
        System.out.println("3. Kuyruk Eleman Sayısı");
        System.out.println("4. Kuyrukda Ara");
        System.out.println("5. Kuyruk Listele");
        System.out.println("İstediğiniz komutu giriniz:");
        
        
        Eleman e1=new Eleman("Zehra","Unal",4,12);
        Eleman e2=new Eleman("Ali","Deniz",6,12);
        Eleman e3=new Eleman("Ceylin","Yener",1,12);
        Eleman e4=new Eleman("Fatih","Deniz",30,12);
        Eleman e5=new Eleman("Ece","Ugur",26,5598);
        kuyruk.Add(e1);
        kuyruk.Add(e2);
        kuyruk.Add(e3);
        kuyruk.Add(e4);
        kuyruk.Add(e5);
        
        int secim = scanner.nextInt();
        scanner.nextLine();
        
        switch(secim) {
        case 1:
        System.out.println("Kuyruğa eklenecek yeni adı giriniz:");
        String ad = scanner.nextLine();
        System.out.println("Kuyruğa eklenecek yeni soyadı giriniz:");
        String soyad = scanner.nextLine();
        System.out.println("Kuyruğa eklenecek yeni doğum tarihini giriniz:");
        int dogumTarihi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kuyruğa eklenecek yeni telefon numarasını giriniz:");
        double telefonNo = scanner.nextDouble();
        scanner.nextLine();
        Eleman yeni= new Eleman(ad, soyad, dogumTarihi,telefonNo);
        kuyruk.Add(yeni);
        kuyruk.listele();
        break;
        
        case 2: 
        	
        	kuyruk.delete();
        	break;
        case 3: 
        	kuyruk.elemansize();
        	break;
        case 4:
        	System.out.println("Aranacak elemanın adını giriniz:");
            String ad1 = scanner.nextLine();
        	kuyruk.search(ad1);
            break;
        case 5:
            kuyruk.listele();
            break;
        default:
            System.out.println("Geçersiz komut. Lütfen tekrar deneyin.");
            break;	
        }



	}

}
