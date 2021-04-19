package restaurant;

import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Core.Base;


public class Additem extends Base{

	//   *********** adding item to the menu ***********


	@Test
	public void additem() throws InterruptedException {


		Thread.sleep(15000);
		WebElement menu = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/ul/li[1]/a"));
		menu.click();

		Thread.sleep(18000);

		WebElement add = driver.findElement(By.id("btn-add-item"));
		List<WebElement> button = driver.findElements(By.cssSelector(".item-details"));
		System.out.println(button.size());
		add.click();


		WebElement itemname = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[1]/div/input"));
		itemname.clear();
		itemname.sendKeys("Item number 1");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);

		WebElement description = driver.findElement(By.name("description"));
		description.clear();
		description.sendKeys("description");

		String mainphoto = "images4.jpg" ;
		String imagepath = System.getProperty("user.dir")+"/images/"+mainphoto;
		WebElement photo = driver.findElement(By.id("upload-image"));
		photo.sendKeys(imagepath);
		WebElement savebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[3]/singleimage/div[3]/div/div/div[3]/button[2]"));
		Thread.sleep(3000);
		savebtn.click();

		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);


		String additionalphoto1 = "images2.jpg";
		String additionalphoto2 = "Screenshot_1.jpg";

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


		WebElement categrory = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[6]/div/div[1]/input[1]"));
		categrory.click();
		Thread.sleep(100);
		List<WebElement>  list = driver.findElements(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/div[6]/div/div[2]"));
		Thread.sleep(100);

		for (WebElement webElement : list) {
			if (webElement.getText().equals("Test 1")) {
				webElement.click();
				break;
			}
		}



		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(400);



		WebElement sizebtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/itemsizes/div/div/button"));
		sizebtn.click();
		Thread.sleep(100);
		
		WebElement sizelist = driver.findElement(By.className("size-select"));
		sizelist.click();
		WebElement expandlist = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[2]/form/itemsizes/div/div[1]/div[1]/div/select/option[2]"));
			expandlist.click(); 
		WebElement price = driver.findElement(By.name("size[0][price]"));
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
		transname.sendKeys("عنصر رقم 1");

		WebElement transdes = driver.findElement(By.name("description"));
		transdes.clear();
		transdes.sendKeys("ديسكريبشن");


		WebElement saveitem = driver.findElement(By.id("btnSave"));
		saveitem.click();




	}






}
