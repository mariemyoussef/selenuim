package UseCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PremierCas {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.manage().window().maximize();
		//Driver.get("https://www.google.com");
		//Driver.get("https://www.facebook.com/");
		Driver.get("https://login.live.com");
		Driver.navigate().to("https://login.live.com");


	}

}
