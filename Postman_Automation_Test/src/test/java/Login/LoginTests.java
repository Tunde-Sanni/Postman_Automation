package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import selenium Driver

    private WebDriver driver;
    //import ChromeDriver
    public void setUp()throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //input project URL =postman URL
        driver.get("https://identity.getpostman.com/login");

        //waiting for globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //maximize the window
        driver.manage().window().maximize();

        //get project title
        System.out.println(driver.getTitle());

        //Locate username fields
        driver.findElement(By.name("username")).sendKeys("synosureenterprise2020@gmail.com");
        //locate password fields
        driver.findElement(By.name("password")).sendKeys("SEXXY007");

        // Click on the login button
        driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]")).click();

        Thread.sleep(3000);

        //close Browser after test
        driver.quit();
    }
     //initiate the test run command

        public static void main(String args[]) throws InterruptedException {
            LoginTests test = new LoginTests();
            test.setUp();




    }


}
