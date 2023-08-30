package selenium.practices;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class ExcelDrivenTest {

	public static void main(String[] args) throws IOException {

		List<String> dataFromExcel=Utility.readExcel();
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Utility.getProperty("demoUrl"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(dataFromExcel.get(0));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(dataFromExcel.get(1));
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(dataFromExcel.get(2));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(dataFromExcel.get(3));

 
	}

}
