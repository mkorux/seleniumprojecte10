package com.cydeo.tests.day3_locatorsAndExtraMethods;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locatorsGetTextGEtAttribute {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/  ");

        //3- Verify “remember me” label text is as expected:
        WebElement rememberMeLabel=driver.findElement(By.className("login-item-checkbox-label"));
        String actualLAbel=rememberMeLabel.getText();

        //Expected: Remember me on this computer
        String expectedLAbel="Remember me on this computer";
        if(actualLAbel.equals(expectedLAbel)){
            System.out.println("Label Test PASSED");
        }else {
            System.out.println("Label Test FAILED");
        }

        //4- Verify “forgot password” link text is as expected:
        WebElement forgotYourPassword=driver.findElement(By.className("login-link-forgot-pass"));
        String actualMessage=forgotYourPassword.getText();

        //Expected: Forgot your password?
        String expectedMessage="Forgot your password?";
        if(actualMessage.equals(expectedMessage)){
            System.out.println("Pasword Verification Message Test PASSED");
        }else {
            System.out.println("Pasword Verification Message Test FAILED");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        String actualHrefValue=forgotYourPassword.getAttribute("href");
        //Expected: forgot_password=yes
        String expectedHrefValue="forgot_password=yes";

        if(actualMessage.equals(expectedMessage)){
            System.out.println("Href Value Test PASSED");
        }else {
            System.out.println("Href Value Test FAILED");
        }
    }
}
