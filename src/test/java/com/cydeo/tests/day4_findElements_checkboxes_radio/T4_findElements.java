package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {

//        TC #4: FindElements Task
//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");
//        3- Locate all the links in the page.

//        4- Print out the number of the links on the page.
//        5- Print out the texts of the links.
//        6- Print out the HREF attribute values of the links

    }
}
