package com.cydeo.tests.day2_locators_getText_getAttribite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoggleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //Go to "Google.com"
        driver.get("https://google.com");

        //Write apple in search box
        WebElement googleSearchBox= driver.findElement(By.name("q"));

        //Press ENTER using Keys.ENTER
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        // Expected: Title should start with "apple" word
        String expectedTitle="apple";
        String actualTitle=driver.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }


    }
}
