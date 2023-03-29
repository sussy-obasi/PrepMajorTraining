package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class prepmajorRegpage {

    public prepmajorRegpage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[1]/div[1]/div/input")
    private WebElement usernameField;
    @FindBy(name = "email")
    private WebElement emailAddressField;
    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[2]/div[1]/div/input")
    private WebElement passwordField;
    @FindBy(name ="password_re" )
    private WebElement cornfirmPassword;
    @FindBy(name ="privacy_policy" )
    private WebElement termsOfUseCheckbox;
    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/form/div[4]/div/div/button")
    private WebElement registerBtn;
    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/div")
    private WebElement successMsg;



    public void enterUsername(){
        usernameField.sendKeys("Test1234");
    }

public void enterEmailAddress(){
        emailAddressField.sendKeys("test1234@test.com");




    }
    public void enterPassword(){
        passwordField.sendKeys("Password14");

    }
    public void enterConfirmPassword(){
        cornfirmPassword.sendKeys("Password14");
    }
    public void clickCheckbox(){
        termsOfUseCheckbox.click();
    }
    public void clickRegisterBtn(){
        registerBtn.click();
    }
    public boolean validateSuccessMsg(){
        boolean bannerMsg=successMsg.isDisplayed();
        return bannerMsg;
    }

    }

















