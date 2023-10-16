
public class MyTest {

	public static void main(String[] args) {
		
        
	//	Calculate c1= new Calculate(1,50);
	//	Calculate c2= new Calculate(51,100);
	//	c1.start();
	//	c2.start();
   //   System.out.println(c1.currentThread().isAlive());
	        
		MyMessage m1=new MyMessage("murat");      

		MyMessage m2 =new MyMessage("bilgi");   //MyMessage runnableden implement oldugu ýcýn bunlar ýcýn thread objeleri olusmalý 
		
        Thread thread1=new Thread(m1);
        Thread thread2=new Thread(m2);
	    
        thread1.start();
        try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        thread2.start();
   
	
		
        
	// 	BilgiThread bilgi= new BilgiThread();
		//		bilgi.run();
		//		System.out.println(bilgi.isAlive());  //false cunku run calýsýrsa ýslem yapýlýr thread start ýle aktýf olur 
			//	bilgi.start();
		//		System.out.println(bilgi.isAlive()); //true oldu 
				
			//	System.out.println(Thread.currentThread().getId());//1
			//	System.out.println(bilgi.getId());  //15
			//	System.out.println(Thread.currentThread().getName()); //main   //sistem önce kritik bilgileri getiriyo sonra start ile olan metotlarý yazýyo
			//	System.out.println(bilgi.getName());  //thread 0
			//	System.out.println(Thread.activeCount());  //suanda 2 thread active
				//bilgi.hi();
				//bilgi.run();
				//bilgi.start();
				//bilgi.numbers();
				//System.out.println("End of the main");
				// Test MyMessage class
				
	

}}
