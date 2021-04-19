package restaurant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Core.Base;

public class Tables extends Base {


   
   @Test(priority = 1)
   public void AddTable() throws InterruptedException {
	   
	
	   Thread.sleep(3000); 
	   WebElement tablebtn = driver.findElement(By.xpath("/html/body/div[3]/nav/div/div/div/a"));
	   tablebtn.click();
	   Thread.sleep(300);
	   WebElement add = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/div[2]/button"));
	   add.click();
	   Thread.sleep(100);
	   WebElement name = driver.findElement(By.id("table-code"));
	   name.sendKeys("300");
	   WebElement savebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/form/div[2]/button[2]"));
	   savebtn.click();
	   
}
   @Test(priority = 2)
   public void PrintTable() throws InterruptedException {

	   Thread.sleep(200);
	   WebElement print = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/form/button[2]/i"));
	   print.click();
	   
	
}
   @Test(priority = 4)
   public void DeleteTable() throws InterruptedException {

	Thread.sleep(400);
	WebElement delete = driver.findElement(By.className("delete-btn"));
	delete.click();
	WebElement confirm = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[2]/div/div[2]/div/div/form/div[2]/button[2]"));
	Thread.sleep(600);
	confirm.click();
}
   
   @Test(priority = 3)
   public void SearchTable() throws InterruptedException {
 
	Thread.sleep(200);
	WebElement search = driver.findElement(By.name("table_number"));
	search.sendKeys("300");
	search.submit(); 
	   
}
   
   /**
   @Test(priority = 5)
   public void logout() throws InterruptedException {
 
	Thread.sleep(200);
	WebElement logout = driver.findElement(By.id("logout-form"));
	logout.click();
   
   } 
	
	**/
	
	
	
}
