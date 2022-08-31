package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Contact {
	WebDriver driver;
	public Contact(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@title='Contact Us']")
	WebElement contactus;
	@FindBy(xpath="//select[@id='id_contact']")
	WebElement subject;
	@FindBy(xpath="//select[@name='id_order']")
	WebElement orderreference ;
	@FindBy(xpath="//select[@name='id_product']")
	WebElement product;
	@FindBy(xpath="//textarea[@id='message']")
	WebElement message;
	@FindBy(xpath="//span[contains(text(),'Send')]")
	WebElement send;
	@FindBy(xpath="//span//i[@class='icon-chevron-left']")
	WebElement home;
	public void contactmethod() throws InterruptedException {
		Thread.sleep(3000);
		contactus.click();
		Thread.sleep(3000);
Select select1=new Select(subject);
select1.selectByValue("2");
Select select2=new Select(orderreference);
Thread.sleep(2000);
select2.selectByIndex(1);
Select select3=new Select(product);
select3.selectByValue("1");
message.sendKeys("status of my order");
send.click();
Thread.sleep(3000);
	}
	public void assertion() throws InterruptedException {
		boolean value=driver.findElement(By.xpath("//p[contains(text(),'Your message has been successfully sent to our team.')]")).isDisplayed();
		Assert.assertEquals(value, true);
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Your message has been successfully sent to our team.')]")).getText());
		Thread.sleep(3000);
		home.click();
		}
	
	
	
	
	
	
	
	
}
