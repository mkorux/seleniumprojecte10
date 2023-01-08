package com.cydeo.tests.day2_locators_getText_getAttribite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com ");


        //3- Click to Gmail from top right.
        WebElement gmail=driver.findElement(By.linkText("Gmail"));
        gmail.click();
        //4- Verify title contains:
        String actualTitle=driver.getTitle();
        //Expected: Gmail
        String expectedTitle="Gmail";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED");
        }else {
            System.out.println("Title Verification FAILED");
        }
        //Slowdown the code to see the title "Gmail"
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        String actualTitle1=driver.getTitle();

        //Expected: Google
        String expectedTitle1="Google";

        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("Title Verification PASSED");
        }else {
            System.out.println("Title Verification FAILED");
        }

    }
}
