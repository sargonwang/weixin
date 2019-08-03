package com.lzp.streamrabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 云路供应链科技有限公司 版权所有  Copyright 2019<br>
 *
 * @Description:
 * @Project:
 * @CreateDate: Created in 2019-08-01 21:05 <br>
 * @Author: zhipeng.liu
 */

@RestController
public class MsgStreamController {

    @Autowired
    private Sink sink;

    @GetMapping("/sendMsgByStream")
    public void sendMsgByStream(){
        String message = "I am one msg sent by Spring Cloud Stream";
        sink.input().send(MessageBuilder.withPayload(message).build());
    }

}
