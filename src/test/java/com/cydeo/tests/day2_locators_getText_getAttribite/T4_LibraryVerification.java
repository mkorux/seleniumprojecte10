package com.cydeo.tests.day2_locators_getText_getAttribite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://library2.cybertekschool.com/login.html ");

        WebElement emailAdress=driver.findElement(By.className("form-control"));
        emailAdress.sendKeys("incorrect@email.com");

        WebElement pasword=driver.findElement(By.id("inputPassword"));
        pasword.sendKeys("incorrect password");

        WebElement tagName=driver.findElement(By.tagName("button"));
        tagName.click();





    }
}
