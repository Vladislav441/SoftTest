package ru.ya;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void start() {

        ChromeDriver driver = new ChromeDriver();

        driver.navigate().to("https://ya.ru/");

        driver.quit();

    }
}