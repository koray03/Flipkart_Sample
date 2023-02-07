package com.test.step_definitions;

import com.test.pages.Dashboard.Dashboard;
import com.test.pages.Login.Login_Skip;
import com.test.pages.MainPage.MainPage;
import com.test.utilities.BrowserUtils;
import com.test.utilities.ConfigurationReader;
import com.test.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MyStepdefs {
    Login_Skip loginSkip = new Login_Skip();
    MainPage mainPage =new MainPage();
    Dashboard dashboard = new Dashboard();

    @Given("You will get a login pop-up to login and click on the close icon and cancel the login pop-up")
    public void youWillGetALoginPopUpToLoginAndClickOnTheCloseIconAndCancelTheLoginPopUp() {
        loginSkip.skipLogin.click();
    }

    @And("you will see some banners and it will change randomly. Click on any banner.")
    public void youWillSeeSomeBannersAndItWillChangeRandomlyClickOnAnyBanner() {

        mainPage.dynamicBanner.click();
    }

    @When("Click on any banner and you will see a horizontal menu with Electronics and Hover on it and you will see a list of mobile brands.")
    public void clickOnAnyBannerAndYouWillSeeAHorizontalMenuWithElectronicsAndHoverOnItAndYouWillSeeAListOfMobileBrands() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dashboard.electronics).perform();
        actions.pause(10).perform();


    }

    @Then("Need to print all the mobile brands as per below format on console")
    public void needToPrintAllTheMobileBrandsAsPerBelowFormatOnConsole() {
        List<WebElement> ghostMenu = Driver.getDriver().findElements(By.xpath("//div[@class='_1fwVde'][1]/a"));
        for (int i = 1; i < ghostMenu.size(); i++) {
            System.out.println(i + ". " + ghostMenu.get(i).getText());

        }
    }


}
