package com.sdet.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {

		takeScreenShot();
	}

	public static void takeScreenShot() throws IOException {

		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com/");

		File outputFile = new File("screenshot.png");

		TakesScreenshot screenShot = (TakesScreenshot) wd;
		File screenShotFile = screenShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, outputFile);
	}
}