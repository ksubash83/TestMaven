package PracticePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    
	public WebDriver driver1;
	
	
	public WebDriver invokeBrowser() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\ksuba\\MeekyProject\\src\\main\\java\\Mdata.properties");
	
		prop.load(fis);
		String sbrowser=prop.getProperty("browser");
		
		if (sbrowser.contains("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ksuba\\Work\\chromedriver_win32\\chromedriver.exe");
			driver1= new ChromeDriver();
		}
		else {
		}
		return driver1;
		}	
	
	public String grabUrl() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\ksuba\\MeekyProject\\src\\main\\java\\Mdata.properties");
	
		prop.load(fis);
		String surl=prop.getProperty("url");
		
		return surl;
	}
	
	public XSSFCell getCellVal(int rowval, int colval, int sheetNum) throws IOException {
		
		String input="C:\\Users\\ksuba\\MeekyProject\\src\\main\\java\\testData\\TestData_Selenium.xlsx";
		
		//fileinputstream opens the file in read-only mode
		FileInputStream fis=new FileInputStream(new File(input));
		
		//access the file
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(sheetNum);
		XSSFRow row=sheet.getRow(rowval);
		XSSFCell cell=row.getCell(colval);
		
		return cell;
	}
}