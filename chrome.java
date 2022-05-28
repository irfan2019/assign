import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class chrome{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // browser type and chromedrover.exe path as parameters
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
        String url = " https://www.google.com/search?q=github&rlz=1C1GCEU_en-GBIN1007IN1007&oq=git&aqs=chrome.0.69i59j46i199i433i465i512j69i57j0i131i433i512j69i60l4.643j0j7&sourceid=chrome&ie=UTF-8";
        driver.get(url);
    }
}
