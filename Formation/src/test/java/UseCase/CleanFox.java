package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CleanFox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cleanfox.io/");
		WebElement email, connexion;
		email=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/main/article[1]/div/div/div/input"));
		connexion=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/main/article[1]/div/div/div/input"));
		email.sendKeys("mariemyoussef@hotmail.fr");
		connexion.click();
        System.out.println("test ok");
	}

}
