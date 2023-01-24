package com.cydeo.tests.day5_testNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadionBtnHandling {
    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        WebElement hockeyBtn=driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyBtn.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        if (hockeyBtn.isSelected()){
            System.out.println("Hockey btn is selected; TRUE");
        }else {
            System.out.println("Hockey btn is selected; FALSE");
        }
    }
}
