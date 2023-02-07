package com.test.step_definitions;



import com.test.utilities.ConfigurationReader;
import com.test.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before("@ui")
    public void setUp() {
        System.out.println(">>>>Setting up the browser<<<<");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        //BrowserUtils.waitFor(2);


    }

    @After("@ui")
    public void tearDown(Scenario scenario) {
        System.out.println(">>>>Shutting Down<<<<");

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        Driver.closeDriver();

    }

//   @Before("@db")
//    public void setUpDB() {
//
//        System.out.println(">>>>Creating DataBase Connection<<<<");
//        DB_Util.createConnection();
//
//
//    }
//
//    @After("@db")
//    public void destroyDB() {
//        System.out.println(">>>>Closing DataBase Connection<<<<");
//        DB_Util.destroy();

    }


