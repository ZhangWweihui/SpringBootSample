package com.zwh.dubboprovider.service;

import com.zwh.sdk.bo.EchoServiceBO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangweihui
 */
@DubboService(group = "dubbo", version = "1.0.0", timeout = 5000)
@Service
@Slf4j
public class EchoServiceImpl implements EchoServiceBO {

    @Override
    public String echo(String message) {
        String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
        log.info("[{}] Hello {}, request from consumer : {}", now, message, RpcContext.getServerContext().getRemoteAddress());
        return message;
    }
}
