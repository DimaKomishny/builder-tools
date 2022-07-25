package com.builders.utils;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BuildersUtil {

    public static String sayHello() {
        Gson gson = new Gson();
        InputStream stream = BuildersUtil.class.getClassLoader().getResourceAsStream("utils_config.properties");
        Properties properties = new Properties();
        try {
            properties.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("hello");
    }
}
