package com.cydeo.tests.day5_testNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementsRefEx {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/ ");

        //3. Click to “Add Element” button
        WebElement addElementBtn= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementBtn.click();

        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteBtn=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteBtn.isDisplayed()){
            System.out.println("Delete button is displayed");
        }else {
            System.out.println("Delete button is not displayed");
        }

        //5. Click to “Delete” button.
        deleteBtn.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
        try {
            if (deleteBtn.isDisplayed()){
                System.out.println("Delete button is displayed");
            }else {
                System.out.println("Delete button is not displayed");
            }
        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
        }
        driver.close();

    }
}
