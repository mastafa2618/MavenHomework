package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments {

    protected static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize webpage
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("read-more")).click(); // className locator
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Mac Released"); // id locator
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("Great Feature!"); // id locator
        String regMsg = driver.findElement(By.xpath("//div[@class=\"buttons\"]/button")).getText(); //xpath
        //locator

        System.out.println(); // for space in console
        System.out.println(regMsg); // to print message in console
        driver.close();


    }
}
