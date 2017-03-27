package ru.stereohorse.sandbox;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumTests {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("starting tests...");

        RemoteWebDriver d = new RemoteWebDriver(
                new URL(args[0]),
                DesiredCapabilities.chrome()
        );

        try {
            System.out.println("getting current URL...");
            d.getCurrentUrl();
        } finally {
            d.close();
        }
    }
}
