package com.playtech.test;

import Base.BaseClass;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class TestHomePage extends BaseClass {
    @Test
    public void testForHomePage() throws InterruptedException {
            driver.get("https://www.rightmove.co.uk/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//button[@class='optanon-allow-all accept-cookies-button']")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("div#_1oW0JJocRfjq6xXQVELlr7>button:nth-of-type(2)")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Buy']"));
        assertEquals("https://www.rightmove.co.uk/", driver.getCurrentUrl());

}
        @Test
        public void callHomePage() throws InterruptedException {
        HomePage hm = new HomePage();
        hm.setUp();
        hm.searchBox();
        hm.forSale();

}
}
