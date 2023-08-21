package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDropp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demoqa.com/droppable");
		Thread.sleep(5000);
		
		WebElement Drag, Drop;
		Drag= driver.findElement(By.id("draggable"));
		Drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(Drag, Drop).perform();
		Thread.sleep(5000);
		
		WebElement message;
		message=driver.findElement(By.id("droppable"));
		String text;
		text=message.getText();
		Assert.assertEquals("Dropped!", text);
		System.out.println("test ok");
		
	}

}
