package webdriverMethods;

import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		System.out.println(driver.manage().window().getPosition());

	}

}
