package com.class30;

import com.class26.FirefoxDriver;

public class WebDriverTest {
public static void main(String[] args) {
	WebDriver w1=new ChromeDriver();
	WebDriver w2=(WebDriver) new FirefoxDriver();
	w1.closeBrowser();
	w1.findElement();
	w1.openBrowser();
	w1.maximazeWindow();
	
	w2.closeBrowser();
	w2.findElement();
	w2.openBrowser();
    w2.maximazeWindow();
	
	TakesScreenshot ts = new ChromeDriver();
	
}
}
