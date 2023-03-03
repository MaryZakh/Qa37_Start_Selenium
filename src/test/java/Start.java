import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void start() {
        wd = new ChromeDriver();
       // wd.get("https:/google.com");without history
        wd.navigate().to("https:/google.com");//with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();//only one tub if tub only one & close browser
        wd.quit();//all tabs & close browser
    }
}
