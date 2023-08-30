package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	public WebDriver getDriver() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Data/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(getProperty("url"));
		driver.manage().window().maximize();

		return driver;
	}
	
	public static String getProperty(String key) throws IOException {
		File file = new File("src/test/resources/Data/master.properties");
		FileInputStream fileInputStream = new FileInputStream(file);

		Properties properties = new Properties();
		properties.load(fileInputStream);

		return properties.getProperty(key);
	}

	// public static void main(String args[]) throws IOException
	public static List<String> readExcel() throws IOException

	{
		List<String> excelData = new ArrayList<String>();
		File file = new File("src/test/resources/Data/userData.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);

		// it represent complete workbook
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = xssfWorkbook.getSheet("data");
		int lastRow = sheet.getLastRowNum();

		for (int i = 1; i <= lastRow; i++) {
			XSSFRow row = sheet.getRow(i);
			// get cell count
			int lastCellNum = row.getLastCellNum();

			for (int j = 0; j < lastCellNum; j++) {
				// System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " || ");

				excelData.add(row.getCell(j).toString());
			}
		}
		xssfWorkbook.close();
		return excelData;
	}

}
