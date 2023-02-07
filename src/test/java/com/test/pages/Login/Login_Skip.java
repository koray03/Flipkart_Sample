package com.test.pages.Login;

import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Skip {
   public Login_Skip(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
       public WebElement skipLogin;





}
