package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	private static WebDriver driver;
	static Properties prop;
	public TestBase() throws IOException{
		String path = System.getProperty("user.dir")+"//src//test//resources//configFiles//config.properties";
		prop = new Properties();
		FileInputStream fin;
		try {
			fin = new FileInputStream(path);
			prop.load(fin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void initialize() {
		String strBrowser = prop.getProperty("browser");
		if(strBrowser.equalsIgnoreCase("chrome")) {
			setDriver(new ChromeDriver());
		}
		else if(strBrowser.equalsIgnoreCase("edge")) {
			setDriver(new EdgeDriver());
		}
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().deleteAllCookies();
		getDriver().get(prop.getProperty("url"));
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		TestBase.driver = driver;
	}

}
