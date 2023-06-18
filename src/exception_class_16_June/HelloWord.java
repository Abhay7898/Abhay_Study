package exception_class_16_June;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HelloWord {

	public void hi() throws IOException {
		System.out.println("HI");
	}

	public void fileRead() throws FileNotFoundException {
		FileReader fr = new FileReader("C:/hello/hello.txt");
	}

	public void add() throws NullPointerException {

	}

	public void fileWrite() {
		try {
			FileReader fr = new FileReader("C:/hello/hello.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void get() {
		try {
			FileReader fr = new FileReader("C:/hello/hello.txt");
		} catch (FileNotFoundException e) {
			throw new NullPointerException();
		}
	}

	public void put() throws FileNotFoundException {
		try {
			FileReader fr = new FileReader("C:/hello/hello.txt");
		} catch (FileNotFoundException e) {
			throw e;
		}
	}

	public void optin() throws FileNotFoundException {
		try {
			FileReader fr = new FileReader("C:/hello/hello.txt");
		} catch (FileNotFoundException e) {
			throw new NullPointerException();
		}
	}

	public void delete() throws Exception {
		try {
			FileReader fr = new FileReader("C:/hello/hello.txt");
		} catch (FileNotFoundException e) {
			throw new NullPointerException();
		}
	}

	public void h1() throws FileNotFoundException {
		try {
			FileReader fr = new FileReader("C:/hello/hello.txt");
		} catch (FileNotFoundException e) {

		}
	}

	public void h2() throws Exception {
		try {
			FileReader fr = new FileReader("C:/hello/hello.txt");
		} catch (FileNotFoundException e) {

		}
	}

	public void h3() throws RuntimeException {
		try {
			FileReader fr = new FileReader("C:/hello/hello.txt");
		} catch (FileNotFoundException e) {

		}
	}
	
	public void h4() throws IOException {
		try {
			FileReader fr = new FileReader("C:/hello/hello.txt");
		} catch (FileNotFoundException e) {

		}
	}
}
