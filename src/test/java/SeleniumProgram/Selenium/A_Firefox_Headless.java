package SeleniumProgram.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_Firefox_Headless
	{
	    public static void main(String[] args) 
	    {
	    
	    	        
	    	        //Creating a driver object referencing WebDriver interface
	    	     //   WebDriver driver;
	    	        
	    	        //Setting webdriver.gecko.driver property
	    	       // System.setProperty("webdriver.gecko.driver", pathToGeckoDriver + "\\geckodriver.exe");
	    			WebDriverManager.firefoxdriver().setup();
	    	        
	    	        //Instantiating driver object and launching browser
	    		     WebDriver driver = new FirefoxDriver();
	    	        
	    	        //Using get() method to open a webpage
	    	        driver.get("https://google.com");
	    	        
	    	        //Closing the browser
	    	        driver.quit();
	    	 
	    	    }
	    	 
	    	
	    }
	

