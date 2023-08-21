package UseCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		WebElement bouton, boutonR, bouttonC;
		//bouton = driver.findElement(By.id("doubleClickBtn"));
		//boutonR=driver.findElement(By.id("rightClickBtn"));
		bouttonC=driver.findElement(By.xpath("//@id=\"B1oeM\""));
		//Actions action=new Actions(driver);
	    //action.doubleClick(bouton).perform();
		//action.contextClick(boutonR).perform();
		//action.click(bouttonC).perform(); 
		bouttonC.click();
		//WebElement Message;
		//Message=driver.findElement(By.id("doubleClickMessage"));
		//String text;
		//text=Message.getText();
		//Assert.assertEquals("You have done a double click", text);
		//System.out.println("Testok");
		
		
		//WebElement RightMessage;
		//RightMessage=driver.findElement(By.id("rightClickMessage "));
		//String textR;
		//textR=RightMessage.getText();
		//Assert.assertEquals(" You have done a right click", textR);
		//System.out.println("Testok");
		
		WebElement MessageC;
		MessageC=driver.findElement(By.xpath(" //@id=\"dynamicClickMessage\""));
		String textC;
		textC=MessageC.getText();
		Assert.assertEquals("You have done a dynamic click", textC);
		System.out.println("Testok");
		
	
	}

}
