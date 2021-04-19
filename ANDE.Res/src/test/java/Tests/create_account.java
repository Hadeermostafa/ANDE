package Tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Core.Base;

public class create_account extends Base {
	
	@Test
	public void register() throws InterruptedException {
		

			
		Thread.sleep(10000);	
        WebElement primarylanguage = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/section/div/div[1]/div/div[2]/div[1]/div"));
		primarylanguage.click();
		Thread.sleep(100);
		List<WebElement>  droplist = driver.findElements(By.className("dropdown-item"));
		Thread.sleep(100);
	     for (int i = 0 ; i<droplist.size() ; i++) {

	         if(   droplist.get(i).getText().equals("Arabic")) {
	             droplist.get(i).click();}
	                                         }
				 
	    WebElement translanguage = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/section/div/div[2]/div/div[2]/div[1]/span/span[1]"));
	     translanguage.click();
	     Thread.sleep(100);
	     List<WebElement>  translist = driver.findElements(By.cssSelector("#select-other-languages li"));
	     Thread.sleep(100);
	

          for (int i = 0 ; i<translist.size() ; i++) {
        	  
        	  
            if(translist.get(i).getText().equals("French")) {
             translist.get(i).click();}
                                         }
	   
		
		WebElement restaurantname = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[1]/div[1]/input"));
		restaurantname.clear();
		restaurantname.sendKeys("Test");
		
	
		WebElement transbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div/button"));
		transbtn.click();
		Thread.sleep(300);
		WebElement transname = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/nametranslations/div/div[2]/div/div/input"));
		transname.sendKeys("translation");
		Thread.sleep(200);
		WebElement savebutton = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/nametranslations/div/div[3]/button[2]"));
		savebutton.click();
	
		
		Thread.sleep(300);
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		

		WebElement addphone = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/phonenumbers/div/div[2]/div/button"));
		addphone.click();
		WebElement phone = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/phonenumbers/div/div[1]/div/div[1]/input"));
		phone.clear();
		phone.sendKeys("01111111111"); 
				
		String logoname = "images.jpg";
		String imagepath = System.getProperty("user.dir")+"/images/"+logoname;
		WebElement uploadlogo = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[2]/singleimage/div[1]/input"));
		WebElement saveimage = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[2]/singleimage/div[3]/div/div/div[3]/button[2]"));
		uploadlogo.sendKeys(imagepath);
		Thread.sleep(5000);
		saveimage.click();
		
		
		js.executeScript("window.scrollBy(0,400)");
		
		
		String covername = "images2.png";
		String coverpath = System.getProperty("user.dir")+"/images/"+covername;
		WebElement uploadcover = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[3]/singleimage/div[1]/input"));
		WebElement savecover = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[3]/singleimage/div[3]/div/div/div[3]/button[2]"));
		uploadcover.sendKeys(coverpath);
		Thread.sleep(5000);
		savecover.click();
		
		
		WebElement description = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/textarea"));
		description.clear();
		description.sendKeys("description");
		
		
		WebElement descriptionbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div/button"));
		descriptionbtn .click();
		Thread.sleep(300);
		WebElement discname = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div/descriptiontranslations/div/div[2]/div/div/textarea"));
		discname.sendKeys("description");
		WebElement savedisc = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div/descriptiontranslations/div/div[3]/button[2]"));
		savedisc.click();
		
		
		js.executeScript("window.scrollBy(0,600)");
		
	
		
		 WebElement location = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[5]/div[1]/div/div/div[1]/div"));
		 location.click();
		 Thread.sleep(100);
		 List<WebElement>  locationlist = driver.findElements(By.cssSelector("#dropdown-country a"));
		 Thread.sleep(300);
	          for (int i = 0 ; i<locationlist.size() ; i++) {
	   
	            if(locationlist.get(i).getText().equals("Saudi Arabia")) {
	            	locationlist.get(i).click();}
	                                         }
	         
	          
	 	 WebElement currancy = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[5]/div[2]/div/div/div[1]/div"));
		 currancy.click();
		 Thread.sleep(100);
		 List<WebElement>  currancylist = driver.findElements(By.cssSelector("#dropdown-currency a"));
		 Thread.sleep(100);
			
		         for (int i = 0 ; i<currancylist .size() ; i++) {
		     	  
		            if(currancylist.get(i).getText().equals("SAR")) {
		            	currancylist.get(i).click();}
		                                         }
	
	        
	
		WebElement savebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[4]/button"));
		savebtn.click();
			
		
		
	

}}
