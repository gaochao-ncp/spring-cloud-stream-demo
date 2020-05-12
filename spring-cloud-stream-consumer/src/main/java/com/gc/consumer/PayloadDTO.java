package com.gc.consumer;

import lombok.Data;

/**
 * 测试消息队列接口信息的DTO
 * @author gaochao
 * @create 2020-05-11 16:52
 */
@Data
public class PayloadDTO {

  private String name;
  private Long orderId;

}
