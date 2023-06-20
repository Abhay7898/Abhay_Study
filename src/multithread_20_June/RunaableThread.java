package multithread_20_June;

public class RunaableThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new RunaableThread());
		t.start();
		
		Thread t1 = new Thread(new RunaableThread());
		t1.start();
		
	}

	
	
	
}
