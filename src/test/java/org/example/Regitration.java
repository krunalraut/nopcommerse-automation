package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Regitration {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("krunal");
        driver.findElement(By.cssSelector("input#LastName")).sendKeys("Raut");
        //String pagetext=driver.findElement(By.partialLinkText("Your Personal Details")).getText();
        String pagetext=driver.findElement(By.xpath("//div[@class=\"master-wrapper-content\"]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/strong")).getText();
        System.out.println(pagetext);
       // driver.quit();

    }
}
