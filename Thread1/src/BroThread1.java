
public class BroThread1 {

	public static void main(String[] args) throws InterruptedException {
	
		//Thread =iþ parçacýgý   concurrency=eþzamanlýlýk
		
    //     System.out.println(Thread.activeCount());  //þuanda kac thread çalýsýyor //1
	//	 Thread.currentThread().setName("MAIN");   //suanda calýsan threadýn ýsmýný degýstýrdýk main di MAIN yaptýk
    //    System.out.println(Thread.currentThread().getName()); //suanda calýsan threadýn ismi //MAIN		
	//	
    //    Thread.currentThread().setPriority(1);
    //     System.out.println(Thread.currentThread().getPriority());   //main threadinin önem derecesini veerir skala 1 ile 10(en yüksek) arasýnda //1
                                                                                                                     //Biz 1 yaptýk yoksa 5 di     
	
	//     System.out.println(Thread.currentThread().isAlive());  //thread yasýyomu calýsýyomu dýye sorar true false döndurür //true
	
	/*
		for(int i=3;i>0;i--) {
		  System.out.println(i);
		  Thread.sleep(1000);   //bu threadi 1 saniye yapar basma hýzýný
	  }
	
	System.out.println("you are done!");
	
	
	*/
		BroMyThread2 thread2=new BroMyThread2();
	   // thread2.start();                              //thread2.start() yaparsan hem thread alive olur hemde this thread is running yazýlýr
		System.out.println(thread2.isAlive());	      //thread2.run()  yaparsan alive olmaz false gelir ama this thread is running yazýlýr fonsiyon geregi
	
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon()); //false >>true
		  thread2.start();   //bu startý deamonun altýna mý ustune mý yazdýgýn cok farketýyor yukarý yazarsan error alýyosun  
		
		thread2.setName("2nd thread");
	    System.out.println(thread2.getName());  //Thread-0  >>>2nd thread
	
	    thread2.setPriority(1);
	    System.out.println(thread2.getPriority());  //5 >>1
	
	    System.out.println(Thread.activeCount());  // suanda 2 thread calýsýyor bi tanesi main metodu digeri de BroMyThread thread2.start() acýk suan farkettýysen	
	
	}//  A thread of execution in a program(kind of like a virtual CPU)
	
	
	
	//Daemon threads  is a low priority thread that runs in background to perform task such as garbage collection
	//jvm(java virtual machine)terminates itself when all user threads (non-deamon threads) finish their execution
	
	//Bir thread'i daemon olarak tanýmladýðýmýz zaman uygulamanýn sonlanmasý için engel oluþturmayan bir thread oluþturduðumuzu ifade ederiz. 
	//Bu thread'imiz çalýþan baþka hiçbir thread kalmadýðýnda iþini henüz tamamlamamýþ olsa dahi uygulamamýz sonlanacaktýr.
	
	
	//VM’in kendi kendine sonlanmasý için tüm User Thread tipindeki Thread’ler sonlanmýþ olmalýdýr.
	//Thread’ler daemon olma/olmama durumunu kendilerini yaratan Thread’den alýrlar.
	//JVM’e ait çoðu Thread daemon tipindedir. Örneðin Garbage Collection Thread’leri. JVM sonlanmak için çalýþmakta olan bir Garbage Collection iþleminin tamamlanmasýný beklemez.
	//Bir Thread start() edilmeden önce daemon olup olmadýðýna karar verilmelidir. Eðer çalýþmakta olan bir Thread üzerinde setDaemon(boolean) çaðýrýrsanýz IllegalThreadStateException alýrsýnýz.
	//I/O benzeri kritik iþler için daemon thread kullanýmý kesinlikle tavsiye edilmez. Çünkü JVM kapanýrken daemon thread’leri finally bloklarýný bile çalýþtýrmadan öldürür.
	//Bu konular ile ilgili sýk duyduðum birkaç yanlýþ bilginin doðrularýný yazayým:

	//Daemon thread kendisini yaratan thread sonlandýðýnda deðil, tüm user thread’ler sonlandýðýnda JVM ile birlikte sonlanýr.
	//JVM sonlandýktan sonra hiçbir thread hayatta kalmaz. JVM bir process’dir ve onu öldürdüðün
	
	
	
	
	
}

