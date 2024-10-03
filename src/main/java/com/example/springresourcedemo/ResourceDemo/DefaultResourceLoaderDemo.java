package com.example.springresourcedemo.ResourceDemo;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class DefaultResourceLoaderDemo {
    public static void main(String[] args) {
        DefaultResourceLoader loader = new DefaultResourceLoader();

        // 从类路径加载资源
        Resource classpathResource = loader.getResource("classpath:application.properties");
        try (InputStream is = classpathResource.getInputStream()) {
            // 读取和处理资源内容
            System.out.println("Classpath = "+ new String(is.readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 加载文件系统中的资源
        Resource fileResource = loader.getResource("file:/file1.txt");
        try (InputStream is = fileResource.getInputStream()) {
            // 读取和处理资源内容
            System.out.println("File = "+ new String(is.readAllBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
