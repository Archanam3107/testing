package com.cjc;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws IOException {
		
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	  driver.get("https://smallpdf.com/jpg-to-pdf");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/div/div/div[1]/div[6]/div/div[2]/div/div/div/div/div[2]/form/label/div/div[2]/button[1]/span")).click();
	  Runtime.getRuntime().exec("C:\\Users\\dell\\Desktop\\AUTO\filefolder.exe");
	  
}
}