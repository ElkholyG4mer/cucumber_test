package com.example.cucumber.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.example.LoginAndRegistrationPage;

public class LoginSteps {
    WebDriver driver;
    LoginAndRegistrationPage loginPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginAndRegistrationPage(driver);
        loginPage.urlNavigate();
        loginPage.ClickOnLoginTabButton();
    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        loginPage.FillLoginData("mostafa.elkholy@gmail.com","abcd123456");
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        loginPage.ClickOnLoginButton();
    }

    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        loginPage.validateLogin("Logout");
        driver.quit();
    }
}
