package com.zs.assignment9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FireFox {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.gecko.driver", "src/main/java/com/zs/assignment9/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http:naukri.com");
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.className("Login"));
        loginButton.click();
        Thread.sleep(8000);
        WebElement email = driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']"));
        email.sendKeys("raveenanalla01@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Enter your password\"]"));
        password.sendKeys("raveenanaukri01@");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//div[@title='Nalla Raveena']")).click();
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("i[title='Click here to download your resume']")).click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.quit();
    }
}
