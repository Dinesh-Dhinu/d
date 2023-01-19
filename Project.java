package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver w=new ChromeDriver();
	w.get("http://adactinhotelapp.com/");
	w.manage().window().maximize();
	Thread.sleep(1500);
	
	
	WebElement name = w.findElement(By.id("username"));
	name.sendKeys("Dinesh1994");
	Thread.sleep(1500);
	
	WebElement pass = w.findElement(By.id("password"));
	pass.sendKeys("Dinu@123");
	Thread.sleep(1500);
	
	WebElement login = w.findElement(By.id("login"));
	login.click();
	Thread.sleep(1500);
	
	WebElement location = w.findElement(By.xpath("//select[@name='location']"));
	location.click();
	Select s=new Select(location);
	s.selectByValue("London");
	Thread.sleep(1500);
	
	WebElement hotel = w.findElement(By.xpath("//select[@name='hotels']"));
	hotel.click();
	Select s1=new Select(hotel);
	s1.selectByIndex(2);
	Thread.sleep(1500);
			
	WebElement room_type = w.findElement(By.id("room_type"));
	room_type.click();
	Select s2=new Select(room_type);
	s2.selectByVisibleText("Super Deluxe");
	Thread.sleep(1500);
	
	WebElement room_nos = w.findElement(By.id("room_nos"));
	room_nos.click();
	Select s3=new Select(room_nos);
	s3.selectByValue("3");
	Thread.sleep(1500);
	
	WebElement in_date = w.findElement(By.xpath("(//input[@type='text'])[2]"));
	in_date.clear();
	in_date.sendKeys("26/01/2023");
	Thread.sleep(1500);

	WebElement out_date = w.findElement(By.xpath("(//input[@type='text'])[3]"));
	out_date.clear();
	out_date.sendKeys("31/01/2023");
	
	WebElement adult = w.findElement(By.id("adult_room"));
	adult.click();
	Select s4=new Select(adult);
	s4.selectByVisibleText("2 - Two");
	Thread.sleep(1500);
	
    WebElement child = w.findElement(By.id("child_room"));
    child.click();
    Select s5=new Select(child);
    s5.selectByValue("1");
    Thread.sleep(1500);
    
    WebElement search = w.findElement(By.name("Submit"));
    search.click();
    Thread.sleep(1500);
	
	WebElement button = w.findElement(By.xpath("//input[@value='0']"));
	button.click();
	Thread.sleep(1500);
	
	WebElement continues = w.findElement(By.id("continue"));
	continues.click();
    Thread.sleep(1500);
	
    WebElement f_name = w.findElement(By.xpath("(//input[@type='text'])[11]"));
    f_name.sendKeys("Dinesh");
    Thread.sleep(1500);
    
    WebElement l_name = w.findElement(By.xpath("(//input[@type='text'])[12]"));
    l_name.sendKeys("Babu");
    Thread.sleep(1500);
    
    WebElement address = w.findElement(By.id("address"));
    address.sendKeys("No.01, puzhal street, ambattur, padi, chennai-600050");
    Thread.sleep(1500);
    
    WebElement card = w.findElement(By.xpath("(//input[@type='text'])[13]"));
    card.sendKeys("9790729020464765");
    Thread.sleep(1500);
	
	WebElement card_type = w.findElement(By.xpath("(//select[contains(@id,'cc')])[1]"));
	card_type.click();
	Select s6=new Select(card_type);
	s6.selectByValue("AMEX");
	Thread.sleep(1500);
	
	WebElement exp_month = w.findElement(By.xpath("(//select[contains(@id,'cc')])[2]"));
	exp_month.click();
	Select s7=new Select(exp_month);
	s7.selectByVisibleText("February");
	Thread.sleep(1500);
	
	WebElement exp_year = w.findElement(By.xpath("(//select[contains(@id,'cc')])[3]"));
	exp_year.click();
	Select s8=new Select(exp_year);
	s8.selectByVisibleText("2022");
	Thread.sleep(1500);
	
	WebElement cvv = w.findElement(By.xpath("(//input[contains(@name,'cc')])[2]"));
	cvv.sendKeys("000");
	Thread.sleep(1500);
	
	WebElement book = w.findElement(By.xpath("//input[@type='button']"));
	book.click();
	Thread.sleep(10000);
	
	WebElement logout = w.findElement(By.id("logout"));	
	logout.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
