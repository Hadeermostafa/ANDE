package Tests;

import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Core.Base;


public class Additem extends Base{
	
  
   @Test
   public void additem() throws InterruptedException {
	   
		
	  Thread.sleep(20000);
	  WebElement menu = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/ul/li[1]/a"));
	  menu.click();
		 
	  Thread.sleep(15000);
	 
	  WebElement add = driver.findElement(By.id("btn-add-item"));
	  List<WebElement> button = driver.findElements(By.cssSelector(".item-details"));
	  System.out.println(button.size());
	  add.click();
	 
	 
	 WebElement itemname = driver.findElement(By.name("name"));
	 itemname.clear();
	 itemname.sendKeys("Item");
	 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);
	 
	 WebElement description = driver.findElement(By.name("description"));
	 description.clear();
	 description.sendKeys("description");
	 
	 String mainphoto = "images4.png" ;
	 String imagepath = System.getProperty("user.dir")+"/images/"+mainphoto;
	 WebElement photo = driver.findElement(By.id("upload-image"));
	 photo.sendKeys(imagepath);
	 WebElement savebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[3]/singleimage/div[3]/div/div/div[3]/button[2]"));
	 Thread.sleep(3000);
	 savebtn.click();
	 
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);
		
	
	  String additionalphoto1 = "Screenshot_1.png";
	  String additionalphoto2 = "long text category.png";
	 
	 String photopath1 = System.getProperty("user.dir")+"/images/"+ additionalphoto1;
	 String photopath2 = System.getProperty("user.dir")+"/images/" + additionalphoto2;
	 String[] myList = { photopath1 , photopath2 };
	 
	 WebElement addphoto = driver.findElement(By.id("upload-images"));
	 WebElement savephotos = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[4]/multipleimages/div[3]/div/div/div[3]/button[2]"));

	 for (int i = 0; i < myList.length ; i++) {
		 addphoto.sendKeys(myList[i]);
		 Thread.sleep(600);
		 savephotos.click();
		 Thread.sleep(600);
	}
	 
		
	WebElement categrory = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[6]/div/div[1]/input[1]"));
	categrory.click();
	Thread.sleep(100);
	List<WebElement>  list = driver.findElements(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[6]/div/div[2]"));
	Thread.sleep(100);

	for (int i = 0 ; i<list.size() ; i++) {
        if( list.get(i).getText().equals("edited") ){ 
        	list.get(i).click();
        	break;
        }
                                        }                       
       
        
     
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);
		
		
		
	WebElement sizebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/itemsizes/div/div/button"));
	sizebtn.click();
	Thread.sleep(100);
	WebElement sizefield = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/itemsizes/div/div[1]/div[1]/div/div[1]/input[1]"));
	sizefield.click();
	Thread.sleep(100);
	List<WebElement> size = driver.findElements(By.cssSelector(".dropdown-item"));
	Thread.sleep(100);
	
	for (int i = 0 ; i<size.size() ; i++) {
        if(  size.get(i).getText().equals("edited") ){ 
        	size.get(i).click();
        	break;
        }
                                        }
	
	WebElement price = driver.findElement(By.className("custom-input-padding"));
	price.sendKeys("100");
	
	
	
	WebElement extra1 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[7]/div/div[1]/div/label"));
	extra1.click();
	WebElement extra2 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[7]/div/div[2]/div/label"));
	
	if (!extra2.isSelected()) {
		extra2.click();
		
	}
	
	
	WebElement spicy = driver.findElement(By.id("spicy"));
	spicy.click();
	WebElement original = driver.findElement(By.id("original"));
	
	if (!original.isSelected()) {
		original.click();
		
	}
		
	
	WebElement transbtn = driver.findElement(By.id("btnContinue"));
	transbtn.click();
	Thread.sleep(10000);
	
	
	WebElement transname = driver.findElement(By.name("name"));
	transname.clear();
	transname.sendKeys("test");
	
	WebElement transdes = driver.findElement(By.name("description"));
	transdes.clear();
	transdes.sendKeys("test");
	
	
	WebElement saveitem = driver.findElement(By.id("btnSave"));
	saveitem.click();
			

	
	
    }
	
	
	
	


}
