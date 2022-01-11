package stepDefinitions;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbStepDefinition {
	WebDriver driver;

	@Given("user sets the browser and opens fb home page")
	public void user_sets_the_browser_and_opens_fb_home_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pcbabu08@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("navcb12cb");
	}

	@And("user hits on login buttin")
	public void user_hits_on_login_buttin() {
		driver.findElement(By.name("login")).click();
	}

	@Then("user navigates to fb login page and shows invalid login")
	public void user_navigates_to_fb_login_page_and_shows_invalid_login() {
		String expected= driver.getTitle();
		System.out.println(expected);
		String actual="Facebook – log in or sign up";
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("Login of invalid credential was success"+expected);
		}
		else {
			System.out.println("Testing of invalid credentials got failed and not matched with "+ actual);

		}
		driver.close();
	}




}
