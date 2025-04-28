package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {
	
	  static WebDriver driver;

@Given("User is on login page {string}")
public void user_is_on_login_page(String url) {
	driver = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.get(url);
  driver.manage().window().maximize();
}

@When("Users enters valid {string} amd {string}")
public void users_enters_valid_amd(String username, String password) {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));        
   driver.findElement(By.name("email")).clear();
   driver.findElement(By.name("email")).sendKeys(username);                  
   driver.findElement(By.name("password")).clear();
   driver.findElement(By.name("password")).sendKeys(password);  
}

@When("Clicks on Login button on Gravityer login page")
public void clicks_on_login_button_on_gravityer_login_page() {
	driver.findElement(By.xpath("//div/button[@type='submit']")).click();
}

@Then("User should be navigated to Next page")
public void user_should_be_navigated_to_next_page() {
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));        
  WebElement loggedin = driver.findElement(By.xpath("//div/button[text()='Logout']"));
  Assert.assertTrue(loggedin.isDisplayed(),"Message");
}

@Then("User closes the browser")
public void user_closes_the_browser() {
	driver.close();
}




}
