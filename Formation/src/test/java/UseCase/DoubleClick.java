package UseCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		WebElement bouton, boutonR,boutonC;
		bouton=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		//boutonR=driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		
		//Action
		Actions action =new Actions(driver);
		action.doubleClick(bouton).perform();
		//action.contextClick(boutonR).perform();
		
		WebElement text, textR;
		//textR=driver.findElement(By.xpath("//*[@id=\"rightClickMessage\"]"));
		
		text=driver.findElement(By.xpath("//*[@id=\"doubleClickMessage\"]"));
	  
		
		
		String message;
		//String messageR;
		
		message=text.getText();
		//messageR=textR.getText();
		
		//Assert.assertEquals("You have done a right click", messageR);
		Assert.assertEquals("You have done a double click", message);
		System.out.println("TESTOK");
	

}
}
