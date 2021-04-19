package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Core.Base;

public class Login extends Base{
		
	@Test(priority =1 )
	public void loginbtn() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement loginbtn = driver.findElement(By.className("small-font"));
		System.out.println(loginbtn.getText());
		loginbtn.click();

	}
/**
	@Test(enabled = false)
	public void TestFindElements() {
		

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}

**/

	@Test(priority = 2)
	public void validcredintial() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement signin = driver.findElement(By.tagName("button"));
		username.clear();
		username.sendKeys("test@g.com");

		password.clear();
		password.sendKeys("123456");

		signin.click();

	}

}
