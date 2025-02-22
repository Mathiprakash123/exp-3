import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "/home/mathiprakash/testing/tesing projects/exp-3/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        driver.manage().window().maximize();
        WebElement firstname = driver.findElement(By.name("firstname"));
        WebElement lastname = driver.findElement(By.name("lastname"));
        WebElement mobileno = driver.findElement(By.name("reg_email__"));
        WebElement password = driver.findElement(By.name("reg_passwd__"));
        WebElement Date = driver.findElement(By.name("birthday_day"));
        WebElement month = driver.findElement(By.name("birthday_month"));
        WebElement year = driver.findElement(By.name("birthday_year"));
        WebElement gender = driver.findElement(By.xpath("//input[@value='-1']"));
        WebElement pronoun = driver.findElement(By.name("preferred_pronoun"));
        WebElement submit = driver.findElement(By.name("websubmit"));
        firstname.sendKeys("dhanushree");
        lastname.sendKeys("S");
        mobileno.sendKeys("7967888989");
        password.sendKeys("dhanu@2004");
        Date.sendKeys("20");
        month.sendKeys("oct");
        year.sendKeys("2004");
        if (!gender.isSelected()) {
            gender.click();
        }
        Select pronouns = new Select(pronoun);
        pronouns.selectByVisibleText("She: \"Wish her a happy birthday!\"");
        submit.click();
        Thread.sleep(10000000);
        driver.quit();
    }
}