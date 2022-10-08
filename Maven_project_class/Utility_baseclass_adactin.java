package org.Maven_project_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility_baseclass_adactin {
	public static WebDriver driver;

	public static WebDriver getbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("browser name is not mathced");
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void Url(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void Implicit_Wait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void find_elements(String xpath,WebElement element) {
		 element = driver.findElement(By.xpath(xpath));
	}

	public static void on_click(WebElement element) {
		element.click();
	}

	public static void sendkeys(WebElement element, String name) {
		element.sendKeys(name);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static String select_byvisibletext(WebElement element, String name) {
		Select value = new Select(element);
		value.selectByVisibleText(name);
		return name;
	}

	public static int select_byindex(WebElement element, int number) {
		Select value = new Select(element);
		value.selectByIndex(number);
		return number;
	}

	public static String value;

	public static String datadriven(String path, int sheet, int row, int cell) throws IOException {

		File f = new File(path);
		FileInputStream fio = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fio);
		Sheet s = w.getSheetAt(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			value = c.getStringCellValue();
		} else if (type.equals(CellType.NUMERIC)) {
			double d = c.getNumericCellValue();
			int i = (int) d;
			value = String.valueOf(i);
		}
		w.close();
		return value;

	}
	public static String[][] testdata(String path, int sheetnum, int rownum) throws IOException {
		File f = new File(path);
		FileInputStream fio = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fio);
		Sheet s = w.getSheetAt(sheetnum);
		int Trows = s.getLastRowNum();
		Row row = s.getRow(rownum);
		int Tcolumns = row.getLastCellNum();
		
		DataFormatter format = new DataFormatter();
		String loginDATA[][] = new String[Trows][Tcolumns];
		for (int i = 1; i <= Trows; i++) {
			for (int j = 0; j < Tcolumns; j++) {
				loginDATA[i-1][j] = format.formatCellValue(s.getRow(i).getCell(j));
				
			}
		}
		w.close();
		return loginDATA;
	}
	public static void explicitWait(WebElement element,int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	
}
