package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String XPATH_BIRTHDAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    private static final String XPATH_BIRTHMONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    private static final String XPATH_BIRTHYEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement comboDay = driver.findElement(By.xpath(XPATH_BIRTHDAY));
        Select selectDay = new Select(comboDay);
        selectDay.selectByValue("2");

        WebElement comboMonth = driver.findElement(By.xpath(XPATH_BIRTHMONTH));
        Select selectMonth = new Select(comboMonth);
        selectMonth.selectByValue("11");

        WebElement comboYear = driver.findElement(By.xpath(XPATH_BIRTHYEAR));
        Select selectYear = new Select(comboYear);
        selectYear.selectByValue("1905");
    }
}