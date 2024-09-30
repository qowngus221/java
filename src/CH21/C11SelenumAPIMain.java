package CH21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C11SelenumAPIMain {

	//크롬서버.jar 다운로드 경로(셀레니움 공식 홈페이지)
	//
	//크롬드라이브 다운로드 경로
	
	private static final String WEB_DRIVER_ID="webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH="C:\\Users\\Administrator\\eclipse-workspace\\JAVABOOK\\src\\Driver\\chromedriver.exe";
	
	
	public static void main(String[] args) {
		
		System.setProperty(WEB_DRIVER_ID,WEB_DRIVER_PATH);
		
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https:\\www.naver.com");
	}

}
