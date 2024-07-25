package steps;

import net.serenitybdd.annotations.Step;
import pages.FbPage;

public class FbSteps {

    FbPage fbPage = new FbPage();
    @Step
    public void enterUser(String u){
        fbPage.sendUsername(u);
    }

    @Step
    public void enterPass(String p){
        fbPage.sendPassword(p);
    }

    @Step
    public void launchFb() {
        fbPage.open();
    }

    @Step
    public void maximize() throws InterruptedException {
        fbPage.getDriver().manage().window().maximize();
        Thread.sleep(1000);
    }
}
