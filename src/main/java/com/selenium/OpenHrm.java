package com.selenium;

import org.openqa.selenium.By;                            //facebook--project name------ group_a
import org.openqa.selenium.WebDriver;                    //  orangreHrm--- project name "smarttech_zamankabir".
import org.openqa.selenium.chrome.ChromeDriver;          // amazon------- project name "test_new" smarttech_zamankabir

public class OpenHrm {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = " https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
		driver.get(url);

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		// Thread.sleep(5);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		// Thread.sleep(5);
		driver.findElement(By.name("Submit")).click();
		// Thread.sleep(5);

	}

}
