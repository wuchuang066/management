package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RequestMapping("file")
@RestController
public class FileController {
    @Value("${web.upload-path}")
    private String path;

    @RequestMapping(value = "/upload")
    public String test(@RequestParam(value = "file", required = true) MultipartFile file) {
        String fileName = UUID.randomUUID().toString().replaceAll("-", "");
        try {
            byte[] bytes = file.getBytes();
            File saveFile = new File(path + fileName + ".jpg");
            FileCopyUtils.copy(bytes, saveFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(fileName);
            return null;
        }
        System.out.println(fileName);
        return fileName;
    }
}
