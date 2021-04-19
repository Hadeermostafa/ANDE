package dine_in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import Core.Base;

public class Edit_Order extends Base  {
	
//@Test(priority = 1)
	public void Excel_file(String text) throws Exception {

		File src = new File("D:\\eclipse-workspace\\ANDE.Res\\ANDE.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xfs = new XSSFWorkbook(fis);
		XSSFSheet sheet = xfs.getSheetAt(0);
		try {
			System.out.print("************Excel*****************");
			sheet.getRow(1).getCell(1).setCellValue(text);
		} catch (Exception e) {
			System.out.print("************ExcelFailed*****************");
		}		FileOutputStream fos = new FileOutputStream(src);
		xfs.write(fos);
		xfs.close(); 

}

//   *********** open operations page ***********
@Test(priority = 2)
public void operations_page() throws InterruptedException {
	

	Thread.sleep(2000);
	WebElement operationbtn = driver.findElement(By.id("nav-operations"));
	operationbtn.click();
}


//   *********** change the status of items ***********

	@Test(priority = 3)
	public void status_order() throws InterruptedException {


		WebElement statusbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[1]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div"));
		statusbtn.click();

		Thread.sleep(300);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		List<WebElement> list = driver.findElements(By.cssSelector(".dropdown-item .status-value"));
		Thread.sleep(300);

		for (WebElement webElement : list) {

			if (webElement.getText().equals("Preparing")) {
				webElement.click();
			}
		}

		Thread.sleep(300);
		WebElement secondstatus = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div[1]"));
		secondstatus.click();
		Thread.sleep(300);

		List<WebElement> secondlist = driver.findElements(By.cssSelector(".dropdown-item .status-value"));
		Thread.sleep(300);

		for (WebElement webElement : secondlist) {

			if (webElement.getText().equals("Served")) {
				webElement.click();
			}
		}
	}


	//   *********** edit and update order function ***********


	@Test(priority = 4)
	public void edit_order() throws InterruptedException {

		WebElement editbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[1]/div/div[1]/div[3]/div/button[2]"));
		editbtn.click();
		Thread.sleep(5000);


		//   *********** select item from menu and add it to the order ***********


		WebElement menu = driver.findElement(By.className("nav-icon"));
		menu.click();


		WebElement item = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div"));
		item.click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");


		//   *********** select the size of item ***********


		WebElement sizeDropDown = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div[1]/div/div[2]/form/div/select"));
		sizeDropDown.click();

		WebElement sizelist = driver.findElement(By.cssSelector("#item-sizes option"));
		if (sizelist.getText().equals("small ( 200.00 SAR )")) {
			sizelist.click();
		} 

		/**
		for (WebElement webElement : sizelist) {

			if (webElement.getText().equals(" small ( 200.00 SAR ) )")) {
				webElement.click();

			}
		}
		
**/
		//   *********** select extras for item ***********


		WebElement extra1 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div[2]/form/div/div[1]/div/div[2]/div[1]/div[1]/input"));
		extra1.click();
		WebElement extra2 = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div[2]/form/div/div[1]/div/div[2]/div[2]/div[1]/input"));

		if (!extra2.isSelected()) {
			extra2.click();

		}


		WebElement addbtn = driver.findElement(By.id("add-item-btn"));
		addbtn.click();

		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-200)");



		//   *********** delete item from the order ***********


		WebElement remove = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]"));
		remove.click();

		WebElement confirmdelete = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/button[1]"));
		confirmdelete.click();


		WebElement close = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[2]/div/div/div/div[1]/button"));
		close.click();

		Thread.sleep(5000);


		//   *********** changing the status of new item ***********

		status_order();
	}


	//   *********** get order details ***********



	@Test(priority = 5)
	public void get_data() throws InterruptedException {
		Thread.sleep(400);

		WebElement details = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[1]/div/div[1]/div[2]/div[2]"));
		System.out.print("\n \n \n" +"***************** Order details *******************" + "\n\r" + details.getText());

	}
	
	
	

	//   *********** call waiter request ***********


	@Test(priority = 6)
	public void call_waiter() throws InterruptedException {
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-300)");
		WebElement request = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/div[2]/div/waiterrequests/div/div[1]/div"));
		request.click();
		Thread.sleep(400);
		WebElement accept = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/div[2]/div/waiterrequests/div/div[2]/div/div/div[2]/button[2]"));
		accept.click();
	}
	


	//   *********** get payment details ***********


	@Test(priority = 7)
	public void payment_data() throws InterruptedException, Exception {

		Thread.sleep(2000);
		WebElement paymentbtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[1]/div/div[1]/div[3]/div/button[1]"));
		paymentbtn.click();
		Thread.sleep(1000);

		WebElement details = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div"));
		System.out.print("\n \n \n" +"***************** payment details *******************" + "\n\r" + details.getText());
	//	String data = details.getText();
	//	Excelfile(data);

		Thread.sleep(5000);

	//	WebElement close = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[1]/div/div[2]/div/div/div/div[1]/button"));
	//	close.click();
	}


	//   *********** payment request ***********


	@Test(priority = 8)
	public void payment() throws InterruptedException {

		Thread.sleep(400);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		WebElement pay = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div/tablecards/div[2]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/button[2]"));
		pay.click();

	}




}
