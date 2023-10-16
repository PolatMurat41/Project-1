import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyGame extends JPanel implements ActionListener, Runnable{
	private JButton btnStart,btnStop;
	private int x, y;
	private Thread myThread;
	// about menu item...
	
	private JMenuBar menuBar;
	private JMenu menuFile,menuHelp;
	private JMenuItem itemStart, itemStop,itemHelp, itemExit;
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(x, y, 100, 100);
	}
	
	public MyGame() {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		btnStart= new JButton("Start");
		btnStop= new JButton("Stop");
		add(btnStart, BorderLayout.WEST);
		add(btnStop,BorderLayout.EAST);
		x=20;
		y=100;
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		                              //diikat ettiysen bu sýnýf implement runnable bu yüzden thread olusturduk ve threadýn ýcýne bu sýnýfý komple atmamýz 
		myThread= new Thread(this);              //constructor thread objesýný içerdi                                    //lazým this de bunu yapýyor 
		//myThread.start();// start the thread
		// initialization for menu...
		
		menuBar = new JMenuBar();
		menuFile= new JMenu("File");
		menuHelp= new JMenu("Help");
		
		menuBar.add(menuFile);
		menuBar.add(menuHelp);
		
		add(menuBar, BorderLayout.NORTH);
		
		itemStart= new JMenuItem("start");
		itemStop = new JMenuItem("stop");
		itemHelp= new JMenuItem("help");
		itemExit= new JMenuItem("exit");
		
		// file ment
		menuFile.add(itemStart);
		menuFile.add(itemStop);
		// help menu
		
		menuHelp.add(itemHelp);
		menuHelp.add(itemExit);
		
		itemStart.addActionListener(this);
		itemStop.addActionListener(this);
		itemHelp.addActionListener(this);
		itemExit.addActionListener(this);
		
		
		
		
		setSize(1000, 800);
		setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(myThread==null) {
			myThread=new Thread(this);   //illa butonlara basýcaz dýye býsey yok sýra action performed e geldýmý threadýn null olmayacak sekýlde aktif ediyor 
		}
		
		
		if (e.getSource()==btnStart && !myThread.isAlive()) {  //&& !myThread.isAlive()  bu fantezi bence starta basmadan bu thread sýkseler calýsmaz 
			//start animation                                   //hem starta bas hemde thread ölü olsun istiyo starta basmadan zaten ölü olucak
			myThread.start();                                     //bu kýsým silinsede etki etmez 
		}
		else if(e.getSource()==btnStop) {
			//stop animation
			//myThread.interrupt();// send interrupt message
			//myThread=null;     //threadýn(calýsma parcacýgýnýn) null olmasý calýsmayý durdurmasý demektir .
		  myThread.stop();    //üstteki null ve interrupt yerine stop yazabilirsin üstü çizili olmasý stopun old school oldugunun iþareti eclipsede
		}
		
		else if(e.getSource()==itemStart && !myThread.isAlive()) {
				myThread.start();
			}
		else if(e.getSource()==itemStop) {
			myThread.interrupt();
			myThread=null;
		}
		else if(e.getSource()==itemExit) {
			System.exit(1);
		}
		else if(e.getSource()==itemHelp) {
			System.out.println("test Item....");
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		moveCircle(); // call the method
		
	}
	
	// move circle in an infinitive loop
	
	private void moveCircle() {   //for the diagonal move
		while (true) {
			try {
				Thread.sleep(10);  //Thread.currentThread().sleep(400)
				x=x+5;             //hýzý burasý belirler Timera gerek yok 
				repaint();
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				return; // exit from the loop
			}
		}
		
	}// end of the method


}












