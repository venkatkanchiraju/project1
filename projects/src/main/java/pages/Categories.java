package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Categories {
	WebDriver driver;
	public Categories(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@id='itemc'])[1]")
	WebElement phones;
	@FindBy(xpath="(//div//h4//a[@class=\"hrefch\"])[1]")
	WebElement samsung;
	@FindBy(xpath="//a[@onclick=\"addToCart(1)\"]")
	WebElement addtocart1;
	@FindBy(xpath="(//a[@class='nav-link'])[1]")
	WebElement Home;
	@FindBy(xpath="(//a[@class=\"hrefch\"])[2]")
	WebElement lumia ;
	@FindBy(xpath="//a[@onclick=\"addToCart(2)\"]")
	WebElement addtocart2;
	@FindBy(xpath="(//a[@class='nav-link'])[4]")
	WebElement cart;
public void products() throws InterruptedException {
	WebDriverWait wait= new WebDriverWait(driver, 10);
	
	Thread.sleep(3000);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='itemc'])[1]")));
	phones.click();
	Thread.sleep(2000);
	samsung.click();
	Thread.sleep(2000);
	List<String> list1=new ArrayList<String>();
	list1.add(driver.findElement(By.xpath("//h2[@class=\"name\"]")).getText());
	List<String> list2=new ArrayList<String>();
	list2.add(driver.findElement(By.xpath("//h3[@class=\"price-container\"]")).getText());
	addtocart1.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	Home.click();
	Thread.sleep(3000);
	lumia.click();
	Thread.sleep(3000);
	list1.add(driver.findElement(By.xpath("//h2[@class=\"name\"]")).getText());
	list2.add(driver.findElement(By.xpath("//div//h3")).getText());
	addtocart2.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	Home.click();
	Thread.sleep(2000);
	cart.click();
	for(String list:list1) {
		System.out.println(list);
	}
	for(String lists:list2) {
		System.out.println(lists);
	}
	System.out.println(list1.contains(driver.findElement(By.xpath("(//td)[2]")).getText()));
	
	System.out.println(list2.contains(driver.findElement(By.xpath("(//td)[3]")).getText()));
}
	public void assertion3() throws InterruptedException {
//		SoftAssert assert3=new SoftAssert();
//		String val=driver.findElement(By.xpath(""))
//assertion.assertAll();
		System.out.println("im assertion");
		Home.click();
		Thread.sleep(3000);
}

}
