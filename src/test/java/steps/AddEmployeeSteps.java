package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddEmployeeSteps extends CommonMethods {

    @Given("user is able to access HRM application with valid user name and password")
    public void user_is_able_to_access_hrm_application_with_valid_user_name_and_password() {
      openBrowser();
        WebElement userName=driver.findElement(By.id("txtUsername"));
        sendTxt(ConfigReader.read("userName"),userName);
        WebElement password=driver.findElement(By.id("txtPassword"));
        sendTxt(ConfigReader.read("password"),password);
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();

    }
    @When("uers is able to add {string} then {string} and {string}")
    public void uers_is_able_to_add_then_and(String fn, String mn, String ln) {
        sendTxt("Ahmad",addEmpPage.firstnameBox);
        sendTxt("Jan",addEmpPage.meddleNameBox);
        sendTxt("BO",addEmpPage.lastNameBox);
    }
    @When("user clicks the save buttonScenario:")
    public void user_clicks_the_save_button_scenario() {
        addEmpPage.SaveButton.click();
    }

    @When("uers is able to add {string} then {string}, {string} and {string}")
    public void uers_is_able_to_add_then_and(String string, String string2, String string3, String string4) {
        sendTxt("Ahmad2",addEmpPage.firstnameBox);
        sendTxt("Jan2",addEmpPage.meddleNameBox);
        sendTxt("BO2",addEmpPage.lastNameBox);
        sendTxt("555555",addEmpPage.empID);
    }
    @When("user clicks the save button")
    public void user_clicks_the_save_button() {
        addEmpPage.SaveButton.click();
    }
}
