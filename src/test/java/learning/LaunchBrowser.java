package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
     //Chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sussa\\IdeaProjects\\PrepMajorTraining\\src\\test\\resources\\driver\\chromedriver.exe");
        //ChromeDriver driver =new ChromeDriver();
        WebDriver driver =new ChromeDriver();

    }

}
