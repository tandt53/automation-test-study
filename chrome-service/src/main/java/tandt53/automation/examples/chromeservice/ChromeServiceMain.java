package tandt53.automation.examples.chromeservice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChromeServiceMain {

    public static void main(String[] args) throws IOException {

        String chromeDriverFilePath = "chromedriver";
//        System.setProperty("webdriver.chrome.driver", chromeDriverFilePath);
//        WebDriver driver = new ChromeDriver();

        ChromeDriverService.Builder builder = new ChromeDriverService.Builder();
        builder.usingPort(5353);
        builder.usingDriverExecutable(new File("chromedriver"));
        ChromeDriverService service = builder.build();
        service.start();
        WebDriver driver = new ChromeDriver(service);

        driver.get("https://google.com.vn");
        WebElement searchField = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
        searchField.sendKeys("tandt53");
        searchField.submit();

        WebElement result = driver.findElement(By.id("result-stats"));
        System.out.println("Total result = " + result.getText());

        driver.quit();
        service.stop();
    }
}
