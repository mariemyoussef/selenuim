package expcucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CréationFb {
	
	WebDriver driver;
	@Given("ouvrir le navig")
	public void ouvrir_le_navig() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	   
	}

	@Given("taper URl {string}")
	public void taper_u_rl(String string) {
		driver.get(string);
	}
	    
	@When("cliquer sur le boutton")
	public void cliquer_sur_le_boutton() {
	   WebElement boutton;
	   boutton=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
	   boutton.click();
	}

	@When("saisir Firstname {string}")
	public void saisir_firstname(String string) {
	   WebElement   Firstname;
	   Firstname=driver.findElement(By.name("firstname"));
	   Firstname.sendKeys(string);

	}

	@When("saisir lastname {string}")
	public void saisir_lastname(String string) {
		WebElement lastname;
		lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys(string);
	    	}

	@When("saisir email {string}")
	public void saisir_email(String string) {
	   WebElement email;
	   email=driver.findElement(By.name("reg_email__"));
	   email.sendKeys(string);
	}

	@When("confirmer {string}")
	public void confirmer(String string) {
	   WebElement confirmation;
	   confirmation=driver.findElement(By.name("reg_email_confirmation__"));
	   confirmation.sendKeys(string);
	  
	}

	@When("saisir mdp {string}")
	public void saisir_mdp(String string) {
	    WebElement mdp;
	    mdp=driver.findElement(By.name("reg_passwd__"));
	    mdp.sendKeys(string);
	}

	@When("selectionner day {string}")
	public void selectionner_day(String string) {
	    WebElement day;
	    day=driver.findElement(By.name("birthday_day"));
	    Select select= new Select(day);
	    select.selectByValue(string);
	}

	@When("selectionner month {string}")
	public void selectionner_month(String string) {
	    WebElement month;
	    month=driver.findElement(By.name("birthday_month"));
	    Select select1=new Select(month);
	    select1.selectByVisibleText(string);
	}

	@When("selectionner year {string}")
	public void selectionner_year(String string) {
	   WebElement year;
	   year=driver.findElement(By.name("birthday_year"));
	   Select select3=new Select(year);
		select3.selectByValue("1982");
	}

	@When("seletionner genre {string}")
	public void seletionner_genre(String string) {
	    WebElement genre;
	    genre=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
	    genre.click();
	}

	@When("cliquer sur inscrir")
	public void cliquer_sur_inscrir() {
	   WebElement inscrir;
	   inscrir=driver.findElement(By.xpath("//button[@name='websubmit']"));
	   inscrir.click();
	}
	   
	@Then("vérifier la création de compte par l'affichage de mot {string}")
	public void vérifier_la_création_de_compte_par_l_affichage_de_mot(String string) {
	    System.out.println(string);
	}

}
