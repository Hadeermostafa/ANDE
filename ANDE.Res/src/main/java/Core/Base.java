package Core;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
public static WebDriver driver;

@BeforeSuite
public void webDriver() throws InterruptedException  
{
	// System.setProperty("webdriver.http.factory", "apache");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\My Lap\\Downloads\\seleinum files\\chromedriver.exe");
	 Thread.sleep(5000);
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("http://andedev-env.eba-je3ap3sa.me-south-1.elasticbeanstalk.com/");
	 

}
	
}
