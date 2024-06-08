package BST;

public class Node {
	String ad;
	Node sag;
	Node sol;
	Node(String ad){
		this.ad=ad;
		sag=null;
		sol=null;
	}
	void onGezinti() {
		System.out.println(ad);
		if(sol!=null) {
			sol.onGezinti();
		}
		if(sag!=null) {
			sag.onGezinti();
		}
	}

}
