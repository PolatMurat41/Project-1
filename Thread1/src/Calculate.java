
public class Calculate extends Thread{       //farkettiysen thread s�n�flar� hep b�l�n�yo bunun ad� calculate mesela
	private int b,t;                            
	public int sum;
	
	public Calculate(int b, int t) {   //bunun anlam�n� daha once yazm�st�m burdaki this e�itlemeleri bu constructora g�rd�g�n bilgiler baska 
		this.b=b;                         //s�n�fta olur cok uzaklarda olur :) this.b ye e�it yani bizim private int b ve t miz var onlara 
		this.t=t;
		sum=0;            //sum ise asla degi�emez degi�me oper�r� koymad�k 0 a e�it 
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
