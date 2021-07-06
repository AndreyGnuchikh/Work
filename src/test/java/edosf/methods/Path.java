package edosf.methods;

import edosf.settingsEdo.Drivers;
import org.openqa.selenium.WebDriver;

public class Path {
    public static String path;

    public static String GetPathTools() {
        String path;
        path = Drivers.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = whiles(path);
        path = path.substring(1).concat("/Tools/").replace("/","\\");
        System.out.println(path);
        return path;
    }
    public static String GetPathTools(String addText) {
        String path;
        path = Drivers.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = whiles(path);
        path = path.substring(1).concat("/Tools/"+addText).replace("/","\\");
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
        path = whiles(path);
        path = path.substring(1).concat("/Tools/"+addText).replace("/","\\");
        return path;
    }
    public static String whiles(String path){
        while (path.contains("work/")){
            path = path.substring(0, path.length() - 1);
        }
        return path;
    }
}
