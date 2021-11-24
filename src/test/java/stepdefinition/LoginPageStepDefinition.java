package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepDefinition {
	WebDriver driver;
	@Given("user is on login page")

	public void user_is_on_Login_Page() {

	WebDriverManager.chromedriver().setup();

	driver=  new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	/*@When("user enters correct username")

	public void user_enters_correct_username() {

	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");

	}



	@When("user enters correct password")

	public void user_enters_correct_password() {

	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	}*/
	/*@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
	driver.findElement(By.id("txtUsername")).sendKeys(username);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}*/
	@When("^User enters username as  (.+)$")
    public void user_enters_username_as(String username)  {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
    }

	@When("^User enters password as (.+)$")
    public void user_enters_password_as(String password) {
       driver.findElement(By.id("txtPassword")).sendKeys(password); 
    }


	@Then("login successfull")

	public void user_should_be_logged_in_successfully() {

	    driver.quit();

	}

	 

	 

/*	@When("user enters incorrect username")

	public void user_enters_incorrect_username() {

	driver.findElement(By.id("txtUsername")).sendKeys("Admin_test");

	}



	@When("user enters incorrect password")

	public void user_enters_incorrect_password() {

	    driver.findElement(By.id("txtPassword")).sendKeys("admin123_test");

	}



	@Then("login unsuccessfull")

	public void user_should_not_be_allowed_to_logged_in() {

	    driver.quit();

	}*/

}
