package com.gc.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 * 消息接收
 * @author gaochao
 * @create 2020-05-11 16:30
 */
@Slf4j
@Component
public class ServiceTest {

  //接收消息
  @StreamListener(CustomProcessor.commodityOrderInvalidInput)
  public void receiver(Object payload) {
    log.info("receiverd2:"+payload+new Date());
  }

}
