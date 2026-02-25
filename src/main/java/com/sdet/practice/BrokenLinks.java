package com.sdet.practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinks {

	public static void main(String[] args) {
		findBrokenLinks();
	}

	private static void findBrokenLinks() {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("headless", "true");
		WebDriver webDriver = new ChromeDriver(chromeOptions);

		WebDriverWait wedDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));

		By links = By.xpath("//*[@href]");
		String url = null;
		String domain = "https://www.amazon.com.au/";

		webDriver.get(domain);

		wedDriverWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(links, 50));

		List<WebElement> elementLinkList = wedDriverWait
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(links));

		for (WebElement eachElement : elementLinkList) {

			url = eachElement.getDomAttribute("href");

			if (isURLBroken(url)) {
				System.out.println(" Broken links: " + url);
			}
		}
	}

	private static boolean isURLBroken(String urlToCheck) {

		URL url = null;
		HttpURLConnection connection = null;

		try {
			url = new URL(urlToCheck);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();

			if (!(connection.getResponseCode() >= 200 && connection.getResponseCode() < 400)) {
				return true;
			}
		}

		catch (IOException ex) {
			System.err.println(" Malformed URL: " + urlToCheck);
		}

		return false;
	}
}