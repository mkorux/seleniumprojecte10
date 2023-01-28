package com.cydeo.tests.day5_testNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_UtilityMethodTask {
    public static void main(String[] args) {

        //TC #3: Utility method task for (continuation of Task2)

        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons ");

       /* //Locate name='sports' radio buttons and store them in a list of Web Element
        List<WebElement> sportRadioBtns=driver.findElements(By.name("sport"));

        //4. Verify “Hockey” radio button is selected after clicking.
        for (WebElement each: sportRadioBtns) {
            String eachId=each.getAttribute("id");

            if (eachId.equals("hockey")){
                each.click();
                System.out.println("Hockey is selected:"+each.isSelected());
                break;
            }
        } */

        clickAndVerifyRadioBtn(driver,"sport","hockey");
        clickAndVerifyRadioBtn(driver,"color","blue");
        clickAndVerifyRadioBtn(driver,"sport","football");
        clickAndVerifyRadioBtn(driver,"color","red");

    }
    public static void clickAndVerifyRadioBtn(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButtons=driver.findElements(By.name(nameAttribute));

        for (WebElement each:radioButtons) {
            String eacId=each.getAttribute("id");
            if (eacId.equals(idValue)){
                each.click();
                System.out.println(idValue+" is selected: "+ each.isSelected());
                break;
            }
        }

    }
}
