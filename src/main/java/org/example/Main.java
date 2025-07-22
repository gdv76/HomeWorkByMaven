package org.example;

import javax.naming.ConfigurationException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");
// 1. Читает properties и получает значение параметра service.weather.url
// 2. Делаем 2 сборки: с двумя профилями dev и prod
// 3. Запускаем программу. Результат: в консоле  видим урл соответствующий профилю

        Properties props = new Properties();
//        props.load(new FileInputStream(new File("target/classes/config.properties")));

        props.load(Main.class.getClassLoader().getResourceAsStream("config.properties"));
        String weatherUrl = props.getProperty("service.weather.url");
        System.out.println("Url сайта погоды = " + weatherUrl);
    }
}