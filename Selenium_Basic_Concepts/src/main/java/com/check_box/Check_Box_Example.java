package com.check_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_Box_Example {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node09ezhcl8gw5o1u1n0oedk8nly266892.node0");

		WebElement java = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		java.click();
		WebElement javaClicked = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		boolean javaIsSelected = javaClicked.isEnabled();
		System.out.println("Java is Selected or Not : " + javaIsSelected);
		WebElement pythonClicked = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]"));
		pythonClicked.click();
		if (pythonClicked.isSelected()) {
			pythonClicked.click();

		}

	}

}
