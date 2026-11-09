package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class DownloadFileTest {
    WebDriver driver;
    String downloadPath = System.getProperty("user.dir") + "\\downloads";


    @BeforeTest
    void openBrowser() {

        EdgeOptions options = new EdgeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("safebrowsing.enabled", true);
        options.setExperimentalOption("prefs", prefs);
        driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @Test(invocationCount = 4)
    void downloadFile() throws IOException, InterruptedException {
        String username = "admin";
        String password = "admin";
        driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/download_secure");
        List<WebElement> list = driver.findElements(By.xpath("//div/a"));
        Random r = new Random();
        int index = r.nextInt(0, list.size());
        list.get(index).click();
        Path downloadDir = Paths.get(downloadPath);
        long endTime = System.currentTimeMillis() + 30000;
        while (System.currentTimeMillis() < endTime) {
            boolean downloading;
            try (Stream<Path> files = Files.list(downloadDir)) {
                downloading = files.anyMatch(
                        file -> file.toString().endsWith(".crdownload")
                );
            }
            if (!downloading) {
                break;
            }
            Thread.sleep(500);
        }
        System.out.println("Download process completed");
    }

    @AfterTest
    void close() {
        driver.quit();
    }

}
