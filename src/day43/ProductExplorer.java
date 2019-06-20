package day43;

public class ProductExplorer {

	public static void main(String[] args) {
		
		
		Product p1 = new Product();
		//p1.name = "something";
		p1.initializeAllFieldValues ("Wathc", 4.5f, 113.39,"123");
		
		System.out.println(p1. getName());
		System.out.println(p1. getRating());
		System.out.println(p1. getPrice());
		System.out.println(p1. getProductId());
		
		
		//20$ sale is going on, change the value of price
		p1.setPrice(113.39 - 20);
		
		
		
		String productInfo = " Bad, 4.9, 399.99, guccci12";
		//atke above String and turn it into Product Object
		
		String []productSplitted = productInfo.split(",");	
		// --Bag, 4,9,, 399,99, 3
		//   0     1     2      3
		
		
		
		// getting the product name using index 0
		String productName = productSplitted[0];
		// getting the product name using index 1
		//however our rating is a float so we need to convert String float
		//Float.parseFloat(strObject) --->> return float
		
		
		float productRating = Float.parseFloat(productSplitted[1]);
		// getting the product price using index 2
	    // however our price is a double so we need to convert String to double 
		//Double.parseDoble(strObject) --->> return double
		double productPrice = Double.parseDouble(productSplitted[2]);
		
		// getting the product id using index 3
		String productId = productSplitted[3];
		
		
		// creating new Object and call the method we created to set all field values
		Product p2 = new Product();
		p2.initializeAllFieldValues(productName,productRating,productPrice, productId);
		
		
		
		
		
	}

}
