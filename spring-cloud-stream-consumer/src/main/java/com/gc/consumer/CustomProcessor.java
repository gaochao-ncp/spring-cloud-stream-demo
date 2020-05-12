package com.gc.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 自定义的处理器
 * @author gaochao
 * @create 2020-05-06 18:14
 */
public interface CustomProcessor {
  //延时代付款的订单
  String commodityOrderInvalidInput = "commodityOrderInvalidInput";
  String commodityOrderInvalidOutput = "commodityOrderInvalidOutput";

  @Input(CustomProcessor.commodityOrderInvalidInput)
  SubscribableChannel commodityOrderInvalidInput();

  @Output(CustomProcessor.commodityOrderInvalidOutput)
  MessageChannel commodityOrderInvalidOutput();


}
