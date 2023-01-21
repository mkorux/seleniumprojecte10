package com.cydeo.tests.day_4XpathCssSelector;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_CheckBoxPractice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1=driver.findElement(By.xpath("//input[@id='box1']"));
        if(checkbox1.isDisplayed()){
            System.out.println("FAILED");
        }else{
            System.out.println("PASSED");
        }

        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2=driver.findElement(By.xpath("//input[@id='box2']"));
        if(checkbox2.isDisplayed()){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        //4. Click checkbox #1 to select it.
        checkbox1.click();

        //5. Click checkbox #2 to deselect it.
        checkbox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        if(checkbox1.isDisplayed()){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        //7. Confirm checkbox #2 is NOT selected.
        if(checkbox2.isDisplayed()){
            System.out.println("FAILED");
        }else{
            System.out.println("PASSED");
        }
    }
}
