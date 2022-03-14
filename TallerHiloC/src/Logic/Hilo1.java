package Logic;


public class Hilo1 implements Runnable  {
	
	public void run() {
		new Thread(new Runnable() {
			public void run() {
				while(true) {
					
				for(int i=1;i<5000;i++) {
				System.out.println("A" + i); 
				
				try {
					
					Thread.sleep((int)(Math.random()*(8000-2000+1)+2000));
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				}
			}
			}
			
		}).start();	
	}

	
}
