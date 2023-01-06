package com.cydeo.tests.day2_locators_getText_getAttribite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.contains("cydeo")){
            System.out.println("T1 PASSED");
        }else{
            System.out.println("T1 FAILED");
        }

        String actualTitle=driver.getTitle();

        //Expected Title=Practice
        String expectedTitle="Practice";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("T2 PASSED");
        }else{
            System.out.println("T2 FAILED");
        }

        driver.hashCode()
    }
}
