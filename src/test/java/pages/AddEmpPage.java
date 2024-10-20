package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmpPage extends CommonMethods {

    @FindBy(id = "firstName")
    public WebElement firstnameBox;

    @FindBy(id = "middleName")
    public WebElement meddleNameBox;

    @FindBy(id = "lastName")
    public WebElement lastNameBox;

    @FindBy (id = "employeeId")
    public WebElement empID;

    @FindBy(id = "btnSave")
    public WebElement SaveButton;

    public AddEmpPage (){
        PageFactory.initElements(driver,this);
    }
}
