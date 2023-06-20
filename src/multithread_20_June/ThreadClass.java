package multithread_20_June;

public class ThreadClass extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String args[]) throws InterruptedException {

		ThreadClass t1 = new ThreadClass();
		t1.start();
		t1.sleep(100);
		t1.stop();
	}

}
