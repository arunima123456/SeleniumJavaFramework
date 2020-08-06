package test;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsBasicDemo 
{
	private static WebDriver driver;
	public static void main(String[] args)
	{
		// start reporters
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReports.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "this is a test to validate google search functionality");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Arunima Mondal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
         driver=new ChromeDriver();
         test1.log(Status.INFO, "Starting test cases");

        driver.get("https://www.google.com");
        test1.pass("Navigated to google.com");
        driver.findElement(By.name("q")).sendKeys("Automation");
        test1.pass("enter text in search box");
        driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
        test1.pass("press keyboard enter key");
        driver.close();
        driver.quit();
        test1.pass("closed the browser");
        	
        test1.info("test completed");
        
        extent.flush();
    

}

}