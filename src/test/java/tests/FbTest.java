package tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.FbSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@RunWith(SerenityRunner.class)
public class FbTest {

    @Steps
    FbSteps fbSteps;

    @Managed(driver = "chrome")
    WebDriver driver;


    Properties prop = new Properties();

    @Test()
    public void fbRun() throws IOException, InterruptedException {
        prop.load(new FileInputStream("src/main/resources/testdata.properties"));
        fbSteps.launchFb();
        fbSteps.maximize();
        fbSteps.enterUser(prop.getProperty("username"));
        fbSteps.enterPass(prop.getProperty("password"));


    }
}
