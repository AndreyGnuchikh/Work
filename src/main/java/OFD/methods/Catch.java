package OFD.methods;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class Catch {
    public static void catching(WebDriver driver, Throwable e) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        driver.quit();
        e.printStackTrace();
        String srt = null;
        if(e.toString().contains("org.openqa.selenium.NoSuchElementException:")){
            srt = e.toString();
            int index1 = srt.indexOf("For documentation on this error");
            int index2 = srt.indexOf("t:");
            srt = srt.substring(index2+1, index1);
            System.out.println("Проблена с нахождением элемента "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
            Assertions.fail("Проблена с нахождением элемента "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());

        }
        if(e.toString().contains("org.openqa.selenium.ElementClickInterceptedException:")){
            srt = e.toString();
            int index1 = srt.indexOf("Build info:");
            int index2 = srt.indexOf("n:");
            srt = srt.substring(index2+1, index1);
            System.out.println("Элемент как то скрыт от нажатия "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
            Assertions.fail("Элемент как то скрыт от нажатия "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
        }
        if(e.toString().contains("org.openqa.selenium.ElementNotInteractableException:")){
            srt = e.toString();
            int index1 = srt.indexOf("Build info:");
            int index2 = srt.indexOf("n:");
            srt = srt.substring(index2+1, index1);
            System.out.println("Эламент есть в DOM, но не находится в поле нажатия, видости "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
            Assertions.fail("Эламент есть в DOM, но не находится в поле нажатия, видости "+srt +"В методе: "+ Thread.currentThread().getStackTrace()[1].getMethodName());
        }
        Assertions.fail(srt);
    }
}
