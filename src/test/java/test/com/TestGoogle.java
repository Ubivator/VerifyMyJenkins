
package test.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestGoogle {
    private WebDriver driver;
    public TestGoogle() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sviatik\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestGit() {
        driver = new ChromeDriver();
    driver.get("https:\\www.google.com");
    WebElement homeGoogle = driver.findElement(By.name("q"));
    homeGoogle.sendKeys("steven lavrynovych");
    homeGoogle.submit();
    String name = driver.getTitle();
        System.out.println("this the title >>>>>>>>> " + name + " <<<<<<<");
        WebElement linkSv = driver.findElement(By.linkText("Sviatoslav Lavrynovych - QA Tester - uTest | LinkedIn"));
    Assert.assertEquals(name, "steven lavrynovych - Google Search");
    
    Assert.assertTrue(linkSv.isDisplayed());

    
    //my chenge to verify

       /// Assert.assertTrue(linkSv.isDisplayed());

    }
    @Test
    public void TestGit1() {
        driver = new ChromeDriver();
    driver.get("https:\\www.google.com");
    WebElement homeGoogle = driver.findElement(By.name("q"));
    homeGoogle.sendKeys("steven lavrynovych");
    homeGoogle.submit();
    String name = driver.getTitle();
        System.out.println("this the title >>>>>>>>> " + name + " <<<<<<<");
        WebElement linkSv = driver.findElement(By.linkText("Sviatoslav Lavrynovych - QA Tester - uTest | LinkedIn"));
    Assert.assertEquals(name, "steven lavrynovych - Google Search");
    
    Assert.assertFalse(linkSv.isDisplayed());

    
    //my chenge to verify

       /// Assert.assertTrue(linkSv.isDisplayed());

    }
  
}
