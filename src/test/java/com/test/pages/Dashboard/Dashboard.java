package com.test.pages.Dashboard;

import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Electronics']") //_1fwVde
    public WebElement electronics;

    @FindBy(xpath = "//span[.='TVs & Appliances']")
    public WebElement TVsAppliances;

    @FindBy(xpath = "//span[.='Men']")
    public WebElement Men;

    @FindBy(xpath = "//span[.='Women']")
    public WebElement Woman;

    @FindBy(xpath = "//span[.='Baby & Kids']")
    public WebElement BabyKids;

    @FindBy(xpath = "//span[.='Home & Furniture']")
    public WebElement HomeFurniture;

    @FindBy(xpath = "//span[.='Sports, Books & More']")
    public WebElement SportsBooksMore;

}
