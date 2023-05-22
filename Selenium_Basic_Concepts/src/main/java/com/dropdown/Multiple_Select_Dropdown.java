package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Select_Dropdown {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,500)", "");
		// 1. Multi select dropdown value
		WebElement dropdowns = driver
				.findElement(By.xpath("//*[@id='mainContent']/div[4]/div/form/table/tbody/tr[10]/td[2]/select"));
		Select selects = new Select(dropdowns);
		selects.selectByIndex(1);
		selects.selectByIndex(2);
		selects.selectByIndex(3);

	}

}
