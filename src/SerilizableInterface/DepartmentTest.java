package SerilizableInterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DepartmentTest {

public static void main(String[] args) throws IOException, ClassNotFoundException {
	
        Department a = new Department();
        a.setAge(10);
        a.setName("Abahay");
        a.setRollno(29);
        a.setSalary(20000);
  
        // Serializing 'a'
        FileOutputStream fos = new FileOutputStream("D://abhay.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(a);
  
        
        
        
        
        // De-serializing 'a'
        FileInputStream fis= new FileInputStream("D://abhay.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Department b = (Department) ois.readObject(); // down-casting object
  
        System.out.println(b.getAge() + " " + b.getName()+" "+b.getRollno()+" "+b.getSalary());
  
        // closing streams
        oos.close();
        ois.close();
    }
	
}
