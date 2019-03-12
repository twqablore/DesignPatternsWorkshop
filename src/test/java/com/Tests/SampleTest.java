package com.Tests;

import com.Pages.HomePage;
import com.Utils.BaseClass;
import org.testng.annotations.Test;

public class SampleTest extends BaseClass {

    @Test
    public void SignInTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignIn().enterCredentials("test@thoughtworks.com", "password")
                .validateMyAccoutPage();
    }
}
