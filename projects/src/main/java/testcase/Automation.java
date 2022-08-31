package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.Contact;
import page.Homepage;
import page.MyOrders;
import page.Signin;

public class Automation {

		WebDriver driver=new ChromeDriver();
		WebDriverWait wait =new WebDriverWait(driver , 10);
		@Test(priority=1)
		public void method1() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver.get("http://automationpractice.com/index.php");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='login']")));
		System.out.println(driver.findElement(By.xpath("//a[@class='login']")).getText());
		}
		@Test(priority=2)
		public void method2() throws InterruptedException {
			Signin obj1=new Signin(driver);
			obj1.signinmethod();
			obj1.emailadding();
			Thread.sleep(3000);
			obj1.creatingaccount();
            obj1.dateofbirth();
            obj1.address();
          }
		@Test(priority=3)
		public void method3() throws InterruptedException {
			Thread.sleep(5000);
			boolean value=driver.findElement(By.xpath("//span[contains(text(),'venkat kanchiraju')]")).isDisplayed();
		Assert.assertEquals(value, true);
		System.out.println("im rest of code");
		}
		@Test(priority=4)
		public void method4() throws InterruptedException {
			Thread.sleep(3000);
		Homepage obj2=new Homepage(driver);
	obj2.products();
	obj2.quantitysize();
		obj2.assertion();
		}
		@Test(priority=5)
		public void method5() throws InterruptedException {
			Thread.sleep(3000);
			Contact obj3=new Contact(driver);
			obj3.contactmethod();
			obj3.assertion();
		}
		@Test(priority=6)
		public void method6() throws InterruptedException {
			Thread.sleep(3000);
		MyOrders obj4=new MyOrders(driver);
		obj4.myorders();
		
}
}