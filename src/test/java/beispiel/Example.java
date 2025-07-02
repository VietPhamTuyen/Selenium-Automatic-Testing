//package beispiel;
//
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.Arrays;
//
//public class Example {
//
//    private WebDriver driver;
//
////    @BeforeEach
////    public void setup() {
////        // Pfad zum ChromeDriver falls nötig setzen
////        // System.setProperty("webdriver.chrome.driver", "/pfad/zu/chromedriver");
////        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-138.0.7204.92\\chromedriver.exe");
////
////        driver = new ChromeDriver();
////    }
//
//    @BeforeMethod
//    public void preCondition() {
//        // Pfad zum ChromeDriver falls nötig setzen
//        // System.setProperty("webdriver.chrome.driver", "/pfad/zu/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver-138.0.7204.92\\chromedriver.exe");
//
//        ChromeOptions optionsChrome = new ChromeOptions();
//        optionsChrome.addArguments("start-maximized");
//        optionsChrome.addArguments("lang=pt-BR");
//        optionsChrome.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors,--web-security=false,--ssl-protocol=any,--ignore-ssl-errors=true"));
//        optionsChrome.setHeadless(false);
//        driver = new ChromeDriver(optionsChrome);
//    }
//
//    @Test
//    public void testGoogleStartseite() {
//        driver.get("https://www.google.com");
//        assert driver.getTitle().contains("Google");
//    }
//    @Test
//    public void testGoogleStartseite2() {
//        driver.get("https://www.google.com");
//        assert driver.getTitle().contains("Google");
//    }
//    @Test
//    public void testGoogleStartseite3() {
//        driver.get("https://www.google.com");
//        assert driver.getTitle().contains("Google");
//    }
//
////    @AfterEach
////    public void teardown() {
////        if (driver != null) {
////            driver.quit();
////        }
////    }
//
//
//    @AfterMethod
//    public void postCondition(){
//        driver.quit();
//    }
//}