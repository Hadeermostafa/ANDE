package Tests;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Core.Base;

public class Edititem extends Base{
	
 //  @SuppressWarnings("deprecation")
@Test (priority = 1)
   public void edititem() throws InterruptedException{
	   
	// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 Thread.sleep(5000);
	WebElement button = driver.findElement(By.cssSelector(".btn-none-bg.update-item") );
	button.click();
	 Thread.sleep(600);
    
	 
	 
	 WebElement itemname = driver.findElement(By.name("name"));
	 itemname.clear();
	 itemname.sendKeys("edited Item");
	 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);
	 
	 WebElement description = driver.findElement(By.name("description"));
	 description.clear();
	 description.sendKeys("edited description");
	 
	 
	 WebElement removemainphoto = driver.findElement(By.cssSelector(".cropped-img-container .delete-cropped"));
	 removemainphoto.click();
	 Thread.sleep(200);
	 String mainphoto = "images4.png" ;
	 String imagepath = System.getProperty("user.dir")+"/images/"+mainphoto;
	 WebElement photo = driver.findElement(By.id("upload-image"));
	 photo.sendKeys(imagepath);
	 WebElement savebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[3]/singleimage/div[3]/div/div/div[3]/button[2]"));
	 Thread.sleep(1000);
	 savebtn.click();
	
	
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(400);
		
		
	  WebElement remove = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[4]/multipleimages/div[2]/div/div/div"));
	  remove.click();
	  Thread.sleep(300);
	  
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
	List<WebElement>  list = driver.findElements(By.cssSelector(".dropdown-menu.custom-dropdown.show .dropdown-item"));
	Thread.sleep(100);

	for (int i = 0 ; i<list.size() ; i++) {
        if(list.get(i).getText().equals("edited")){ 
        	list.get(i).click();
        	break;
        }
                                        }                       
       
	
     
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);
		
		
	WebElement delete = driver.findElement(By.cssSelector("button.add-input.m-0"));
	delete.click();
	Thread.sleep(200);
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
	price.sendKeys("500");
	
	
	
	
	WebElement extra1 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[7]/div/div[1]/div/label"));
	WebElement extra2 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[7]/div/div[2]/div/label"));
	extra2.click();
	if (extra1.isSelected()) {
		extra1.click();
		
	}
	
	
	WebElement spicy = driver.findElement(By.id("spicy"));
	WebElement original = driver.findElement(By.id("original"));
	original.click();
	
	if (spicy.isSelected()) {
		spicy.click();
		
	}
		
	
	WebElement transbtn = driver.findElement(By.id("btnContinue"));
	transbtn.click();
	Thread.sleep(6000);
	
	
	WebElement transname = driver.findElement(By.name("name"));
	transname.clear();
	transname.sendKeys("edited");
	
	WebElement transdes = driver.findElement(By.name("description"));
	transdes.clear();
	transdes.sendKeys("edited");
	
	
	WebElement saveitem = driver.findElement(By.id("btnSave"));
	saveitem.click();
	
	 }
   /**
   @Test (priority = 2)
   public void deleteitem() throws InterruptedException {
	
	   Thread.sleep(200);
	   WebElement deletebtn = driver.findElement(By.cssSelector(".btn-none-bg.delete-item"));
	   deletebtn.click();
	      }
	   
	   **/

   
   

}
