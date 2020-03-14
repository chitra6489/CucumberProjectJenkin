package org.basepar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClassp {
		    public static WebDriver driver;
		    public static final String USERNAME = "ilakyathra1";
		    public static final String AUTOMATE_KEY = "qV1Up3zughuSedHEUKTG";
		    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

		    public static void main(String[] args) throws Exception {

		      DesiredCapabilities caps = new DesiredCapabilities();
		      caps.setCapability("browser", "Chrome");
		      caps.setCapability("browser_version", "70.0");
		      caps.setCapability("os", "Windows");
		      caps.setCapability("os_version", "10");
		      caps.setCapability("resolution", "1024x768");
		      caps.setCapability("name", "hai");

		      WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		      
	   public static void launchBrowser() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL 7450\\Desktop\\eclipse\\MavenCucumberParallel\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
	    }
	

}
