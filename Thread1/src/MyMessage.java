
public class MyMessage implements Runnable{   //runnable interfacesi run metodunu içerir 
	private String msg;                  //runable ýnterfacesý var burdan býr sýnýf uretýp(run) threadlarýn ýcýne atmak lazým 
                                        //runnable sýnýfýný ýmplements ettýk ve burdaký run metodunu degýstýrdýk(override ettik)

	public MyMessage(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		hi();
		
	}
	public void hi() {
	int i =10;
		while(i<15) {
			try {
				Thread.currentThread().sleep(400);
				System.out.println(msg);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			  i++;
		}
   
	}

}
