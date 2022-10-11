package Pages;

import Base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class DropDownPage extends BaseClass {
    public void setUp() throws InterruptedException {

            driver.get("https://www.rightmove.co.uk/property-for-sale/search.html?searchLocation=EN2%206SY&useLocationIdentifier=false&locationIdentifier=&buy=For+sale");
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//button[@class='optanon-allow-all accept-cookies-button']")).click();
        }
        By search_radius =By.xpath("//select[@id='radius']");
        By price_range_min = By.id("minPrice");
        By price_range_max = By.id("maxPrice");
        By num_bedrooms_min = By.id("minBedrooms");
        By num_bedrooms_max = By.id("maxBedrooms");
        By property_type = By.id("displayPropertyType");
        By add_to_site = By.id("maxDaysSinceAdded");
        By find_property = By.cssSelector("#submit");

    public void initializer() {
        BaseClass bs = new BaseClass();
    }
      // public void cleanUp() {
        //    driver.manage().deleteAllCookies();
        //

        public void searchRadius(){
            WebElement searchradius = driver.findElement(search_radius);
            selectOptionForDropDown(searchradius,"Within 5 miles");
        }

        public void priceRangeMin() {
            WebElement pricerangemin = driver.findElement(price_range_min);
            Select dropdown = new Select(pricerangemin);
            dropdown.selectByVisibleText("100,000");

            WebElement pricerangemax = driver.findElement(price_range_max);
            Select dropdown1 = new Select(pricerangemax);
            dropdown1.selectByValue("300,000");
        }

        public void NumOfBedrooms(){
            WebElement element = driver.findElement(num_bedrooms_min);
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText("2");

            WebElement element1 = driver.findElement(num_bedrooms_max);
            Select dropdown1 = new Select(element1);
            dropdown1.selectByValue("4");
        }

        public void PropertyType(){
            WebElement house = driver.findElement(property_type);
            Select dropdown = new Select(house);
            dropdown.selectByVisibleText("Houses");
        }

        public void addedToSite(){
            WebElement element = driver.findElement(add_to_site);
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText("Last 14 days");
        }

        public void findProperties(){
            WebElement element = driver.findElement(find_property);
            element.click();

        }
    }


