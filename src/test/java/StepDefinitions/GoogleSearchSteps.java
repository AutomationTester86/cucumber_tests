package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSearchSteps {

    WebDriver driver=null;
    @Given("browser is open")
    public void browser_is_open() {

        String projectPath=System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/java/resources/drivers/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("User is on google search page");
        driver.navigate().to("http://www.google.pl");
//        driver.switchTo().frame(driver.findElement(By.id("CXQnmb")));
        driver.findElement(By.xpath("//div[@class=\"VDity\"]/button[@id=\"L2AGLb\"]")).click();
    }
    @When("user enters a text in search box")
    public void user_enters_a_text_in_seach_box() {
        System.out.println("User enters text to search box");
        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
    }
    @And("hits enter")
    public void hits_enter() {
        System.out.println("Inside Step - hits Enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("InsideSteps - User is navigated to search results");
        driver.getPageSource().contains("Automation Step by Step");
    driver.close();
    driver.quit();
    }

}
