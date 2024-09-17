package com.globant.academy.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverSetup {
    
    private final WebDriver driver;
    
    public DriverSetup(String browser) {
        driver = browser.equalsIgnoreCase("firefox") ? new FirefoxDriver() : setUpChrome();
    }
    
    public WebDriver getDriver() {
        return driver;
    }
    
    public ChromeDriver setUpChrome() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chromeOptions);
    }
}
