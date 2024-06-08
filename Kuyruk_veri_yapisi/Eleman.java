package Odev;



public class Eleman {
	String ad;
	String soyad;
	int dogum_tarihi;
	double telefon_num;
	Eleman ileri;
	Eleman(String ad,String soyad, int dogum_tarihi,double telefon_num){
		this.ad=ad;
		this.soyad=soyad;
		this.dogum_tarihi=dogum_tarihi;
		this.telefon_num=telefon_num;
		ileri=null;
	}

}
