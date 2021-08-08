package tandt53.automation.examples.chromeservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initial {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.vn");

        WebElement searchField = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
        searchField.sendKeys("tandt53");
        searchField.submit();

        WebElement result = driver.findElement(By.id("result-stats"));
        System.out.println("Total result = " + result.getText());

        driver.quit();
    }
}
