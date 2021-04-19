package Tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Core.Base;

public class EditProfile extends Base{

	
	@Test
	public void register() throws InterruptedException {
		
	
		Thread.sleep(10000);
        WebElement editbtn = driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li/a"));
		editbtn.click();
	
		Thread.sleep(100);
		
        WebElement editlanguage = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/section/div/div[1]/div/div[2]/div[1]/div"));
		editlanguage.click();
		Thread.sleep(100);
		List<WebElement>  droplist = driver.findElements(By.className("dropdown-item"));
		Thread.sleep(100);
	     for (int i = 0 ; i<droplist.size() ; i++) {

	         if(   droplist.get(i).getText().equals("English")) {
	             droplist.get(i).click();}
	                    }
	 /**    
	   WebElement deletelang = driver.findElement(By.className("pc-close"));
	   deletelang.click();
	   Thread.sleep(400);
	   WebElement edittrans = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/section/div/div[2]/div/div[2]/div[1]/span[2]"));
	   edittrans.click();
	   Thread.sleep(100);
	   List<WebElement>  translist = driver.findElements(By.cssSelector(".pc-list li"));
	   Thread.sleep(100);
		
	    for (int i = 0 ; i<translist.size() ; i++) {
	        	      	  
	         if(translist.get(i).getText().equals("Arbic")) {
	             translist.get(i).click();}
	                                         }                   
	   
        **/  
		
		WebElement restaurantname = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[1]/div[1]/input"));
		restaurantname.clear();
		restaurantname.sendKeys("edited");
		
	
		WebElement transbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div/button"));
		transbtn.click();
		Thread.sleep(300);
		WebElement transname = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/nametranslations/div/div[2]/div/div/input"));
		transname.clear();
		transname.sendKeys("edited");
		WebElement savebutton = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/nametranslations/div/div[3]/button[2]"));
		savebutton.click();
	
		
		Thread.sleep(300);
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
        WebElement deletephone = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/phonenumbers/div/div[1]/div/div[2]/button"));
        deletephone.click();
        Thread.sleep(300);
		WebElement addphone = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/phonenumbers/div/div[2]/div/button"));
		addphone.click();
		WebElement phone = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/phonenumbers/div/div[1]/div/div[1]/input"));
		phone.clear();
		phone.sendKeys("02222222222"); 
				
		
		
		
		
        WebElement deleteimg = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[2]/singleimage/div[2]/div/div/div"));
        deleteimg.click();
        Thread.sleep(300);
		
		String logoname = "long text category.png";
		String imagepath = System.getProperty("user.dir")+"/images/"+logoname;
		WebElement uploadlogo = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[2]/singleimage/div[1]/input"));
		WebElement saveimage = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[2]/singleimage/div[3]/div/div/div[3]/button[2]"));
		uploadlogo.sendKeys(imagepath);
		Thread.sleep(5000);
		saveimage.click();
		
		
		js.executeScript("window.scrollBy(0,400)");
		
		
        WebElement deletecover = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[3]/singleimage/div[2]/div/div/div"));
        deletecover.click();
        Thread.sleep(300);
		
		String covername = "Screenshot_1.png";
		String coverpath = System.getProperty("user.dir")+"/images/"+covername;
		WebElement uploadcover = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[3]/singleimage/div[1]/input"));
		WebElement savecover = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[3]/singleimage/div[3]/div/div/div[3]/button[2]"));
		uploadcover.sendKeys(coverpath);
		Thread.sleep(5000);
		savecover.click();
		
		
		WebElement description = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/textarea"));
		description.clear();
		description.sendKeys("edited");
		
		
		WebElement descriptionbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div/button"));
		descriptionbtn .click();
		Thread.sleep(100);
		WebElement discname = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div/descriptiontranslations/div/div[2]/div/div/textarea"));
		discname.clear();
		discname.sendKeys("edited");
		WebElement savedisc = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div/descriptiontranslations/div/div[3]/button[2]"));
		savedisc.click();
		
		
		js.executeScript("window.scrollBy(0,600)");
		
		
		
		 WebElement location = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[5]/div[1]/div/div/div[1]/div"));
		 location.click();
		 Thread.sleep(100);
		 List<WebElement>  locationlist = driver.findElements(By.cssSelector("#dropdown-country a"));
		 Thread.sleep(100);
		
	          for (int i = 0 ; i<locationlist.size() ; i++) {
	     	  
	            if(locationlist.get(i).getText().equals("Egypt")) {
	            	locationlist.get(i).click();}
	                                         }
	          
	          
	 	 WebElement currancy = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[1]/div/div[5]/div[2]/div/div/div[1]/div"));
		 currancy.click();
		 Thread.sleep(100);
		 List<WebElement>  currancylist = driver.findElements(By.cssSelector("#dropdown-currency a"));
		 Thread.sleep(100);
			
		         for (int i = 0 ; i<currancylist .size() ; i++) {
		     	  
		            if(currancylist.get(i).getText().equals("EGP")) {
		            	currancylist.get(i).click();}
		                                         }
	
	        
		
		WebElement savebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/form/div[4]/button"));
		savebtn.click();

	
	
	}}
