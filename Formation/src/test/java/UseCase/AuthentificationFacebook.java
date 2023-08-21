package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AuthentificationFacebook {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement boutton,Firstname,name, email,confirmation, mdp, Inscrir,day,month,year,Genre;
		boutton=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		boutton.click();
		Firstname=driver.findElement(By.name("firstname"));
		name=driver.findElement(By.name("lastname"));
		email=driver.findElement(By.name("reg_email__"));
		confirmation=driver.findElement(By.name("reg_email_confirmation__"));
		mdp=driver.findElement(By.name("reg_passwd__"));
		day=driver.findElement(By.name("birthday_day"));
		month=driver.findElement(By.name("birthday_month"));
		year=driver.findElement(By.name("birthday_year"));
		Genre=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		Inscrir=driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		Firstname.sendKeys("Ali");
		name.sendKeys("Landari");
		email.sendKeys("mariemyoussef@hotmail.fr");
		// pour faire copier coller
		Actions action=new Actions(driver);
		action.keyDown(email, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(confirmation, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		mdp.sendKeys("1254fgh");
		// Select pour la liste deroulante
		Select select=new Select(day);
		select.selectByValue("19");
		
		Select select2=new Select(month);
		select2.selectByVisibleText("sep");
		 
		Select select3=new Select(year);
		select3.selectByValue("1982");
		Genre.click();
		
		Inscrir.click();
		
		
		System.out.println("Test OK");
	}

}
