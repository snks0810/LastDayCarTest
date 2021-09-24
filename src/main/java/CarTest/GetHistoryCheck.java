package CarTest;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class GetHistoryCheck {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void getHistoryCheck() {
    driver.get("https://cartaxcheck.co.uk/");
    driver.manage().window().setSize(new Dimension(1160, 702));
    driver.findElement(By.id("vrm-input")).click();
    driver.findElement(By.id("vrm-input")).sendKeys("DN09HRM");
    driver.findElement(By.cssSelector(".jsx-1164392954")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".jsx-1164392954"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".lds-ellipsis"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    js.executeScript("window.scrollTo(0,352)");
    js.executeScript("window.scrollTo(0,1085)");
    driver.findElement(By.linkText("Get a History Check")).click();
  }
}
