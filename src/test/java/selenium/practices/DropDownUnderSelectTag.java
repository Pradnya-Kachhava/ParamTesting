package selenium.practices;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.Utility;

public class DropDownUnderSelectTag {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(Utility.getProperty("url"));
		driver.manage().window().maximize();

		WebElement multiSelect=driver.findElement(By.xpath(" //select[@id='multiselect1']"));
		
		Select multiSelectDropDown=new Select(multiSelect);
		System.out.println("Drop down is multiselected or not = " +multiSelectDropDown.isMultiple());
		
		//Q- How to get all list from drop down used ->getOptions Method
		List<WebElement> option=multiSelectDropDown.getOptions();
		
		for(WebElement opt: option)
		{
			System.out.println(opt.getText());  //used to print all list
		}
		
		multiSelectDropDown.selectByIndex(2);
		multiSelectDropDown.selectByValue("audix");
		multiSelectDropDown.selectByVisibleText("Volvo");
		
		System.out.println("**************************************************");
		List<WebElement> selectedOptions=multiSelectDropDown.getAllSelectedOptions();
		
		for(WebElement opt:selectedOptions)
		{
			System.out.println(opt.getText());
		}
		
		System.out.println("First selected option = "+multiSelectDropDown.getFirstSelectedOption().getText());
		
		multiSelectDropDown.deselectByIndex(0);
		multiSelectDropDown.deselectByValue("audix");
		multiSelectDropDown.deselectByVisibleText("Hyundai");
		
		multiSelectDropDown.selectByIndex(2);
		multiSelectDropDown.selectByValue("audix");
		multiSelectDropDown.selectByVisibleText("Volvo");
		
		multiSelectDropDown.deselectAll();
		
	}

}
