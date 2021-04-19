package restaurant;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Core.Base;


public class Edititem extends Base{

	//   *********** edit item in the menu ***********


	@Test (priority = 1)
	public void edititem() throws InterruptedException{

		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(7000);
		WebElement button = driver.findElement(By.cssSelector(".btn-none-bg.update-item") );
		button.click();
		Thread.sleep(800);



		WebElement itemname = driver.findElement(By.name("name"));
		itemname.clear();
		itemname.sendKeys("order number 1");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);

		WebElement description = driver.findElement(By.name("description"));
		description.clear();
		description.sendKeys("description number 1");


		WebElement removemainphoto = driver.findElement(By.cssSelector(".cropped-img-container .delete-cropped"));
		removemainphoto.click();
		Thread.sleep(200);
		String mainphoto = "images4.jpg" ;
		String imagepath = System.getProperty("user.dir")+"/images/"+mainphoto;
		WebElement photo = driver.findElement(By.id("upload-image"));
		photo.sendKeys(imagepath);
		WebElement savebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[3]/singleimage/div[3]/div/div/div[3]/button[2]"));
		Thread.sleep(1000);
		savebtn.click();


		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(400);

		//   *********** remove cover photo ***********


		WebElement remove = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[4]/multipleimages/div[2]/div/div/div"));
		remove.click();
		Thread.sleep(300);

		String additionalphoto1 = "images (1).jpg";
		String additionalphoto2 = "images.jpg";
		String photopath1 = System.getProperty("user.dir")+"/images/"+ additionalphoto1;
		String photopath2 = System.getProperty("user.dir")+"/images/" + additionalphoto2;
		String[] myList = { photopath1 , photopath2 };

		WebElement addphoto = driver.findElement(By.id("upload-images"));
		WebElement savephotos = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[4]/multipleimages/div[3]/div/div/div[3]/button[2]"));

		for (String s : myList) {
			addphoto.sendKeys(s);
			Thread.sleep(600);
			savephotos.click();
			Thread.sleep(600);
		}

		//   *********** edit category of an item ***********


		WebElement category = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[6]/div/div[1]/input[1]"));
		category.click();
		Thread.sleep(100);
		List<WebElement>  list = driver.findElements(By.cssSelector(".dropdown-menu.custom-dropdown.show .dropdown-item"));
		Thread.sleep(100);

		for (WebElement webElement : list) {
			if (webElement.getText().equals("Test 1")) {
				webElement.click();
				break;
			}
		}



		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);

		//   *********** edit price of an item ***********



		WebElement price = driver.findElement(By.name("size[0][price]"));
		price.clear();
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
		//   *********** edit translation of item ***********


		WebElement transbtn = driver.findElement(By.id("btnContinue"));
		transbtn.click();
		Thread.sleep(6000);


		WebElement transname = driver.findElement(By.name("name"));
		transname.clear();
		transname.sendKeys("اوردر رقم 1");

		WebElement transdes = driver.findElement(By.name("description"));
		transdes.clear();
		transdes.sendKeys("ديسكريبشن");


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
