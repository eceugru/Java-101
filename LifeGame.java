package Game;

import java.io.IOException;
public class LifeGame {
	
	
	
	final int habitatSatir = 19;
	final int habitatSutun = 19;
	
	
	int hucreHabitat[][];
	int hucreHabitatTmp[][];
	int[] pulsarSatir;
	int[] pSatir;
	int pulsarSutun[];
	
	
	
	public LifeGame() {
	// pulsar desni oluşması için gerekli ön tanımlamalar
	         pSatir = new int[] { 3, 8, 10, 15 };
	         pulsarSatir = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 };
	         pulsarSutun = new int[] { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 };
	// gerçek yaşam alanı ve değişikliklerin yapılacağı yedek yaşam alanı tanımı
	         hucreHabitat = new int[habitatSatir][habitatSutun];
	         hucreHabitatTmp = new int[habitatSatir][habitatSutun];
	// tüm yedek ve gerçek yaşam alanı sıfırlanıyor
	         int c = 0;
	         for (int i = 0; i < habitatSatir; i++) {
	                  for (int y = 0; y < habitatSutun; y++) {
	                           hucreHabitatTmp[i][y] = c;
	                           hucreHabitat[i][y] = c;
	
	}
	}
	// pulsar deseni gerçek yaşam alanına atanıyor
	        for (int satir = 0; satir < pSatir.length; satir++) {
	                  for (int sutun = 0; sutun < habitatSutun; sutun++) {
	                           hucreHabitat[pSatir[satir]][sutun] = pulsarSatir[sutun];
	}
	}
	       for (int sutun = 0; sutun < pSatir.length; sutun++) {
	                  for (int satir = 0; satir < habitatSutun; satir++) {
	                           hucreHabitat[satir][pSatir[sutun]] = pulsarSatir[satir];
	}
	}
	}
	
	
	
	
	
	public void drawHabitat() {
		for(int i = 1; i < habitatSatir-1; i++) {
			 for (int y = 1; y < habitatSutun-1; y++) {
				 if(hucreHabitat[i][y]==0) {
				 System.out.print("-");
				 }
				 else {
					 System.out.print("#");
				 }
			 }
			 System.out.println();
		}
	}
	
	public int komsuCanliSayisi(int satir, int sutun) {
		int canliKomsuSayisi=0;
		for(int i=-1;i<2;i++) {
			for(int j=-1;j<2;j++) {
				if(hucreHabitat[satir - i][sutun - j] == 1) {
					canliKomsuSayisi++;
				}
			}
		}
		if(hucreHabitat[satir][sutun]==1) {
			 canliKomsuSayisi--;
		}
		return canliKomsuSayisi;
	}
	
	public void newHabitatRule() {
		
		for(int i = 1; i < habitatSatir-1; i++) {
			 for (int y = 1; y < habitatSutun-1; y++) {
				int cks=komsuCanliSayisi(i,y);
				if(hucreHabitat[i][y]==1) {
					if(cks<2 || cks>3) {
						hucreHabitatTmp[i][y]=0;
					}
					else if (cks==2 || cks==3){
						hucreHabitatTmp[i][y]=1;
					}
				}
				else {
					if(cks==3) {
						hucreHabitatTmp[i][y]=1;
					}
					else {
						hucreHabitatTmp[i][y]=0;
					}
				}
			 }
		}
	}
		
	public void copyHabitat() {
		for(int i=0;i<habitatSatir;i++) {
			for(int y=0;y<habitatSutun;y++) {
				hucreHabitat[i][y]=hucreHabitatTmp[i][y];
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		LifeGame lg = new LifeGame();
		for (int i = 0; i < 20; i++) {
		lg.drawHabitat();
		lg.newHabitatRule();
		lg.copyHabitat();
		System.out.println();
		Thread.sleep(1500);
		}}


}
