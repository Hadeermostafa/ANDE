package digital_menu;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Core.Digital_menu_base;

public class Digital_menu extends Digital_menu_base {


	//   *********** close download App dialog ***********

	@Test(priority = 1)
	public void closedialog() throws InterruptedException {
		Thread.sleep(1000);
		WebElement signX = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/div/div[2]/div/button"));
		signX.click();


	}
	//   *********** validate the scroll at digital menu ***********


	@Test(priority = 2)
	public void scrolling() throws InterruptedException {
		Thread.sleep(800);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,-800)");

	}

	//   *********** changing the language of menu ***********

	@Test(priority = 3)
	public void menulanguage() throws InterruptedException {
		Thread.sleep(800);
		WebElement click = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div[1]/div[2]/button"));
		click.click();
		Thread.sleep(800);
		WebElement change = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/form/div[2]/div/label"));
		change.click();
		Thread.sleep(500);
		closedialog();
		Thread.sleep(800);
	}

	//   *********** check the details of item ***********

	@Test(priority = 4)
	public void select() throws InterruptedException {
		Thread.sleep(800);		
		WebElement click = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/ul/li[2]/a"));
		click.click();
		System.out.println(click.getText());

		WebElement item = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[11]/div/div[2]/div/div/div[1]/div"));
		item.click();
		Thread.sleep(800);
		
		WebElement data = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[12]/div/div/div[2]/div[2]"));
		data.click(); 
		System.out.println(data.getText());
		
		Thread.sleep(1000);
		WebElement expandsize = driver.findElement(By.id("headingOne265"));
		expandsize.click();
	
		Thread.sleep(2000);
		WebElement expandextra = driver.findElement(By.id("heading265"));
		expandextra.click();
		
		Thread.sleep(2000);
		WebElement closeitem = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div[12]/div/div/div[1]/button"));
		closeitem.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-800)");

		//   *********** changing the language of digital menu ***********

		WebElement restaurantlanguage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/a"));
		restaurantlanguage.click();
		Thread.sleep(800);
		closedialog();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,1500)");

		//   *********** downloading the App ***********

/**		Thread.sleep(800);
		WebElement downloadapp = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/section/div/div[4]/a[2]/img"));
		downloadapp.click();
**/

	}







}
