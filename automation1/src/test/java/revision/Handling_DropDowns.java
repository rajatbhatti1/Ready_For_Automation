package revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Handling_DropDowns {

	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		handling auto suggestive field
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("In");
		Thread.sleep(2000);
		List<WebElement> option = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option1:option)
		{
			System.out.println(option1);
			if(option1.getText().equalsIgnoreCase("india"))
			{
				option1.click();
				break;
				
			}
		}
		
		//select two round trip option 
		
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		// selecting static drop down , select 2 adult 
		
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
		Thread.sleep(2000);
		for(int i=0;i<2;i++) // select two adults
		{
		driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		}
//		driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click(); used for loop instead of this
		driver.findElement(By.cssSelector("span[id='hrefIncChd']")).click(); //select one child
		driver.findElement(By.cssSelector("input[id='btnclosepaxoption']")).click(); //click on Done
		WebElement dropDown = driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']"));
		Select drop=new Select(dropDown);
		drop.selectByIndex(2);
		
		//Handling dynamic drop down
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click(); // click on drop down for starting location
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); //clicked on bangalore
		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); // click on goa , there are two way to click on goa that is first one
		driver.findElement(By.xpath("//div[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"] //a[@value='GOI']")).click(); // that is second one
		

		
//		//Handling checkboxes
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());	 //count of checkboxes on page
//		WebElement Senior_Checkbox = driver.findElement(By.cssSelector("input[id*='_SeniorCitizenDiscount']")); //click on senior checkbox
//		Senior_Checkbox.click();
//		System.out.println(Senior_Checkbox.isSelected()); //check if checkbox is selected or  not
		
		
//		//assertion 
//		
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());	 //count of checkboxes on page
//		int count_Checkbox=driver.findElements(By.cssSelector("input[type='checkbox']")).size(); //store the count in variable
//		WebElement Senior_Checkbox = driver.findElement(By.cssSelector("input[id*='_SeniorCitizenDiscount']")); //click on senior checkbox
//		Assert.assertFalse(Senior_Checkbox.isSelected()); // assertfalse means result should be false only
//		Senior_Checkbox.click();
//		Assert.assertTrue(Senior_Checkbox.isSelected()); //asserttrue means result should be true only
//		Assert.assertEquals(count_Checkbox, 7);
		
		
		//Handling current date calender , select depart date
		
		driver.findElement(By.cssSelector("a[class*='ui-state-active']")).click();
		
//		select return date
//		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).click();
//		driver.findElement(By.cssSelector("td[class*='ui-datepicker-week-end']  a[class*='ui-state-active']")).click(); //used parent child relationalship
		
		//Check whether the field is disable or not , First comment the code for that we used for selecting the round trip to check the disable field
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).isEnabled()); // not working as expected everytime
		
//		Another way to check the element is disable or not
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) //Use getDomAttribute() as getAttribute () is now deprecated
		{
			System.out.println("it is enabled");
			Assert.assertTrue(true);
		}
		
		else
		{
			System.out.println("It is disabled");
		}
		driver.close();
		
		
		
		
		
		
	}

}
