package com.example.springresourcedemo.ResourceDemo;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

public class FileSystemResourceDemo {
    public static void main(String[] args) throws Exception {
        // 请替换我们自己的目录
        String path = "D:\\file.txt";
        Resource resource = new FileSystemResource(path);
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
            System.out.println(new String(is.readAllBytes()));
        }
    }
}