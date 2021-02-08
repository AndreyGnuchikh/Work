package OFD.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    String url;
    String logName;
    String pass;
    Boolean bol;


    public Login(String url, String logName, String pass) {
        this.url = url;
        this.logName = logName;
        this.pass = pass;
    }
    public void Start(WebDriver driver) throws InterruptedException {
        driver.get(this.url);
        driver.findElement(By.cssSelector("#ROOT-2521314 > div > div.v-verticallayout.v-layout.v-vertical.v-widget.login-bg.v-verticallayout-login-bg.v-has-width.v-has-height.v-margin-top.v-margin-right.v-margin-bottom.v-margin-left > div > div.v-slot.v-align-center.v-align-middle > div > div.v-panel-content.v-scrollable > div > div.v-slot.v-slot-margin-top-50.v-slot-margin-bottom-50.v-align-center.v-align-middle > div > div:nth-child(5) > div > div:nth-child(3) > input")).sendKeys(this.logName);
        driver.findElement(By.cssSelector("#gwt-uid-3")).sendKeys(this.pass);
        driver.findElement(By.cssSelector("#ROOT-2521314 > div > div.v-verticallayout.v-layout.v-vertical.v-widget.login-bg.v-verticallayout-login-bg.v-has-width.v-has-height.v-margin-top.v-margin-right.v-margin-bottom.v-margin-left > div > div.v-slot.v-align-center.v-align-middle > div > div.v-panel-content.v-scrollable > div > div.v-slot.v-slot-margin-top-50.v-slot-margin-bottom-50.v-align-center.v-align-middle > div > div:nth-child(5) > div > div.v-slot.v-slot-btn-primary.v-slot-blue.v-slot-btn-full > div")).click();
        Element.visibleElement180SecToWait("#gwt-uid-10 > div:nth-child(1)",driver);
        // Is a window showing?
        bol = driver.findElements(By.cssSelector("#\\33 6_window_close")).size() > 0;
        if(bol) {
            driver.findElement(By.cssSelector("#\\33 6_window_close")).click();
        }

    }
}
