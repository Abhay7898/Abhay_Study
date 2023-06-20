package multithread_20_June;

public class RunableWithFuncnalInterface {
	static void print() {
		System.out.println("Hello");
		
		synchronized (new Thread()) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Runnable r = () -> {
			print();
		};
		Thread t = new Thread(r);
		t.start();

		Thread t1 = new Thread(r);
		t1.start();
	}
}
