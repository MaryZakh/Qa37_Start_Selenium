import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {

    WebDriver wd;

    @BeforeClass
    public void preConditions() {
        wd = new ChromeDriver();//open browser
        //wd.navigate().to("");//open site
        wd.get("");
    }

    @Test
    public void loginSuccess() {
        //open form (find element +click)
        //fill email(find element + click + clear + type)
        //fill pass(find element + click + clear + type)
        //submit form (find element +click)
    }

    @Test
    public void loginWrongEmail() {
        //open form (find element +click)
        //fill email(find element + click + clear + type)
        //fill pass(find element + click + clear + type)
        //submit form (find element +click)
    }

    @Test
    public void loginWrongPass() {
        //open form (find element +click)
        //fill email(find element + click + clear + type)
        //fill pass(find element + click + clear + type)
        //submit form (find element +click)
    }

    @AfterClass
    public void postCondition() {
        wd.close();//close browser
    }
}
