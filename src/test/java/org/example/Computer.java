package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Computer {
   static  WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//ul[@class=\"list\"]/li[1]/ul[1]/li[1]/a[1]")).click();
        String text=driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/h2[1]/a[1]")).getText();
        System.out.println(text);
    }
}
