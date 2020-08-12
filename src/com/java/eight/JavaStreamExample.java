package com.java.eight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString() {
    	return "Id: "+this.id+"name: "+this.name+"price: "+this.price;
    }
}  

public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        //printing the required field from the object
        productsList.stream().filter(p->p.price>30000).forEach(p->System.out.println(p.name));
        List<Float> rlist = productsList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
        rlist.forEach(l->System.out.println(l));
        //reduce() : the sum of numerics or accumulating the elements into collection
        Float sumValue = productsList.stream().map(p->p.price).reduce(0.0f,(sum,price)->sum+price);
        System.out.println(sumValue);
        //Collectors Methods : compute sum of numericvalues
        Double totalVal = productsList.stream().collect(Collectors.summingDouble(p->p.price));
        System.out.println(totalVal);
        //find min and max of product price
        Product min =productsList.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
        System.out.println("Min value :"+min.price);
        Product max =productsList.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
        System.out.println("Max value :"+max.price);
        //Count 
        //productsList.iterator().forEachRemaining(p->System.out.println(p.price));
        System.out.println("List count : "+productsList.stream().map(p->p.price).count());
        System.out.println("List count : "+productsList.stream().filter(p->p.price>30000).count());
        //convert list into set
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        Set<Float> plist = productsList.stream().filter(p->p.price>20000).map(p->p.price).collect(Collectors.toSet());
        plist.forEach(p->System.out.println(p));
        //converting list into map
        Map<String,Float> map = productsList.stream().collect(Collectors.toMap(p->p.name, p->p.price,(o,n)->n));
        System.out.println("Map : "+map);
        //Sorting Order
        productsList.stream().sorted((Product p1,Product p2)->(p1.name).compareTo(p2.name)).forEach(System.out::println);
        //sorting based on name length
        Comparator<Product> c = (Product p1,Product p2)->{
        	Integer l1 = p1.getName().length();
        	Integer l2 = p2.getName().length();
        	if(l1<l2) return -1;
        	else if(l1>l2) return +1;
        	else return p1.getName().compareTo(p2.getName());
        
        };
        System.out.println("**length sort**");
        productsList.stream().sorted(c).forEach(System.out::println);
	}
}

