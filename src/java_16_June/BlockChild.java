package java_16_June;

public class BlockChild extends BlockParent {
	int i;

	static {
		System.out.println("Staic");
	}

	{
		i = 10;
	}

	BlockChild() {
		System.out.println("FiveKeyWord");
	}

	/*
	 * FiveKeyWord(int i) { System.out.println("Consctor " + i); }
	 */

	public static void main(String[] args) {

		BlockChild f = new BlockChild();

//		FiveKeyWord f1 = new FiveKeyWord(10);

	}

}
