package com.zs.assignment9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/java/com/zs/assignment2/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http:naukri.com");
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com");
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']"));
        email.sendKeys("raveenanalla01@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Enter your password\"]"));
        password.sendKeys("raveenanaukri01@");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//div[@title='Nalla Raveena']")).click();
        Thread.sleep(8000);
        String path = "src/main/java/com/zs/assignment9/resume/RAVEENA__RESUME.pdf";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        driver.findElement(By.cssSelector("input[id='attachCV']")).sendKeys(absolutePath);
       // driver.quit();
    }
}
