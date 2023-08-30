package selenium.practices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
        //System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
        // WebDriver driver = new InternetExplorerDriver();

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
        WebDriver driver = new EdgeDriver();
        
		driver.get("http://omayo.blogspot.com/");

		
		//Find Element
		//WebElement element=driver.findElement(By.name("userid"));
		//element.sendKeys("Examples");
		//WebElement element1=driver.findElement(By.name("pswrd"));
		//element1.sendKeys("Password");
		driver.manage().window().maximize();

		driver.navigate().to("https://marketing-chimp.business.site/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		// when run java program 3 thread run in backward
		// main - executes the program, garbage collector & 3rd is Thread scheduler
		
		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.co.in/");
		Thread.sleep(5000); 
		//driver.close();
		driver.quit(); 
		
		
	}

}
