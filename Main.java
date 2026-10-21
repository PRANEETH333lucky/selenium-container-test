
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost:8080");

            String page = driver.getPageSource();

            if (page.contains("Docker and Kubernetes Integration")) {
                System.out.println("Test 1 Passed: Homepage Loaded");
            } else {
                throw new AssertionError("Homepage test failed");
            }

            if (page.contains("My DevOps lab experiment is running successfully!")) {
                System.out.println("Test 2 Passed: Content Verified");
            } else {
                throw new AssertionError("Content test failed");
            }
        } finally {
            driver.quit();
        }
    }
}
