package com.web_element_interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Interaction {
	static WebDriver driver;

	public static void main(String[] args) {
		// We using webdriver manager
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("JAVA" + Keys.ENTER);

	}

}
