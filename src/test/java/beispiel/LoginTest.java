package beispiel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-138.0.7204.92\\chromedriver.exe");

        ChromeOptions optionsChrome = new ChromeOptions();
        optionsChrome.addArguments("start-maximized");
        optionsChrome.addArguments("lang=pt-BR");
        optionsChrome.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors,--web-security=false,--ssl-protocol=any,--ignore-ssl-errors=true"));
        optionsChrome.setHeadless(false);
        driver = new ChromeDriver(optionsChrome);
    }


    @Test
    public void testGoogleStartseite() {
        driver.get("https://www.google.com");
        assertTrue(driver.getTitle().contains("GoogleASDASD"));
    }

//    @Test
//    public void shouldOpen() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        assertTrue(loginPage.isLoaded());
//    }
//
//    @Test//T1
//    public void canNotLoginWithInvalidPassword() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        assertTrue(loginPage.isLoaded());
//        loginPage.login("gabdimitrievski111@gmail.com", "wrong_password_test");
//        String errorMessage = loginPage.getErrorMessage();
//        assertEquals(errorMessage, "The password you’ve entered is incorrect. Forgot Password?");
//
//    }
//    @Test//T2
//    public void canNotLoginWithoutUserName() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        assertTrue(loginPage.isLoaded());
//        loginPage.login("", "");
//        String errorMessage = loginPage.getErrorMessage();
//        assertEquals(errorMessage, "The email or mobile number you entered isn’t connected to an account. Find your account and log in.");
//
//    }
//
//    @Test//T3
//    public void shouldLogin() throws InterruptedException {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
//        assertTrue(loginPage.isLoaded());
//        loginPage.login("gabdimitrievski111@gmail.com", "correct_password");
//        assertTrue(new HomePage(driver).isLoaded());
//    }


//    private WebDriver getDriver() {
////        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gabri\\Desktop\\Intellij Homeworks\\SeleniumAutomaticTesting\\src\\main\\resources\\drivers\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-138.0.7204.92\\chromedriver.exe");
//
////        WebDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
