package stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Android_App_Launch_StepDefinition {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities(); 
		caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
		caps.setCapability("device", "OnePlus OnePlus 9");
		caps.setCapability("os_version", "11.0");
		//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://put_the_url_here/wd/hub"), caps);
		//driver.quit();
	}
}
