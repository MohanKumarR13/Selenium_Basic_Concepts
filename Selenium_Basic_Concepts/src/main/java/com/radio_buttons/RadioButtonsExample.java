package com.radio_buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsExample {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node09ezhcl8gw5o1u1n0oedk8nly266892.node0");
		WebElement unchecked = driver.findElement(By.xpath("//*[@id='j_idt87:city2']/div/div[3]/div/div[2]"));
		WebElement checked = driver
				.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[2]/div/div[2]"));
		Boolean status_1 = unchecked.isSelected();
		Boolean status_2 = checked.isEnabled();
		System.out
				.println("UnChecked Radio Button Status : " + status_1 + " Checked Radio Button Status : " + status_2);
		WebElement browser = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]"));
		browser.click();

	}

}
