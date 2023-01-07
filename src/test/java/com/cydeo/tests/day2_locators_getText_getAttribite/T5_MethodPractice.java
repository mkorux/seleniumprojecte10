package com.cydeo.tests.day2_locators_getText_getAttribite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_MethodPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();


        //1- Open a chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        // 3- Verify header text is as expected:
        WebElement headerText=driver.findElement(By.tagName("h2"));
        String actualHeader=headerText.getText();

        // Expected: Registration form
        String expectedHeader="Registration form";

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification PASSED");
        }else {
            System.out.println("Header verification FAILED");
        }

        //4- Locate “First name” input box
        WebElement firstNameInputBox=driver.findElement(By.name("firstname"));
        String actualPlaceHolder=firstNameInputBox.getAttribute("placeholder");

        // 5- Verify placeholder attribute’s value is as expected:
        // Expected: first name
        String expectedPlaceHolder="first name";

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Attribute verification PASSED");
        }else{
            System.out.println("Attribute verification PASSED");
        }


    }
}
