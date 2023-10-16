
public class BilgiThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		//System.out.println("the run method...");
		hi();
	}
	
	public void hi() {
		int i =10;
		while(i<15) {
			try {
				sleep(400);
				System.out.println("bilgi");
			}
			catch (InterruptedException e) {
				// TODO: handle exception
		
			}
		i++;
		}
	}
	
	public void numbers() {
		for(int i=0;i<10;i++)
			System.out.println(i);
	}

}
