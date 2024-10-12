import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.Test

import com.kms.katalon.core.webui.driver.DriverFactory

import groovy.console.ui.SystemOutputInterceptor

System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath())
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://www.google.co.in");
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@id='SIvCob']/a[5]")).click();
driver.findElement(By.xpath("//div[@id='SIvCob']/a")).click();
driver.quit();