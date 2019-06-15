package com.zpark.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController {

	@Value("${web.upload-path}")
	private String path;
	
	@RequestMapping(value="testUpload")
	public String testUpload(@RequestParam(value="file",required=true)MultipartFile file) {
//		long tt = System.currentTimeMillis();
//		Random r = new Random();
//		r.nextInt(1000);
//		
		
		String str = UUID.randomUUID().toString().replaceAll("-", "");
		try {
			byte[] bytes = file.getBytes();
			File savefile = new File(path+str+".jpg");
			System.out.println("图片名称："+str);
			FileCopyUtils.copy(bytes, savefile);
			
		} catch(IOException e) {
			e.printStackTrace();
			return "0";
		}
		return str;
	}
}
