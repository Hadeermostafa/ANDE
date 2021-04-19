package restaurant;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Core.Base;

public class Login extends Base{
		
	@Test(priority =1 )
	public void login_button() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement loginbtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/nav/div[3]/a"));
		System.out.println(loginbtn.getText()+" done successfully ");
		loginbtn.click();

	}
/**
	@Test
	public void TestFindElements() {
		

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	}

**/

	
	
	@Test(priority = 2)
	public void empty_filds() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement signin = driver.findElement(By.tagName("button"));
		signin.click();
	}
	
	
	
	
	@Test(priority = 3)
	public void invalid_credintial() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement signin = driver.findElement(By.tagName("button"));
		username.clear();
		username.sendKeys("test@g.com");
		password.clear();
		password.sendKeys("123");

		signin.click();

	}
	
	
	
	
	@Test(priority = 4)
	public void valid_credintial() throws InterruptedException {
		
		Thread.sleep(3000);
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
