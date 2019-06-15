package com.zpark;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.zpark.mapper")
@EnableCaching
public class VueMainApplication {

		public static void main(String[] args) {
			SpringApplication.run(VueMainApplication.class, args);
		}

}
