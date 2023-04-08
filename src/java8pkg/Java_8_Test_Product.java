package java8pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java_8_Test_Product {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
     //   productsList = productsList.stream().filter(p -> p.getId() < 2).collect(Collectors.toList());
        
     //  List<Float> list = productsList.stream().map(e  -> e.getPrice() + 1000).toList();
        
  //     List<String> list = productsList.stream().filter(s -> s.getPrice() > 25000).map(e -> e.getName()).toList(); 
        
       List<String> list = productsList.stream().map(Product :: getName).toList(); 

		/*
		 * list.stream().forEach(e -> { System.out.println(e); });
		 */
       
       list.stream().forEach(System.out :: println);
       
		
		

	}

}
