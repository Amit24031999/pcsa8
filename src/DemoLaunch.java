import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.session.ChromeFilter;

public class DemoLaunch {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
	}

}
