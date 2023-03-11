import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        wd = new ChromeDriver(options);
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {
        // by tag name
        WebElement el = wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));
        WebElement xElement = wd.findElement(By.xpath("//button"));

        WebElement el1 = wd.findElement(By.tagName("body"));
        WebElement element1 = wd.findElement(By.cssSelector("body"));
        WebElement el1_1 = wd.findElement(By.xpath("//body"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement element2 = wd.findElement(By.cssSelector("div"));
        WebElement el2_2 = wd.findElement(By.xpath("//div[@id='root']"));

        WebElement el3 = wd.findElement(By.tagName("h1"));
        WebElement element3 = wd.findElement(By.cssSelector("h1"));
        WebElement element3_1 = wd.findElement(By.xpath("//h1"));
        WebElement el4 = wd.findElement(By.tagName("a"));
        WebElement element4 = wd.findElement(By.cssSelector("a"));
        WebElement element4_1 = wd.findElement(By.xpath("//a[text()='HOME']"));
        WebElement element4_2 = wd.findElement(By.xpath("//a[text()='ABOUT']"));
        WebElement element4_3 = wd.findElement(By.xpath("//a[@class='active']"));


        WebElement el5 = wd.findElement(By.tagName("form"));
        WebElement element5 = wd.findElement(By.cssSelector("form"));
        WebElement element5_1 = wd.findElement(By.xpath("//form"));

        WebElement el6 = wd.findElement(By.tagName("input"));
        WebElement element6 = wd.findElement(By.cssSelector("input"));
        WebElement element6_1 = wd.findElement(By.xpath("//input[2]"));
        WebElement element6_2 = wd.findElement(By.xpath("//input[@placeholder='Password']"));

        // by class
        WebElement element7 = wd.findElement(By.className("container"));
        WebElement element8 = wd.findElement(By.cssSelector(".container"));
        WebElement element8_1 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement element9 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement element10 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement element10_1 = wd.findElement(By.xpath("//*[@class = 'navbar-component_nav__1X_4m']"));

        WebElement element11 = wd.findElement(By.className("active"));
        WebElement element12 = wd.findElement(By.cssSelector(".active"));
        WebElement el15 = wd.findElement(By.xpath("//*[@class='active']"));

        //By id

        WebElement element13 = wd.findElement(By.id("root"));
        WebElement element14 = wd.findElement(By.cssSelector("#root"));
        WebElement element14_1 = wd.findElement(By.xpath("//*[@id = 'root']"));

        // by attribute
        WebElement element15 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement element14_2 = wd.findElement(By.xpath("//*[@id = 'root']"));

        WebElement element16 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement element16_1 = wd.findElement(By.xpath("//*[@href='/home']"));
        WebElement element17 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement element18 = wd.findElement(By.name("email"));
        WebElement element18_1 = wd.findElement(By.xpath("//*[@name='email']"));


        // one of elements find by attribute ==> start & end & contains value
        WebElement element19 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el9 = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        //Start
        WebElement element20 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement el10 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));


        WebElement element21 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement element21_1 = wd.findElement(By.xpath("//*[contains(@placeholder, 'il')]"));
        // contains
        WebElement element22 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement el22_1 = wd.findElement(By.xpath("//input[contains(@placeholder,'ma')]"));
        WebElement el22_2 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));
        wd.findElement(By.xpath("//a[3]"));

    }
}