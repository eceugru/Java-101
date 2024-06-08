package yeni;

public class Dugum {
	int icerik;
	Dugum sag;
	Dugum sol;
	int boyut;
	Dugum(int icerik){
		this.icerik=icerik;
		boyut=0;
		sag=null;
		sol=null;
	}
	int hight(Dugum N) {
		if(N==null) return 0;
		return N.boyut;
	}
	void rotasyon() {
		
		if(this.boyut>2) {
			int kokSagBoyut=this.sag.boyut;
			int KokSolBoyut=this.sol.boyut;
			if(Math.abs((kokSagBoyut)-(KokSolBoyut))==2) {
				System.out.println("Dengesiz ağaç");
			}else {
				System.out.println("Dengeli ağaç");
			}
			
		}
	}
	public void araGezinti() {
		if(sol != null) {
			sol.araGezinti();
		}
		System.out.println(icerik);
		if(sag != null) {
			sag.araGezinti();
		}}
	
	void ekle(Dugum yeni) {
		if(yeni.icerik>this.icerik) {
			if(sag==null) {
				this.sag=yeni;
			}
			else {
				sag.ekle(yeni);
			}
		}else {
			if(sol==null) {
				this.sol=yeni;
				
			}else {
				sol.ekle(yeni);
			}
		}
		int sagboy, solboy;
		if(this.sag==null) {
			sagboy=0;
		}else {
			sagboy=this.sag.boyut;
		}
		if(this.sol==null) {
			solboy=0;
		}else {
			solboy=this.sol.boyut;
		}
		this.boyut=Math.max(sagboy, solboy)+1;
		int fark=Math.abs(sagboy-solboy);
	
	}

}
