package CarTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class GetHistoryCheck {
  private WebDriver driver;
  private String webAddress;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  public void setUp() {
    webAddress = "https://cartaxcheck.co.uk/";
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  public void tearDown() {
    driver.quit();
  }

  public void getHistoryCheck(String input) {
    driver.get("https://cartaxcheck.co.uk/");
    driver.manage().window().setSize(new Dimension(1160, 702));
    driver.findElement(By.id("vrm-input")).click();
    driver.findElement(By.id("vrm-input")).sendKeys(input);
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
