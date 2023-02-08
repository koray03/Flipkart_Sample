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
    Actions actions = new Actions(Driver.getDriver());

    @Given("You will get a login pop-up to login and click on the close icon and cancel the login pop-up")
    public void youWillGetALoginPopUpToLoginAndClickOnTheCloseIconAndCancelTheLoginPopUp() {
        loginSkip.skipLogin.click();
    }

    @And("you will see some banners and it will change randomly. Click on any banner.")
    public void youWillSeeSomeBannersAndItWillChangeRandomlyClickOnAnyBanner() {

        mainPage.dynamicBanner.click();
    }

    @When("Click on any banner and you will see a horizontal menu with Menu name and Hover on it and you will see a list of mobile brands.")
    public void clickOnAnyBannerAndYouWillSeeAHorizontalMenuWithMenuNameAndHoverOnItAndYouWillSeeAListOfMobileBrands() {

        actions.moveToElement(dashboard.electronics).perform();
        actions.pause(10).perform();


    }

    @Then("Need to print all the menus and sub-menus as in order")
    public void needToPrintAllTheMenusAndSubMenusAsInOrder() {
        System.out.println("****************(Electronics)****************");
        List<WebElement> ghostMenu = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][1]/a"));

        for (int i = 0; i < ghostMenu.size(); i++) {

            System.out.println(i + ". " + ghostMenu.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostMenu2 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][2]/a"));
        for (int i = 0; i < ghostMenu2.size(); i++) {

            System.out.println(i + ". " + ghostMenu2.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostMenu3 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][3]/a"));
        for (int i = 0; i < ghostMenu3.size(); i++) {

            System.out.println(i + ". " + ghostMenu3.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostMenu4 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][4]/a"));
        for (int i = 0; i < ghostMenu4.size(); i++) {

            System.out.println(i + ". " + ghostMenu4.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostFeature = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span"));

        for (int i = 0; i < ghostFeature.size(); i++) {

            System.out.println(i + ". " + ghostFeature.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostMenu5 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 0; i < ghostMenu5.size(); i++) {

            System.out.println(i +1 + ". " + ghostMenu5.get(i).getText());
        }
        System.out.println();
        System.out.println("****************(TV's & Appliances)****************");
        System.out.println();

        actions.moveToElement(dashboard.TVsAppliances).perform();
        actions.pause(10).perform();
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostTv = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][1]/a"));

        for (int i = 0; i < ghostTv.size(); i++) {

            System.out.println(i  + ". " + ghostTv.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostTv2 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][2]/a"));
        for (int i = 0; i < ghostTv2.size(); i++) {

            System.out.println(i + ". " + ghostTv2.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostTv3 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][3]/a"));
        for (int i = 0; i < ghostTv3.size(); i++) {

            System.out.println(i + ". " + ghostTv3.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostTv4 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][4]/a"));
        for (int i = 0; i < ghostTv4.size(); i++) {

            System.out.println(i + ". " + ghostTv4.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> BuyingGuides = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span[1]"));

        for (int i = 0; i < BuyingGuides.size(); i++) {

            System.out.println(i + ". " + BuyingGuides.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostTv5 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 0; i < 8; i++) {

            System.out.println(i +1 + ". " + ghostTv5.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> NewLaunches = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span[2]"));

        for (int i = 0; i < NewLaunches.size(); i++) {

            System.out.println(i + ". " + NewLaunches.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> ghostTv6 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 8; i < ghostTv6.size(); i++) {

            System.out.println(i +1 + ". " + ghostTv6.get(i).getText());
        }


        actions.moveToElement(dashboard.Men).perform();
        actions.pause(10).perform();

        System.out.println();
        System.out.println("****************(Men)****************");
        System.out.println();
        List<WebElement> menuMen = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][1]/a"));

        for (int i = 0; i < menuMen.size(); i++) {

            System.out.println(i + ". " + menuMen.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> menuMen2 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][2]/a"));
        for (int i = 0; i < menuMen2.size(); i++) {

            System.out.println(i + ". " + menuMen2.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> menuMen3 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][3]/a"));
        for (int i = 0; i < menuMen3.size(); i++) {

            System.out.println(i + ". " + menuMen3.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> menuMen4 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][4]/a"));
        for (int i = 0; i < menuMen4.size(); i++) {

            System.out.println(i + ". " + menuMen4.get(i).getText());
        }

        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> menuMen5 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 0; i < 6; i++) {

            System.out.println(i +1 + ". " + menuMen5.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> menFeature = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span"));

        for (int i = 0; i < menFeature.size(); i++) {

            System.out.println(i + ". " + menFeature.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> menuMen6 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 6; i < menuMen6.size(); i++) {

            System.out.println(i +1 + ". " + menuMen6.get(i).getText());
        }
        actions.moveToElement(dashboard.Woman).perform();
        actions.pause(10).perform();

        System.out.println();
        System.out.println("****************(Women)****************");
        System.out.println();
        List<WebElement> Woman = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][1]/a"));

        for (int i = 0; i < Woman.size(); i++) {

            System.out.println(i + ". " + Woman.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Woman2 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][2]/a"));
        for (int i = 0; i < Woman2.size(); i++) {

            System.out.println(i + ". " + Woman2.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Woman3 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][3]/a"));
        for (int i = 0; i < Woman3.size(); i++) {

            System.out.println(i + ". " + Woman3.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Woman4 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][4]/a"));
        for (int i = 0; i < Woman4.size(); i++) {

            System.out.println(i + ". " + Woman4.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> WomanFeature = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span[1]"));

        for (int i = 0; i < WomanFeature.size(); i++) {

            System.out.println(i + ". " + WomanFeature.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Woman5 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 0; i < 15; i++) {

            System.out.println(i +1 + ". " + Woman5.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> WomanTrending = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span[2]"));

        for (int i = 0; i < WomanTrending.size(); i++) {

            System.out.println(i + ". " + WomanTrending.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Woman6 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 15; i < Woman6.size(); i++) {

            System.out.println(i +1 + ". " + Woman6.get(i).getText());
        }

        actions.moveToElement(dashboard.BabyKids).perform();
        actions.pause(10).perform();

        System.out.println();
        System.out.println("****************(Baby & Kids)****************");
        System.out.println();
        List<WebElement> babyKid = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][1]/a"));

        for (int i = 0; i < babyKid.size(); i++) {

            System.out.println(i+1 + ". " + babyKid.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> babyKid2 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][2]/a"));
        for (int i = 0; i < babyKid2.size(); i++) {

            System.out.println(i+1 + ". " + babyKid2.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> babyKid3 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][3]/a"));
        for (int i = 0; i < babyKid3.size(); i++) {

            System.out.println(i+1 + ". " + babyKid3.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> babyKid4 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][4]/a"));
        for (int i = 0; i < babyKid4.size(); i++) {

            System.out.println(i+1 + ". " + babyKid4.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> babyKidFeature = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span"));

        for (int i = 0; i < babyKidFeature.size(); i++) {

            System.out.println(i + ". " + babyKidFeature.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> babyKid5 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 0; i < babyKid5.size(); i++) {

            System.out.println(i +1 + ". " + babyKid5.get(i).getText());
        }
        actions.moveToElement(dashboard.HomeFurniture).perform();
        actions.pause(10).perform();

        System.out.println();
        System.out.println("****************(Home & Furniture)****************");
        System.out.println();
        List<WebElement> HomeFurniture = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][1]/a"));

        for (int i = 0; i < HomeFurniture.size(); i++) {

            System.out.println(i+1 + ". " + HomeFurniture.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> HomeFurniture2 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][2]/a"));
        for (int i = 0; i < HomeFurniture2.size(); i++) {

            System.out.println(i+1 + ". " + HomeFurniture2.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> HomeFurniture3 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][3]/a"));
        for (int i = 0; i < HomeFurniture3.size(); i++) {

            System.out.println(i+1 + ". " + HomeFurniture3.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> HomeFurniture4 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][4]/a"));
        for (int i = 0; i < HomeFurniture4.size(); i++) {

            System.out.println(i+1 + ". " + HomeFurniture4.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> HomeFurniture5 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 0; i < 1; i++) {

            System.out.println(i +1 + ". " + HomeFurniture5.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> HomeFurniture4Feature = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span"));

        for (int i = 0; i < HomeFurniture4Feature.size(); i++) {

            System.out.println(i + ". " + HomeFurniture4Feature.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> HomeFurniture6 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 1; i < HomeFurniture6.size(); i++) {

            System.out.println(i +1 + ". " + HomeFurniture6.get(i).getText());
        }

        actions.moveToElement(dashboard.SportsBooksMore).perform();
        actions.pause(10).perform();

        System.out.println();
        System.out.println("****************(Sports, Books & More)****************");
        System.out.println();
        List<WebElement> Sports = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][1]/a"));

        for (int i = 0; i < Sports.size(); i++) {

            System.out.println(i + ". " + Sports.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Sports2 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][2]/a"));
        for (int i = 0; i < Sports2.size(); i++) {

            System.out.println(i + ". " + Sports2.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Sports3 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][3]/a"));
        for (int i = 0; i < Sports3.size(); i++) {

            System.out.println(i + ". " + Sports3.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Sports4 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][4]/a"));
        for (int i = 0; i < Sports4.size(); i++) {

            System.out.println(i + ". " + Sports4.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> SportsMenu = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span[1]"));

        for (int i = 0; i < SportsMenu.size(); i++) {

            System.out.println(i + ". " + SportsMenu.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Sports5 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 0; i < 3; i++) {

            System.out.println(i +1 + ". " + Sports5.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> GameMenu = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/span[2]"));

        for (int i = 0; i < GameMenu.size(); i++) {

            System.out.println(i + ". " + GameMenu.get(i).getText());
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        List<WebElement> Sports6 = Driver.getDriver().findElements(By.xpath("//div[@class='_1QrT3s']/div[@class='_1fwVde'][5]/a"));

        for (int i = 3; i < Sports6.size(); i++) {

            System.out.println(i +1 + ". " + Sports6.get(i).getText());
        }


    }
}
