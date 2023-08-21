package expcucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentification {
	WebDriver driver;
 
	@Given("ouvrir navigateur")
	public void ouvrir_navigateur() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("ouvrir url")
	public void ouvrir_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("saisir user name")
	public void saisir_user_name() {
		WebElement user;
		user=driver.findElement(By.name("username"));
		user.sendKeys("Admin");;
	    
	}

	@When("saisir mdp")
	public void saisir_mdp() {
		WebElement mdp;
		mdp=driver.findElement(By.name("password"));
	   mdp.sendKeys("admin123");
	}

	@When("cliquer sur le boutton Login")
	public void cliquer_sur_le_boutton_login() {
		WebElement boutton;
		boutton=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	    boutton.click();
	}

	@Then("vérifier le nom de profil")
	public void vérifier_le_nom_de_profil() {
		
		WebElement profil;
		profil=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		String Text;
		Text=profil.getText();
		Assert.assertEquals("Paul Collings", Text);
		System.out.println("test ok");
	}

	
	
}
