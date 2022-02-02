package com.raveena.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/raveena/Desktop/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get("http://google.com");
        WebElement searchElement = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
        searchElement.sendKeys("python pdf");
        Thread.sleep(3000);
        searchElement.submit();
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"yuRUbf\"]"));
        Map<String,String>map=new HashMap<>();
        for (WebElement element : elements) {
            String title = element.findElement(By.tagName("a")).findElement(By.tagName("h3")).getText();
            String url = element.findElement(By.tagName("a")).getAttribute("href");
            if (!title.equals("")) {
                map.put(title,url);
            }
        }
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }
    }
}

