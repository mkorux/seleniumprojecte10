package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {
        //set up web driver
        WebDriverManager.chromedriver().setup();

       //Create driver browser
        WebDriver driver=new ChromeDriver();

        //Make our page fullscreen
        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://wwww.yahoo.com");

        //3. Verify title:
        //Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual title comes from the browser
        String actualTitle=driver.getTitle();
        System.out.println("currentTitle = " + actualTitle);

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification PASSED");
        }else System.out.println("Verification FAILED");
        
        System.out.println("Thank you, Mehmet for keeping up the beat!!);


    }
}
