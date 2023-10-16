
public class Calculate extends Thread{       //farkettiysen thread sýnýflarý hep bölünüyo bunun adý calculate mesela
	private int b,t;                            
	public int sum;
	
	public Calculate(int b, int t) {   //bunun anlamýný daha once yazmýstým burdaki this eþitlemeleri bu constructora gýrdýgýn bilgiler baska 
		this.b=b;                         //sýnýfta olur cok uzaklarda olur :) this.b ye eþit yani bizim private int b ve t miz var onlara 
		this.t=t;
		sum=0;            //sum ise asla degiþemez degiþme operörü koymadýk 0 a eþit 
	}
	
	private void sumNubmers() {
		for(int i=b;i<=t;i++)
		 
		System.out.println(sum=sum+i);	  
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		sumNubmers();
	}

}
