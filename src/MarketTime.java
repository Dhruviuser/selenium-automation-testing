import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MarketTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://apps.markettimeqa.com/");
		
		driver.findElement(By.id("username")).sendKeys("priyank5");
		driver.findElement(By.id("password")).sendKeys("Dhruvank_3300");
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//tr[@class='ui-selectable-row ng-star-inserted'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-right ui-clickable fas fa-sign-in-alt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@href,'#')])[10]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" (//a[@href='/repgroups/new-orders'])[1]")).click();
	//	driver.findElement(By.xpath("(//input[contains(@placeholder,'Search')])[1]")).sendKeys("DhruviUser18");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='3'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//tr[contains(@class,'ui-selectable-row ng-star-inserted')])[4]")).click();
		driver.findElement(By.xpath("(//span[normalize-space()='Line Item Order'])[1]")).click();
		
		//WebElement staticDropdown = driver.findElement(By.xpath("(//rtcustom-dropdown[contains(@class,'manufacturer-drop ng-tns-c74-649 ng-pristine ng-valid ng-touched')])[1]")).click();
		//Select dropdown = new Select(staticDropdown);
		//dropdown.deselectByIndex(24); // test again
	
		driver.findElement(By.xpath("(//li[contains(@aria-label,'Sara')])[1]")).click();
		
	}

}
