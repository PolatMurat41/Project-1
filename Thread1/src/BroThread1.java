
public class BroThread1 {

	public static void main(String[] args) throws InterruptedException {
	
		//Thread =i� par�ac�g�   concurrency=e�zamanl�l�k
		
    //     System.out.println(Thread.activeCount());  //�uanda kac thread �al�s�yor //1
	//	 Thread.currentThread().setName("MAIN");   //suanda cal�san thread�n �sm�n� deg�st�rd�k main di MAIN yapt�k
    //    System.out.println(Thread.currentThread().getName()); //suanda cal�san thread�n ismi //MAIN		
	//	
    //    Thread.currentThread().setPriority(1);
    //     System.out.println(Thread.currentThread().getPriority());   //main threadinin �nem derecesini veerir skala 1 ile 10(en y�ksek) aras�nda //1
                                                                                                                     //Biz 1 yapt�k yoksa 5 di     
	
	//     System.out.println(Thread.currentThread().isAlive());  //thread yas�yomu cal�s�yomu d�ye sorar true false d�ndur�r //true
	
	/*
		for(int i=3;i>0;i--) {
		  System.out.println(i);
		  Thread.sleep(1000);   //bu threadi 1 saniye yapar basma h�z�n�
	  }
	
	System.out.println("you are done!");
	
	
	*/
		BroMyThread2 thread2=new BroMyThread2();
	   // thread2.start();                              //thread2.start() yaparsan hem thread alive olur hemde this thread is running yaz�l�r
		System.out.println(thread2.isAlive());	      //thread2.run()  yaparsan alive olmaz false gelir ama this thread is running yaz�l�r fonsiyon geregi
	
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon()); //false >>true
		  thread2.start();   //bu start� deamonun alt�na m� ustune m� yazd�g�n cok farket�yor yukar� yazarsan error al�yosun  
		
		thread2.setName("2nd thread");
	    System.out.println(thread2.getName());  //Thread-0  >>>2nd thread
	
	    thread2.setPriority(1);
	    System.out.println(thread2.getPriority());  //5 >>1
	
	    System.out.println(Thread.activeCount());  // suanda 2 thread cal�s�yor bi tanesi main metodu digeri de BroMyThread thread2.start() ac�k suan farkett�ysen	
	
	}//  A thread of execution in a program(kind of like a virtual CPU)
	
	
	
	//Daemon threads  is a low priority thread that runs in background to perform task such as garbage collection
	//jvm(java virtual machine)terminates itself when all user threads (non-deamon threads) finish their execution
	
	//Bir thread'i daemon olarak tan�mlad���m�z zaman uygulaman�n sonlanmas� i�in engel olu�turmayan bir thread olu�turdu�umuzu ifade ederiz. 
	//Bu thread'imiz �al��an ba�ka hi�bir thread kalmad���nda i�ini hen�z tamamlamam�� olsa dahi uygulamam�z sonlanacakt�r.
	
	
	//VM�in kendi kendine sonlanmas� i�in t�m User Thread tipindeki Thread�ler sonlanm�� olmal�d�r.
	//Thread�ler daemon olma/olmama durumunu kendilerini yaratan Thread�den al�rlar.
	//JVM�e ait �o�u Thread daemon tipindedir. �rne�in Garbage Collection Thread�leri. JVM sonlanmak i�in �al��makta olan bir Garbage Collection i�leminin tamamlanmas�n� beklemez.
	//Bir Thread start() edilmeden �nce daemon olup olmad���na karar verilmelidir. E�er �al��makta olan bir Thread �zerinde setDaemon(boolean) �a��r�rsan�z IllegalThreadStateException al�rs�n�z.
	//I/O benzeri kritik i�ler i�in daemon thread kullan�m� kesinlikle tavsiye edilmez. ��nk� JVM kapan�rken daemon thread�leri finally bloklar�n� bile �al��t�rmadan �ld�r�r.
	//Bu konular ile ilgili s�k duydu�um birka� yanl�� bilginin do�rular�n� yazay�m:

	//Daemon thread kendisini yaratan thread sonland���nda de�il, t�m user thread�ler sonland���nda JVM ile birlikte sonlan�r.
	//JVM sonland�ktan sonra hi�bir thread hayatta kalmaz. JVM bir process�dir ve onu �ld�rd���n
	
	
	
	
	
}

