package Yeni;

public class AnaSinif {

	public static void main(String[] args) {
		Karma k= new Karma();
		Eleman e=new Eleman("Ali","Özer",123);
		Eleman e1=new Eleman("Ece","Ugur",948);
		Eleman e8=new Eleman("Elif","Dönmez",4658);
		Eleman e7=new Eleman("Efe","Güzel",225);
		Eleman e6=new Eleman("Enes","Erol",457);
		
		Eleman x=new Eleman("Mehtap","Dere",845);
		
		Eleman e2=new Eleman("Zehra","Güzel",464);
		Eleman e3=new Eleman("Kemal","Eser",239);
		Eleman e4=new Eleman("Fuat","Dağ",12);
		Eleman e5=new Eleman("Zerrin","Kısmet",1);
		
		k.Add(e);    //Karma Tabloya eleman ekleme
		k.Add(e1);
		k.Add(e2);
		k.Add(e3);
		k.Add(e4);
		k.Add(e5);
		k.Add(e6);
		k.Add(e7);
		k.Add(e8);
		
		
		k.listele();   //Tüm Karma Tablo listeleme
		System.out.println("--------------------------------------------------");
		k.lenght();    //Tüm Karma Tablo eleman sayısı
		System.out.println("--------------------------------------------------");
		k.duruma_gListeleme('e');  //Herhangi bir harfe  ait Karma Tablo listeleme
		System.out.println("--------------------------------------------------");
		k.durumag_Lenght('z');    //Herhangi bir harfe ait Karma Tablo eleman sayısı
		System.out.println("--------------------------------------------------");
		k.delete(e6); //Eleman silme
		k.listele();
		System.out.println("--------------------------------------------------");
		k.cekeme(x); //Eleman çekme
		System.out.println("--------------------------------------------------");
		k.cekeme(e5);
	}

}
