package com.cydeo.tests.day_4XpathCssSelector;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.stream.events.EndElement;

public class TC1_XpathCssSelector {
    public static void main(String[] args) {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password ");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)

        //a. “Home” link
        WebElement homeLink1=driver.findElement(By.cssSelector("a[class='nav-link']"));
        //WebElement homeLink1=driver.findElement(By.cssSelector("a.nav-link")); // --> suing SYNTAX 2 of the CSS selector 

        WebElement  homeLink2=driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header
        // Locate header using Css Selector : locate parent element  and move down to the child
        WebElement header1= driver.findElement(By.cssSelector("div.example>h2"));

        //Locate header using xpath
        WebElement header2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        //c. “E-mail” text
        WebElement email=driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box
        WebElement emailInputBox1=driver.findElement(By.cssSelector("input[type='text']"));//cssSelector
        WebElement emailInputBox2=driver.findElement(By.xpath("input[@type='text']"));//xpath

        //e. “Retrieve password” button
        WebElement retrievePasswordButton=driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByText=driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("header1 = " + header1);
        System.out.println("email = " + email);
        System.out.println("emailInputBox1 = " + emailInputBox1);
        System.out.println("retrievePasswordButton = " + retrievePasswordButton);
        System.out.println("poweredByText = " + poweredByText);
    }
}
