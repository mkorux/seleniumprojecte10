package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1- Set up the broeser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the driver
        WebDriver driver=new ChromeDriver();

        //3- Go to Tesla.com
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 seconds


        //4-USe selenium to navigate back
        driver.navigate().back();

        //5-Use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use navigate()




    }
}
