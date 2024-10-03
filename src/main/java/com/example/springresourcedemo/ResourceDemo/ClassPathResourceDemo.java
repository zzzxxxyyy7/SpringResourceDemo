package com.example.springresourcedemo.ResourceDemo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class ClassPathResourceDemo {
    public static void main(String[] args) {
        String path = "application.properties";

        Resource resource = new ClassPathResource(path);
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
            System.out.println(new String(is.readAllBytes()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
