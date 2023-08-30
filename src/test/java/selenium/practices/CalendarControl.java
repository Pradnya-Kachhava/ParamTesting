package selenium.practices;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Utility;

public class CalendarControl {

	WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException
	{

		CalendarControl calCon=	new CalendarControl();
		calCon.selectDateFromDatePicker("2", "22");
	}

	public void selectDateFromDatePicker(String month, String date) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Utility.getProperty("demoUrl1"));
		driver.manage().window().maximize();


		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='departure']/../span")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='DayPicker']//div[@class='DayPicker-Month']["+month+"]//div[@class='DayPicker-Day']//p[text()='"+date+"']")).click();

		
		//Thread.sleep(1000);


	}
}
