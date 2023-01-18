package com.cydeo.tests.day3_locatorsAndExtraMethods;

import com.cydeo.utilities.WebDriverFactory;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_CssSelector {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/  ");

        //3- Verify “Log in” button text is as expected:

        //      DIFFRENT WAYS OF LOCATING THE ELEMENT WITH CSSSELECTOR
        //WebElement loginButton=driver.findElement(By.className("login-btn"));
        //WebElement loginButton=driver.findElement(By.cssSelector("input[class='login-btn']"));
        WebElement loginButton=driver.findElement(By.cssSelector("input[type='submit']"));
        String actualResult=loginButton.getAttribute("value");
        String expectedResult="Log in";
        //Expected: Log In

        if(actualResult.contains(expectedResult)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
    }
}
