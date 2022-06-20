package testPackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.log.Log;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import org.junit.jupiter.api.Test;

class SEProjectTest {
	
	private static WebDriver webDriver;
	private static String baseUrl;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		baseUrl="http://localhost:4200/login";
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nedim.bandzovic\\Desktop\\Selenium\\msedgedriver.exe");
		webDriver=new EdgeDriver();
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		webDriver.close();
	}

	/*@Test
	void LoginTest () throws InterruptedException{
		webDriver.manage().window().maximize();
		webDriver.get(baseUrl);
		Thread.sleep(2000);
		WebElement emailField=webDriver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > form > div.wrap-input100.validate-input.m-b-23 > input"));
		emailField.sendKeys("rixxjok@gmail.com");
		Thread.sleep(2000);
		WebElement passwordField=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[2]/input"));
		passwordField.sendKeys("sarajevo");
		Thread.sleep(2000);
		WebElement loginBtn=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(4000);
		assertEquals("http://localhost:4200/products", webDriver.getCurrentUrl());
	}*/
	/*@Test
	void LoginFailTest() throws InterruptedException{
		webDriver.manage().window().maximize();
		webDriver.get(baseUrl);
		Thread.sleep(2000);
		WebElement emailField=webDriver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > form > div.wrap-input100.validate-input.m-b-23 > input"));
		emailField.sendKeys("rixxtjok@gmail.com");
		Thread.sleep(2000);
		WebElement passwordField=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[2]/input"));
		passwordField.sendKeys("sarajetvo");
		Thread.sleep(2000);
		WebElement loginBtn=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(2000);
		WebElement errorMsg=webDriver.findElement(By.xpath("/html/body/div/div"));
		assertEquals(errorMsg.getText().toString(), "Wrong creditentials!");
		
	}*/
	/*@Test
	void addToCartTest() throws InterruptedException{
		webDriver.manage().window().maximize();
		webDriver.get(baseUrl);
		Thread.sleep(2000);
		WebElement emailField=webDriver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > form > div.wrap-input100.validate-input.m-b-23 > input"));
		emailField.sendKeys("rixxjok@gmail.com");
		Thread.sleep(2000);
		WebElement passwordField=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[2]/input"));
		passwordField.sendKeys("sarajevo");
		Thread.sleep(2000);
		WebElement loginBtn=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(3000);
		WebElement addBtn=webDriver.findElement(By.xpath("/html/body/app-root/app-product-list/div/div/div[2]/div/div[2]/div/div[3]/a[2]"));
		addBtn.click();
		Thread.sleep(2000);
		WebElement addCartNav=webDriver.findElement(By.xpath("/html/body/app-root/app-navigation/div/div/div[2]/nav/div/div[1]/a[2]"));
		addCartNav.click();
		Thread.sleep(2000);
		WebElement shirt_name=webDriver.findElement(By.xpath("/html/body/app-root/app-cart/div/div/div[1]/table/tbody/tr/td[1]"));
		assertEquals(shirt_name.getText().toString(), "duksa1");
	}*/
	/*@Test
	void removeFromCartTest() throws InterruptedException {
		webDriver.manage().window().maximize();
		webDriver.get(baseUrl);
		Thread.sleep(2000);
		WebElement emailField=webDriver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > form > div.wrap-input100.validate-input.m-b-23 > input"));
		emailField.sendKeys("rixxjok@gmail.com");
		Thread.sleep(2000);
		WebElement passwordField=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[2]/input"));
		passwordField.sendKeys("sarajevo");
		Thread.sleep(2000);
		WebElement loginBtn=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(3000);
		WebElement addBtn=webDriver.findElement(By.xpath("/html/body/app-root/app-product-list/div/div/div[2]/div/div[2]/div/div[3]/a[2]"));
		addBtn.click();
		Thread.sleep(2000);
		WebElement addCartNav=webDriver.findElement(By.xpath("/html/body/app-root/app-navigation/div/div/div[2]/nav/div/div[1]/a[2]"));
		addCartNav.click();
		Thread.sleep(2000);
		WebElement removeBtn=webDriver.findElement(By.xpath("/html/body/app-root/app-cart/div/div/div[1]/table/tbody/tr/td[5]/button"));
		removeBtn.click();
		Thread.sleep(4000);
		WebElement removeNtfn=webDriver.findElement(By.xpath("/html/body/app-root/app-cart/div/div/div/table/tbody/h3"));
		assertEquals(removeNtfn.getText().toString(), "No products present");
		
	}*/
	/*@Test
	void logoutTest() throws InterruptedException {
		webDriver.manage().window().maximize();
		webDriver.get(baseUrl);
		Thread.sleep(2000);
		WebElement emailField=webDriver.findElement(By.cssSelector("body > app-root > app-login > div > div > div > form > div.wrap-input100.validate-input.m-b-23 > input"));
		emailField.sendKeys("rixxjok@gmail.com");
		Thread.sleep(2000);
		WebElement passwordField=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[2]/input"));
		passwordField.sendKeys("sarajevo");
		Thread.sleep(2000);
		WebElement loginBtn=webDriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/div[4]/div/button"));
		loginBtn.click();
		Thread.sleep(3000);
		WebElement logoutBtn=webDriver.findElement(By.xpath("/html/body/app-root/app-navigation/div/div/div[2]/nav/div/div[2]/a"));
		logoutBtn.click();
		Thread.sleep(3000);
		assertEquals(webDriver.getCurrentUrl(),"http://localhost:4200/login");

		
	
	}*/
	

}
