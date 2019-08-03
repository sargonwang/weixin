package com.lzp.streamrabbit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * 接收方
 */

@Component
@EnableBinding(Sink.class)
@Slf4j
public class StreamReceive {


    // Step2  @StreamListener 绑定对象的名称
    @StreamListener(Sink.INPUT)
    public void processStreamMsg(Object msg){
        log.info("StreamReceive: {}",msg);
    }

}