package Finance.Digitest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    String appurl="https://adactinhotelapp.com/";
	    driver.get(appurl);
	    driver.findElement(By.partialLinkText("New User")).click();;
	    System.out.println(driver.getTitle());
	    Thread.sleep(1000);
	    driver.findElement(By.id("tnc_box")).click();

	}

}
