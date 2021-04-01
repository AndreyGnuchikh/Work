package edosf.methods;

import edosf.settingsEdo.Drivers;
import org.openqa.selenium.WebDriver;

public class Path {
    public static String path;

    public static String GetPathTools() {
        String path;
        path = Drivers.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.substring(1,path.length() - 16).concat("/Tools/").replace("/","\\");
        return path;
    }
    public static String GetPathTools(String addText) {
        String path;
        path = Drivers.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.substring(1,path.length() - 16).concat("/Tools/"+addText).replace("/","\\");
        return path;
    }
    public static String GetPathTools(String addText, WebDriver driver)    throws InterruptedException {
        String x = driver.getCurrentUrl();
        path = GetPathTools();
        if(!x.contains("testedo")){
            addText= "upd\\"+addText;
            Thread.sleep(500);
        }else {
            addText= "upd8080\\"+addText;
            Thread.sleep(500);
        }
        String path;
        path = Drivers.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.substring(1,path.length() - 16).concat("/Tools/"+addText).replace("/","\\");
        return path;
    }
}
