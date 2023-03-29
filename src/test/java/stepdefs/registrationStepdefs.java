package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObject.prepmajorRegpage;

public class registrationStepdefs {
  public static WebDriver driver=null;
  public prepmajorRegpage prepmajorRegpage;
  public registrationStepdefs(){
      System.setProperty("webdriver.chrome.driver","C:\\Users\\sussa\\IdeaProjects\\PrepMajorTraining\\src\\test\\resources\\driver\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://qa.prepmajor.com/user-account/");
      prepmajorRegpage= new prepmajorRegpage(driver);
  }

    @Given("I navigate to the url")
    public void iNavigateToTheUrl() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sussa\\IdeaProjects\\PrepMajorTraining\\src\\test\\resources\\driver\\chromedriver.exe");
  //     driver=new ChromeDriver();
        driver.get("https://qa.prepmajor.com/user-account/");
        driver.manage().window().maximize();

    }

    @And("I enter username")
    public void iEnterUsername() {
//        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[1]/div[1]/div/input")).sendKeys("Test1234");
        prepmajorRegpage.enterUsername();
    }


    @And("I enter the email address")
    public void iEnterTheEmailAddress() {
//        driver.findElement(By.name("email")).sendKeys("test1234@test.com");
        prepmajorRegpage.enterEmailAddress();
    }


    @And("I enter the password")
    public void iEnterThePassword() {
//        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[2]/div[1]/div/input")).sendKeys("Password12");
        prepmajorRegpage.enterPassword();
    }

    @And("I enter the confirm password")
    public void iEnterTheConfirmPassword() {
//        driver.findElement(By.name("password_re")).sendKeys("Password12");
        prepmajorRegpage.enterConfirmPassword();
    }

    @And("I tick the term of use and privacy checkbox")
    public void iTickTheTermOfUseAndPrivacyCheckbox() {
//        driver.findElement(By.name("privacy_policy")).click();
        prepmajorRegpage.clickCheckbox();
    }

    @And("I click the register button")
    public void iClickTheRegisterButton() {
//        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[4]/div/div/button")).click();
        prepmajorRegpage.clickRegisterBtn();

    }

    @Then("I get a successful being displayed")
    public void iGetASuccessfulBeingDisplayed() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        Thread.sleep(5000);
        // assert equalls
//        String expectedMsg ="Please follow the instructions sent to your email address.";
//        String actualMsg=driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/div")).getText();
//        Assert.assertEquals(expectedMsg,actualMsg);

        // assert true
//       boolean successMsg= driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/div")).isDisplayed();
       Assert.assertTrue(prepmajorRegpage.validateSuccessMsg(),"Success Message is present on the webpage");

       driver.quit();
       //driver.close();



    }
}
