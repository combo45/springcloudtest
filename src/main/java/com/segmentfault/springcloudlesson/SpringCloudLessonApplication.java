package com.segmentfault.springcloudlesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudLessonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLessonApplication.class, args);
	}

}
