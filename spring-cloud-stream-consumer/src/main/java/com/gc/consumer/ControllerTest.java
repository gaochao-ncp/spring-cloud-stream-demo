package com.gc.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 消息发送
 * @author gaochao
 * @create 2020-05-11 16:30
 */
@RestController
@Slf4j
public class ControllerTest {

  @Autowired
  @Qualifier(CustomProcessor.commodityOrderInvalidOutput)
  private MessageChannel commodityOrderInvalidOutput;


  //消息延迟6秒,发送
  @GetMapping("/hello2")
  public void hello2(){
    log.info("send msg :"+new Date());
    commodityOrderInvalidOutput.send(MessageBuilder.withPayload("hello spring cloud stream !!")
            .setHeader("x-delay", 6000).build());
  }

}
