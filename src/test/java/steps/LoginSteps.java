package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {

    @Given("user is able to access HRM application")
    public void user_is_able_to_access_hrm_application() {
       openBrowser();
    }

    @When("user is able to enter username")
    public void user_is_able_to_enter_username() {
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        userNameField.clear();
    }
    @When("user is able to enter password")
    public void user_is_able_to_enter_password() {
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        sendTxt("Hum@nhrm123",passwordField);
    }
    @When("user is able to click on the login button")
    public void user_is_able_to_click_on_the_login_button() {
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();
    }
    @Then("the system should display an error message that {string}")
    public void the_system_should_display_an_error_message_that(String string) {
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        String isEmpty=userNameField.getText();
        Assert.assertEquals("",isEmpty);
        System.out.println("The Username cannot be empty!");
    }
    @When("user is able to enter valid username")
    public void user_is_able_to_enter_valid_username() {
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        sendTxt("Admin",userNameField);
    }
    @When("user is leaving password feild empty")
    public void user_is_leaving_password_feild_empty() {
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        sendTxt("",passwordField);
    }
    @Then("the system should display an error message that password field is empty")
    public void the_system_should_display_an_error_message_that_password_field_is_empty() {
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        String isEmpty=passwordField.getText();
        Assert.assertEquals("",isEmpty);
        System.out.println("Password Field is empty!");
    }

    @When("user is able to enter invalid username")
    public void user_is_able_to_enter_invalid_username() {
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        sendTxt("Wrongusername",userNameField);
    }
    @When("user is able to enter invalid password")
    public void user_is_able_to_enter_invalid_password() {
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        sendTxt("WrongPassword",passwordField);
    }
    @Then("the system should displays invalid credentials message")
    public void the_system_should_displays_invalid_credentials_message() {
        WebElement invalidCrd = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String errorMsg=invalidCrd.getText();
        Assert.assertEquals(errorMsg,"Invalid credentials");
        System.out.println("!!!INVALID CREDENTIALS!!!");
    }
}
