package restaurant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Core.Base;

public class AddExtras extends Base {

	//   *********** adding extras ***********

   
   @Test(priority = 1)
   public void AddExtra()  throws InterruptedException{
	 

	 Thread.sleep(8000);
	 WebElement extrabtn = driver.findElement(By.id("sub-nav-menu-extras"));
	 extrabtn.click();
	 
	 for (int i = 0; i < 2; i++) {
		
	 Thread.sleep(6000);
	 WebElement addbtn = driver.findElement(By.id("btn-add-extra"));
	 addbtn.click();
	 	 
	 Thread.sleep(10000);
	 WebElement extratext = driver.findElement(By.id("add-extra-main-name"));
	 extratext.clear();
	 extratext.sendKeys("Test 1");
	 WebElement extratranslation = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/menuaddextra/div/div[3]/div/input"));
	 extratranslation.clear();
	 extratranslation.sendKeys("تيست 1");
	 WebElement extraprice = driver.findElement(By.id("add-extra-price-input"));
	 extraprice.clear();
	 extraprice.sendKeys("50");
	 WebElement saveextra = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]"));
	 saveextra.click();
		   
		     }}
   
	//   *********** edit extras ***********

	 
   @Test(priority = 2)
   public void EditExtra()  throws InterruptedException{
	

	 Thread.sleep(10000);
	WebElement editbtn = driver.findElement(By.className("btn-none-bg"));
	editbtn.click();
	
	 WebElement edittext = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/section/div/div/div[2]/menuextra/div/div[1]/div[1]/input"));
	 edittext.clear();
	 edittext.sendKeys("Test 2");
	 WebElement edittranslation = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/section/div/div/div[2]/menuextra/div/div[2]/div/div/input"));
	 edittranslation.clear();
	 edittranslation.sendKeys("تيست 2");
	 WebElement editprice = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/section/div/div/div[2]/menuextra/div/div[1]/div[2]/div/input"));
	 editprice.clear();
	 editprice.sendKeys("8000");
	 WebElement saveedits = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/section/div/div/div[2]/menuextra[1]/div/div[1]/div[3]/form/div/button"));
	 saveedits.click();
		   
		     }
   
   
	//   *********** adding sizes ***********

	  	   
   @Test( priority = 3)
    public void AddSize()  throws InterruptedException{
	 

	 Thread.sleep(10000);
	 WebElement sizebtn = driver.findElement(By.id("sub-nav-menu-sizes"));
	 sizebtn.click();
	 Thread.sleep(500);
	 WebElement add = driver.findElement(By.id("btn-add-size"));
	 add.click();
	 
	 
	 Thread.sleep(400);
	 WebElement text = driver.findElement(By.id("add-size-main-name"));
	 text.clear();
	 text.sendKeys("small");
	 WebElement trans = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/menuaddsize/div/div[3]/div/div/input"));
	 trans.clear();
	 trans.sendKeys("صغير");
	 WebElement savesize = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]"));
	 savesize.click();
		   
		   
		   
	   }
   
   
   
	//   *********** edit size ***********

   
   @Test( priority = 4)
   public void EditSize()  throws InterruptedException{
	 

	 Thread.sleep(10000);
	 WebElement editbtn = driver.findElement(By.className("btn-none-bg"));
	 editbtn.click(); 
	 
	 Thread.sleep(100);
	 WebElement edittext = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/section/div/div/div[2]/menusize/div/div[1]/div[1]/input"));
	 edittext.clear();
	 edittext.sendKeys("large");
	 
	 WebElement edittrans = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/section/div/div/div[2]/menusize/div/div[2]/div/div/input"));
	 edittrans.clear();
	 edittrans.sendKeys("كبير");
	 WebElement saveedits = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/section/div/div/div[2]/menusize/div/div[1]/div[2]/form/div/button"));
	 saveedits.click();
	 
		   
	   }
   
   
	//   *********** adding category ***********

   
   @Test(priority = 5)
   public void AddCategory()  throws InterruptedException{

	 Thread.sleep(10000);
	 WebElement categorybtn = driver.findElement(By.id("sub-nav-menu-categories"));
	 categorybtn.click();
	 Thread.sleep(400);
	 WebElement addcate = driver.findElement(By.id("btn-add-category"));
	 addcate.click();
	 
	 Thread.sleep(300);
	 WebElement text = driver.findElement(By.id("add-category-main-name"));
	 text.clear();
	 text.sendKeys("Test");
	 WebElement trans = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/menuaddcategory/div/div/div[2]/div[2]/div/div/input"));
	 trans.clear();
	 trans.sendKeys("تيست ");
	 Thread.sleep(400);
	/** 
	 String categoryimage = "images (1)";
	 String imagepath = System.getProperty("user.dir")+"/images/"+categoryimage;
	 WebElement uploadcategory = driver.findElement(By.cssSelector("#add-category-card upload-image"));
	 uploadcategory.sendKeys(imagepath);
	 Thread.sleep(1000);
	 **/
	 
	 WebElement savecategory = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button[2]"));
	 savecategory.click();
		   	   
	   }
   	   
	   
	 
	//   *********** editing category ***********

	   
    @Test(priority = 6)
    public void EditCategory()  throws InterruptedException{
 
	  Thread.sleep(10000);
	  WebElement editbtn = driver.findElement(By.className("btn-none-bg"));
	  editbtn.click();
		 
	  Thread.sleep(400);
	  WebElement edittext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/section/div/div/div[2]/menucategory/div/div/div[2]/div[1]/div[1]/input"));
	  edittext.clear();
	  edittext.sendKeys("Test 1");
	  WebElement edittrans = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/section/div/div/div[2]/menucategory/div/div/div[2]/div[2]/div/div/input"));
	  edittrans.clear();
	  edittrans.sendKeys("تيست 1");
	 
	 
	 
	  WebElement saveedits = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/section/div/div/div[2]/menucategory/div/div/div[2]/div[1]/div[2]/form/div/button"));
	  saveedits.click();
	  Thread.sleep(800);
	  
	 
	   
	   
    }
    }
   
   
   
   
   
   
   
 
   
   
   
   