package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RechercheGoole {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement Barre;
		Barre = driver.findElement(By.id("APjFqb"));
		// les actions
		Barre.sendKeys("Tunisie");
		Barre.sendKeys(Keys.ENTER);
		// Vérification
		WebElement Text;
		Text = driver.findElement(By.id("result-stats"));
		String Message;
		Message = Text.getText();
		//if (Message.contains("résultats")) {

			//System.out.println("test ok");
		//} else {
			//System.out.println("test ko");
		//}
		
		if (Message.contains("tunisie")) {

			System.out.println("test ok");
		} else {
			System.out.println("test ko");

	}
	}
}


