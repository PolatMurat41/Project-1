
public class MyMessage implements Runnable{   //runnable interfacesi run metodunu i�erir 
	private String msg;                  //runable �nterfaces� var burdan b�r s�n�f uret�p(run) threadlar�n �c�ne atmak laz�m 
                                        //runnable s�n�f�n� �mplements ett�k ve burdak� run metodunu deg�st�rd�k(override ettik)

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
