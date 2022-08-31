package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categories2 {
	WebDriver driver;
	public Categories2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@id='itemc'])[2]")
	WebElement laptops;
	@FindBy(xpath="(//div//h4)[1]")
	WebElement sony;
	@FindBy(xpath="//a[@onclick='addToCart(8)']")
	WebElement addtocart3;
	@FindBy(xpath="(//a[@class=\"nav-link\"])[1]")
	WebElement Home;
	@FindBy(xpath="(//a[@class=\"nav-link\"])[4]")
	WebElement cart;
	public void laptops() throws InterruptedException {
		laptops.click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		sony.click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		addtocart3.click();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Home.click();
	//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(3000);
		cart.click();
	}
	
}
