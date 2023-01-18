package com.cydeo.tests.day3_locatorsAndExtraMethods;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_CssSelectorGetText {
    public static void main(String[] args) {
        //1- Open a chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password
        String expectedText="Reset password";
        WebElement resetPassword=driver.findElement(By.cssSelector("button[class='login-btn']"));

        String actualText=resetPassword.getText();

        if(actualText.contains(expectedText)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


    }
}
