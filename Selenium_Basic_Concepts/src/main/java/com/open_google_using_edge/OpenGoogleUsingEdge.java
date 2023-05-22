package com.open_google_using_edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleUsingEdge {
	static WebDriver driver;

	public static void main(String[] args) {
		// We using webdriver manager
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		driver.quit();

	}

}
