package com.Pages;

import com.Objects.RegistrationPageObjects;
import com.Utils.Helpers;
import com.Utils.NewUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Helpers {

    RegistrationPageObjects registrationPageObjects;
    private Select state;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        registrationPageObjects = new RegistrationPageObjects();
        PageFactory.initElements(driver, registrationPageObjects);
        waitForElement(registrationPageObjects.firstName);
    }


    public MyAccountPage registerUser(NewUser user) {

        registrationPageObjects.customerfirstName.sendKeys(user.firstName);
        registrationPageObjects.customerlastName.sendKeys(user.lastName);
        registrationPageObjects.password.sendKeys(user.password);
        registrationPageObjects.firstName.sendKeys(user.firstName);
        registrationPageObjects.address1.sendKeys(user.address1);
        registrationPageObjects.city.sendKeys(user.city);


        state = new Select(registrationPageObjects.state);
        state.selectByValue(user.state);

        registrationPageObjects.postcode.sendKeys(user.postcode);
        registrationPageObjects.phoneMobile.sendKeys(user.phoneMobile);
        registrationPageObjects.submitAccount.click();

        return new MyAccountPage(driver);
    }
}
