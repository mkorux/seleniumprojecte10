package com.cydeo.tests.day3_locatorsAndExtraMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GEtTextPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //1- Open a chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/ ");

        //3- Enter incorrect username: “incorrect”
        WebElement login= driver.findElement(By.name("USER_LOGIN"));
        login.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        WebElement password=driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        //5- Click to login button.
        WebElement loginButton=driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        WebElement invalidMessage=driver.findElement(By.className("errortext"));
        String actualErrorMessage=invalidMessage.getText();

        //Expected: Incorrect login or password
        String expectedErrorMessage="Incorrect login or password";

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("PASSSED");
        }else {
            System.out.println("FAILED");
        }




    }
}
