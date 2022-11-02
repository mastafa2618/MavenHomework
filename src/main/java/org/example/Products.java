package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products {

    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // maximize webpage
        driver.get("https://demo.nopcommerce.com/");
        // xpath locator
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a[@href=\"/computers\"]")).click();
        driver.findElement(By.xpath("//h2[@class=\"title\"]/a[@title=\"Show products in category Desktops\"]")).click();
        String regMsg = driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]")).getText();
        String regMs1 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();
        String regMsg2 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();
        System.out.println(); // for space in console
        System.out.println(regMsg); // to print message in console
        System.out.println(regMs1);
        System.out.println(regMsg2);

        driver.close();
    }
}
