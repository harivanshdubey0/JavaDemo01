package Finance.Digitest1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    String appurl="https://adactinhotelapp.com/";
	    driver.get(appurl);
	    //String txt_username="username";
	    //thread.sleep(2000);
	    driver.findElement(By.id("username")).sendKeys("test");;

	}

}
