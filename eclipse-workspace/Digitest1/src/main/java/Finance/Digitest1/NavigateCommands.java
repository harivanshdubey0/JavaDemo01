package Finance.Digitest1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    String appurl="https://www.google.com/";
	    driver.get(appurl);
	    Thread.sleep(2000);
	    appurl="https://www.amazon.com/";
	    driver.get(appurl);
	    driver.navigate().back();
	    Thread.sleep(2000);
	    driver.navigate().forward();
	    driver.close();

	}

}
