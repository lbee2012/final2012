package org.example;

import org.junit.jupiter.api.Assertions.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumTest {
    public static WebDriver driver;
    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    void addToCart() throws InterruptedException {
        driver.get("https://vitimex.com.vn/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div/div[2]/nav/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[1]/div[6]/div/div/div/div[1]/div/div[3]/div/div[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div/div[2]/div[2]/div[3]/div/div[2]/div[2]/div[4]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div[1]/div/div/div[2]/div[2]/div[5]/div[2]/button")).click();
        Thread.sleep(2000);
        String expectedUrl = "https://vitimex.com.vn/products/atr5029";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
