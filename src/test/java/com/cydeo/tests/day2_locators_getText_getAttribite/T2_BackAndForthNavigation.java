package com.cydeo.tests.day2_locators_getText_getAttribite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_BackAndForthNavigation {
    public static void main(String[] args) {

        // Set up the webdriver
        WebDriverManager.chromedriver().setup();

        //Create driver object
        WebDriver driver=new ChromeDriver();

        //Go to a practice page of Cydeo
        driver.navigate().to("https://practice.cydeo.com");

        //Click A/B testing
        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestingLink=driver.findElement(By.linkText("A/B Testing"));
        abTestingLink.click();


    }
}
