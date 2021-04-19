package dine_in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Core.Base;


public class Settings extends Base {
	
	
	@Test(priority = 1)
	public void DineInSetting_negative_numbers() throws InterruptedException {
		
		WebElement settingsbtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[1]/a/span"));
		settingsbtn.click();
		
		Thread.sleep(4000);		
		WebElement service = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[2]/form/div[1]/div[1]/div/div/input"));
		service.clear();
		service.sendKeys("-6");
		
		
		WebElement tax = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[2]/form/div[1]/div[2]/div/div/input"));
		tax.clear();
		tax.sendKeys("-13");
		
		
		WebElement savebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[2]/form/div[2]/button[1]"));
		savebtn.click();
		
	
	}
	
	
	@Test(priority = 2)
	public void DineInSetting_positive_numbers() throws InterruptedException {
				
		Thread.sleep(4000);		
		WebElement service = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[2]/form/div[1]/div[1]/div/div/input"));
		service.clear();
		service.sendKeys("5");
			
		
		WebElement tax = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[2]/form/div[1]/div[2]/div/div/input"));
		tax.clear();
		tax.sendKeys("10");
		

	}
	
	
	@Test(priority = 3)
	public void payment_methods() throws InterruptedException {
	
	
	WebElement cash = driver.findElement(By.id("_1"));
	cash.click();
	WebElement visa = driver.findElement(By.id("_2"));

	if (!visa.isSelected()) {
		visa.click();

	}
	
	
	WebElement savebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div/div[2]/form/div[2]/button[1]"));
	savebtn.click();
	

	}
	
	
	
	
	
	
	

}
