package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
//    /html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]
//    public static final String XPATH_COOKIES = "//div[contains(@class,\"selected_51sy\") and contains(@data-cookiebanner,\"accept_button\")/button[2]";
//    public static final String XPATH_COOKIES = "//div[contains(@class,\"_90-r\")/button[2]";
//    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[contains(@class, \"selected_51sy\")]/div[9]/form/div";//    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span[2]/select[1]";
//    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span[2]/select[2]";
//    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span[2]/select[3]";
    public static final String XPATH_COOKIES = "//*[@data-testid='cookie-policy-dialog-accept-button']";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//*[@data-testid='open-registration-form-button']";
    public static final String XPATH_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement cookies = driver.findElement(By.xpath(XPATH_COOKIES));
        cookies.click();

        WebElement createNewAccount = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        createNewAccount.click();
        Thread.sleep(10*100);
        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());
        WebElement birthdayDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(birthdayDay);
        selectDay.selectByIndex(12);

        while (!driver.findElement(By.xpath(XPATH_MONTH)).isDisplayed());
        WebElement birthdayMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(birthdayMonth);
        selectMonth.selectByIndex(4);

        while (!driver.findElement(By.xpath(XPATH_YEAR)).isDisplayed()) ;
        WebElement birthdayYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(birthdayYear);
        selectYear.selectByIndex(36);
    }
}
