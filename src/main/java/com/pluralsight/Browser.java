package com.pluralsight;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
    static WebDriver driver = new EdgeDriver();

    public static void goTo(String url){
        driver.get(url);
    }

    public static String title(){
        return driver.getTitle();
    }

    public static void close(){
        driver.close();
    }
}
