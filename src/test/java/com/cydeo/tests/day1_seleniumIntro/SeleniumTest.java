package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1-Setting up the wev driver manager

        WebDriverManager.chromedriver().setup();

        //2- Creat instance of the chrome driver

        WebDriver driver= new ChromeDriver();

        //3- Test if driver is working

        driver.get("https://www.google.com");

        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        driver.navigate().refresh();
        String currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        driver.navigate().to("https://www.tesla.com");
        currentTitle=driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);
        currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


    }
}
