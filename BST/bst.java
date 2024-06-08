package BST;

public class bst {
	Node kok;
	bst(){
		kok=null;
	}
	
	public void add(Node yeni) {
		Node tmp=kok;
		Node ebeveyin=tmp;
		if(kok==null) {
			kok=yeni;
			return;
		}
		while(tmp!=null) {
			ebeveyin=tmp;
			int result=tmp.ad.compareTo(yeni.ad);
			if(result<0) {
				tmp=tmp.sag;
			}else {
				tmp=tmp.sol;
			}
		}
		int result1=ebeveyin.ad.compareTo(yeni.ad);
		if(result1<0) {
			ebeveyin.sag=yeni;
		}
		else {
			ebeveyin.sol=yeni;
		}
		
	}
	
	
}
