package revision;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcomTesting {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		List<WebElement> products = driver.findElements(By.className("product-name")); // grab all the elements which
//																						// product-name class
//
//		// iterate all the element till the product ends , for that we used size()
//		// method
//
//		for (int i = 0; i < products.size(); i++) {
//			// grab at product name at i-th position and for i-th position we used get()
//			// method and for getting the text we used getText() method
//			String product_name = products.get(i).getText();
//			System.out.println(product_name);
//			if (product_name.contains("Cucumber")) {
//				// click on 'add to cart' button which has cucumber as product name
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				break;
//
//			}
			// I have doubt for the below code, why this is not working
			// I grab all the element and iterate on all the element by for each foor and
			// then use if condition for cucumber
//			after entering into the if block i clicked on the 'add to cart' button of cucumber product

			/*
			 * List<WebElement> products =
			 * driver.findElements(By.className("product-name"));
			 * 
			 * for(WebElement product:products)
			 * 
			 * {
			 * 
			 * 
			 * if((product.getText().contains("Cucumber")))
			 * 
			 * {
			 * 
			 * System.out.println(product.getText());
			 * 
			 * 
			 * driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click(); }
			 * 
			 * }
			 * 
			 * }
			 * 
			 * 
			 * 
			 * }
			 */
//			-------------------------------------------------------------------------		

//			// Secanrio second : in first scenario we just add one product but if we want to add more than one product then what to do in that case?
//			// Use array concept  , add the product name in the array which u want to add in the cart
//			
//			// declare array
//			String[] product_List= {"Cucumber - 1 Kg","Brocolli - 1 Kg","Beetroot - 1 Kg"}; // array of strings
//			// now check whether the product name that we add is present or not in array.
//			// for that simple way we can convert array into arrayList becuse arrayList has a method that is contains()
//			// We can directly declare the arraylist, but we declare array becoz array takes lesser memory as compare to arraylist
//			
//			//convert array into arrayList
//			
//			List Product_ArrayList=Arrays.asList(product_List);
//			
//			
//			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//			List<WebElement> products = driver.findElements(By.className("product-name")); // grab all the elements which
//																							// product-name class
//
//			// iterate all the element till the product ends , for that we used size()
//			// method
//
//			for (int i = 0; i < products.size(); i++) {
//				// grab at product name at i-th position and for i-th position we used get()
//				// method and for getting the text we used getText() method
//				String product_name = products.get(i).getText();
//				System.out.println(product_name);
//				if (Product_ArrayList.contains(product_name)) {
//					// click on 'add to cart' button which has cucumber as product name
//					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				}
				

					//Scenario 3
//				---------------------------------------------------------------------------------------
// the above code will work fine in debug mode but if you run it simple then it will not work as expected as 'when you click on 'add t cart' button
//					then that button will change 'added' for a fraction of sec and the index of 'add to cart' is changed
					
					//This issue occure becoz we used the dynamic locator that is text locator
					// we can use static locator so lets do it
				
				
				String[] product_List= {"Cucumber - 1 Kg","Brocolli - 1 Kg","Beetroot - 1 Kg","Potato - 1 Kg"}; // array of strings
				// now check whether the product name that we add is present or not in array.
				// for that simple way we can convert array into arrayList becuse arrayList has a method that is contains()
				// We can directly declare the arraylist, but we declare array becoz array takes lesser memory as compare to arraylist
				
				//convert array into arrayList
				
				List Product_ArrayList=Arrays.asList(product_List);
				
				
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				List<WebElement> products = driver.findElements(By.className("product-name")); // grab all the elements which
																								// product-name class

				// iterate all the element till the product ends , for that we used size()
				// method

				for (int i = 0; i < products.size(); i++) {
					// grab at product name at i-th position and for i-th position we used get()
					// method and for getting the text we used getText() method
					String product_name = products.get(i).getText();
					System.out.println(product_name);
					if (Product_ArrayList.contains(product_name)) {
						// click on 'add to cart' button which has cucumber as product name
						driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
					}
				
		}
	}

}
