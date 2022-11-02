package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class EmailAFriend {

    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // maximize web page
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);
        driver.get("https://demo.nopcommerce.com/");
        // xpath locators
        driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"email-a-friend\"]/button")).click();


        driver.findElement(By.id("FriendEmail")).sendKeys("mast122"+timeStamp+"@gmail.com"); //  id locator
        driver.findElement(By.id("YourEmailAddress")).sendKeys("mast12"+timeStamp+"@gmail.com"); // id locator
        driver.findElement(By.name("PersonalMessage")).sendKeys("Great Feature"); // name locator
        driver.findElement(By.name("send-email")).click();  // name locator
        String regMsg = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();
        System.out.println(); // for space
        System.out.println(regMsg); // print message in console

        driver.close();

    }
}
