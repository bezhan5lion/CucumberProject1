package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CommonMethods extends pageInitializer{

    public static WebDriver driver;

    public void openBrowser() {

        switch (ConfigReader.read("browser")){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Firefox":
                driver=new FirefoxDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
            default:
                throw new RuntimeException("Incorrect Browser Name");


        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(ConfigReader.read("url"));

        initializePageObject();
    }

    public void sendTxt(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
    }


