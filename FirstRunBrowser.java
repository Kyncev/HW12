package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstRunBrowser extends BaseClass {

    public static void main(String[] args) {
    driver.get("https://ithillel.ua");
    driver.findElement(By.id("btn-consultation-hero")).click();
    driver.findElement(By.id("input-name-consultation")).sendKeys("Vitaly");
    driver.findElement(By.id("input-email-consultation")).sendKeys("r..gmail.com");
    driver.findElement(By.id("input-tel-consultation")).sendKeys("662834194");
    try {
        Thread.sleep(5000);

    } catch (InterruptedException e){
        e.printStackTrace();
    }
driver.quit();
    }
}
