package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//div[contains(@class,\"selected_51sy\") and contains(@data-cookiebanner,\"accept_button\")/button[2]";
//    public static final String XPATH_COOKIES = "//div[contains(@class,\"_90-r\")/button[2]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[contains(@class, \"selected_51sy\")]/div[9]/form/div";
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span[2]/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span[2]/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span[2]/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");
        while(!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());
        WebElement cookies = driver.findElement(By.xpath(XPATH_COOKIES));
        cookies.submit();
        Select selectCookies = new Select(cookies);
//        selectCookies.selectByVisibleText("Akceptuj wszystkie");

        WebElement createNewAccount = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        Select selectAccount = new Select(createNewAccount);
        while(!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());
        WebElement birthdayDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(birthdayDay);
        selectDay.selectByIndex(12);

        while(!driver.findElement(By.xpath(XPATH_MONTH)).isDisplayed());
        WebElement birthdayMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(birthdayMonth);
        selectMonth.selectByIndex(4);

        while(!driver.findElement(By.xpath(XPATH_YEAR)).isDisplayed());
        WebElement birthdayYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(birthdayYear);
        selectYear.deselectByValue("1985");
    }
}
