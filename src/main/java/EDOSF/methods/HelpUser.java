package EDOSF.methods;


import EDOSF.SettingsEDOSF.Settings;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;


import static EDOSF.methods.Path.GetPathTools;
import static java.lang.Runtime.getRuntime;



public class HelpUser {

    public static void sleepUpd() {
        try {
            Thread.sleep(Settings.ToWaitUpd);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // return Number List or Path file
    public static String ReZip(Integer numElementsFileList) throws IOException, InterruptedException {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Thread.sleep(2000);
        String NameFile, test, out;
        File dir = new File(GetPathTools("TestFile"));
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        Thread.sleep(1000);
        NameFile = lst.get(0).toString();
        NameFile = NameFile.substring(NameFile.length()-14);
        System.out.println(NameFile);
        test = "C:\\Program Files\\7-Zip\\7z.exe e "+GetPathTools("TestFile\\")+ NameFile + " -o\""+GetPathTools("TestFile")+"\\";
        System.out.println(test);
        getRuntime().exec(test);
        Thread.sleep(3500);
        File dir2 = new File(GetPathTools("TestFile"));
        File[] arrFiles2 = dir2.listFiles();
        List<File> lst2 = Arrays.asList(arrFiles2);
        if (lst2.size() <= 2) {
            for (File file : lst2) {
                System.out.println(file);
            }
            out = lst2.get(numElementsFileList).toString();
        } else {
            int num = lst2.size();
            out = Integer.toString(num);
        }

        return out;
    }
    public static void DeletedFiles(File dir) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        for (File file : dir.listFiles())
            if (!file.isDirectory())
                file.delete();
    }

    public static String Krutilka(String str, Integer number) {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String rerurningTest = null;
        String[] dre = new String[500];
        for (int i = 0; i < 1; i++) {
            String[] vals = str.split(">");
            for (String s : vals) {
                i++;
                dre[i] = s;
                System.out.println(i + " " + dre[i]);
            }
            rerurningTest = dre[number];

        }
        while (rerurningTest.contains("<")){
            rerurningTest = rerurningTest.substring(0,rerurningTest.length() - 1);
            System.out.println(rerurningTest);
        }
        return rerurningTest;
    }
    public static String Time() {
        System.out.println("-----Start method " + Thread.currentThread().getStackTrace()[1].getMethodName());
        Date currentDate = new Date();
        SimpleDateFormat dateFormat;

        dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        System.out.println("Constructor 4: " + dateFormat.format(currentDate));
        return dateFormat.format(currentDate);
    }
    public static String Split(String text, String textSplit) {
        String[] str = text.split(textSplit);
        text = str[1];
        System.out.println(text);
        return text;
    }
    public static String Split(String text, String textSplit, int number) {
        String[] str = text.split(textSplit);
        text = str[1];
        System.out.println(text);
        text = text.substring(0, number);
        System.out.println(text);
        return text;
    }
}
