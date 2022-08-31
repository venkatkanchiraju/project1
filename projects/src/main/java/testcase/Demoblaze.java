package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.Categories;
import pages.Categories2;
import pages.DemoHome;
import pages.Loginpage;
import pages.Mycart;

public class Demoblaze {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait =new WebDriverWait(driver , 10);
	@Test(priority=1)
	public void method1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://www.demoblaze.com/");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Home')]")));
	}
	@Test(priority=2)
	public void method2() throws InterruptedException{
		DemoHome obj=new DemoHome(driver);
		obj.assertionmethod();
		obj.signup();
		obj.alertbox();
	}

	@Test(priority=3)
	public void method3() throws InterruptedException {
		Loginpage obj1=new Loginpage(driver);
		obj1.login();
		obj1.assertion2();
	}

	@Test(priority=4)
	public void method4() throws InterruptedException {
		Categories obj2=new Categories(driver);
		obj2.products();
		obj2.assertion3();
	}
	@Test(priority=5)
	public void method5() throws InterruptedException {
		Categories2 obj3=new Categories2(driver);
		obj3.laptops();
		//obj3.assertion3();
	}
		@Test(priority=6)
		public void method6() throws InterruptedException {
			Mycart obj4=new Mycart(driver);
			obj4.purchase();
	}
}
