package com.SeliveystrovaTestAutoumation;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeliveystrovaTestAutoumationApplication {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.safaridriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");
		Thread.sleep(1000);
		System.out.println("\tdemo.opencart.com opened, title = " + driver.getTitle());

		driver.findElement(By.cssSelector("li.list-inline-item a.dropdown-toggle[href='']")).click();
		Thread.sleep(1000);
		System.out.println("\ta.dropdown-toggle.show clicked ");

		driver.findElement(By.cssSelector("a[href*='account/register']")).click();
		Thread.sleep(1000);
		System.out.println("\ta[href*='account/register'] clicked");

		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.click();
		firstname.clear();
		firstname.sendKeys("Elena");
		Thread.sleep(1000);
		System.out.println("\tfirstname typed");

		WebElement lastname = driver.findElement(By.id("input-lastname"));
		lastname.click();
		lastname.clear();
		lastname.sendKeys("Seliveystrova");
		Thread.sleep(1000);
		System.out.println("\tlastname typed");

		WebElement email = driver.findElement(By.id("input-email"));
		email.click();
		email.clear();
		email.sendKeys("se@gmail.com");
		Thread.sleep(1000);
		System.out.println("\temail typed");

		WebElement password = driver.findElement(By.id("input-password"));
		password.click();
		password.clear();
		password.sendKeys("qwer2ax");
		Thread.sleep(1000);
		System.out.println("\tpassword typed");


		WebElement scroll = driver.findElement(By.cssSelector("#form-register button.btn-primary"));
		scroll.sendKeys(Keys.PAGE_DOWN);

		Thread.sleep(1000);
		scroll.click();


		Thread.sleep(1000);
		System.out.println("\tbutton Continue clicked");

		Thread.sleep(2000);
		driver.quit();

		System.out.println("\tDone");

	}

}