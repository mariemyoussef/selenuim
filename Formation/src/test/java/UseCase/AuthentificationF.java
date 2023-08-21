package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AuthentificationF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement bouton, Fristname,name,email, confirmation,mdp,Day,Month,Year,Genre,boutton;
		bouton=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		bouton.click();
		Fristname=driver.findElement(By.name("firstname"));
		Fristname.sendKeys("Elaa");
		name=driver.findElement(By.name("lastname"));
		name.sendKeys("landari");
		email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("mariemyoussef@hotmail.fr");
		confirmation=driver.findElement(By.name("reg_email_confirmation__"));
		mdp=driver.findElement(By.name("reg_passwd__"));
		mdp.sendKeys("12345");
		Actions action=new Actions(driver);
		action.keyDown(email, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
        action.keyUp(confirmation,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		Day=driver.findElement(By.name("birthday_day"));
		Select select=new Select(Day);
		select.selectByValue("20");
		Month=driver.findElement(By.name("birthday_month"));
		Select select2=new Select(Month);
		select2.selectByVisibleText("sep");
		Year=driver.findElement(By.name("birthday_year"));
		Select select3=new Select(Year);
		select3.selectByValue("1982");
		
		Genre=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		Genre.click();
		
		boutton=driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		boutton.click();
				
		System.out.println("Test Ok");
		
		
		
	
	}

}
