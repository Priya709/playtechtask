package com.playtech.test;

import Base.BaseClass;
import Pages.DropDownPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class TestDropDownPage extends BaseClass {
    DropDownPage ddp;
    WebDriver driver = null;
@Test
        public void setup() throws InterruptedException {

            driver.get("https://www.rightmove.co.uk/property-for-sale/search.html?searchLocation=EN2&useLocationIdentifier=false&locationIdentifier=&buy=For+sale");
            driver.manage().window().maximize();
           // driver.findElement(By.className("optanon-alert-box-button-middle accept-cookie-container")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//button[@class='optanon-allow-all accept-cookies-button']")).click();
    assertEquals("https://www.rightmove.co.uk/property-for-sale/search.html?searchLocation=EN2&useLocationIdentifier=false&locationIdentifier=&buy=For+sale", driver.getCurrentUrl());

        }
    public void initializer() {
        BaseClass bs = new BaseClass();
        ddp = new DropDownPage();
    }
        public static ChromeOptions getChromeOptions() {
            return new ChromeOptions().setHeadless(false);
        }



        @Test
        public void callMethods(){
            DropDownPage dropdown = new DropDownPage();
          //  dropdown.searchRadius();
            dropdown.priceRangeMin();
            dropdown.NumOfBedrooms();
            dropdown.PropertyType();
            dropdown.addedToSite();
            dropdown.findProperties();
           // dropdown.cleanUp();
        }
    }


