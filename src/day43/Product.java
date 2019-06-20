package day43;

public class Product {
/*
	Customer should be able to view 
	Product detail 

	noun -->> you can think of a class

	Customer 
		name, password,primemeber
		viewProduct() browse()

	Product 
	  name, rating, price , item

how to generate getters and setters?
    //right click, 
	//select source
	//select generate getters and setters
	//check the checkbox for the filed you want to set
	//then click generate
	


*/		 
	
	
	private String name;
	private float rating;
	private double price;
	private String productId;
	

	
	 // create a method to set the value of all fields
	
	public void initializeAllFieldValues(String name, float rating, double pricce, String productId) {
		
		this.name = name;
		this.rating = rating;
		this.price = price;
		//this.productId = productId;
		
		//optionally
		//you can do the above by calling setter method
		 setProductId(productId);
		 
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	
	
	
	
	
	
	
}
