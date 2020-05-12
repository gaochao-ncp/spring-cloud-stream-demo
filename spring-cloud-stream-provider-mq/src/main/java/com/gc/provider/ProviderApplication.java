package com.gc.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gaochao
 * @create 2020-04-30 14:01
 */
//@EnableBinding(CustomProcessor.class)
@SpringBootApplication
public class ProviderApplication {

//  @Resource
//  CustomProcessor customProcessor;

  public static void main(String[] args) {
    SpringApplication.run(ProviderApplication.class, args);
  }


}
