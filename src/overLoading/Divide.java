package overLoading;

public class Divide extends Add {
	
	public void divide() {
		System.out.println("Abhishek Divide");
	}
	public void divide(int a) {
		System.out.println(a);
	}
	public void divide(int a,int b) {
		System.out.println(a/b);
	}

}
