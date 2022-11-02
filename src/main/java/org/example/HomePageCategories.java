package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories {

    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize webpage
        driver.get("https://demo.nopcommerce.com/");
        // xpath locators have been used to find all the element
        String regMsg = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).getText();
        System.out.println(); // for space in console
        System.out.println(regMsg); // to print message in console
        String regMsg2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a")).getText();
        System.out.println(); // for space in console
        System.out.println(regMsg2);  // to print message in console
        String regMsg3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a")).getText();
        System.out.println(); // for space in console
        System.out.println(regMsg3); // to print message in console
        String regMsg4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[4]/a")).getText();
        System.out.println(); // for space in console
        System.out.println(regMsg4); // to print message in console

        String regMsg5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]/a")).getText();
        System.out.println(); // for space in console
        System.out.println(regMsg5); // to print message in console
        String regMsg6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[6]/a")).getText();
        System.out.println(); // for space in console
        System.out.println(regMsg6); // to print message in console
        String regMsg7 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/gift-cards\"]")).getText();
        System.out.println(); // for space in console
        System.out.println(regMsg7); // to print message in console



        driver .close();
    }
}
