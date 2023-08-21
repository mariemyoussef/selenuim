package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoseOver {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/menu");
     WebElement Mainitem2;
     
     Mainitem2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
     Actions action=new Actions(driver);
     action.moveToElement(Mainitem2).perform();
     
     

	}

}
