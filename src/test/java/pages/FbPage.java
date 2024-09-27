package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbPage extends PageObject {

    @FindBy(xpath = "//input[@id='email']")
    WebElement username;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;


    public void sendUsername(String user){
        getDriver().findElement(By.xpath("//input[@id='email']")).sendKeys(user);
    }

    public void sendPassword(String pass){
        getDriver().findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
    }


}
