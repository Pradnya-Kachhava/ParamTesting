package selenium.practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationImp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='radio1']"));
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='radio2']"));
		maleRadioButton.click();
		System.out.println("maleRadioButton is selected =" +maleRadioButton.isSelected());
		System.out.println("femaleRadioButton is selected =" +femaleRadioButton.isSelected());
		
		System.out.println("femaleRadioButton is selected =" +femaleRadioButton.isDisplayed());

		
		WebElement orangeCheckbox=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		WebElement blueCheckbox=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		System.out.println("orange checkbox is selected =" +orangeCheckbox.isSelected());
		System.out.println("blue checkbox is selected =" +blueCheckbox.isSelected());
		
		
		System.out.println(driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//button[@id='but2']")).isEnabled());
		
		
		

	}

}
