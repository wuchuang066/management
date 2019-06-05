package com.zpark;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zpark.mapper")
public class VueMainApplication {

		public static void main(String[] args) {
			SpringApplication.run(VueMainApplication.class, args);
		}

}
