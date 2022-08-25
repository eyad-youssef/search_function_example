import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class Setup {

    private WebDriver d ;
    protected HomePage homepage ;


@BeforeClass
  public void setup(){
    WebDriverManager.chromedriver().setup();

//      System.setProperty("webdriver.chrome.driver",
//              "C:\\Users\\20114\\OneDrive\\Documents\\TestingSearchFunction\\resources\\chromedriver.exe");

            d =new ChromeDriver();
            gohome();
            d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            homepage= new HomePage(d);


  }
   @BeforeMethod
    public void gohome(){ d.get("http://automationpractice.com/");}

    @AfterClass
    public void  end(){ d.quit();}


}
