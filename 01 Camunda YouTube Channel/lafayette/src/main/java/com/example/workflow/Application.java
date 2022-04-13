package com.example.workflow;

import org.apache.ibatis.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String... args) {
//    LogFactory.useSlf4jLogging();
    SpringApplication.run(Application.class, args);
  }

}