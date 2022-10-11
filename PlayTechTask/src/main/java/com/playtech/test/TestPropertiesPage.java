package com.playtech.test;

import Pages.PropertiesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPropertiesPage {

    WebDriver driver;

    @Test
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.rightmove.co.uk/property-for-sale/find.html?searchType=SALE&locationIdentifier=OUTCODE%5E852&insId=1&radius=0.0&minPrice=200000&maxPrice=700000&minBedrooms=2&maxBedrooms=4&displayPropertyType=houses&maxDaysSinceAdded=&_includeSSTC=on&sortByPriceDescending=&primaryDisplayPropertyType=&secondaryDisplayPropertyType=&oldDisplayPropertyType=&oldPrimaryDisplayPropertyType=&newHome=&auction=false");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//button[@class='optanon-allow-all accept-cookies-button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div#_1oW0JJocRfjq6xXQVELlr7>button:nth-of-type(2)")).click();

    }

    @Test
    public void methodCall() {
        PropertiesPage pp = new PropertiesPage();

        pp.sortedOrder();
        pp.chooseProperty();


    }
}