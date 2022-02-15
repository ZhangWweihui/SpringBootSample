package com.zwh.dubboprovider.service;

import com.zwh.sdk.bo.NetworkServiceBO;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author ZhangWeihui
 * @date 2019/7/2 14:51
 */
@DubboService(group = "dubbo", version = "1.0.0", timeout = 5000)
@Service
public class NetworkServiceImpl implements NetworkServiceBO {

    @Override
    public String connect() {
        return "The network has been connected.";
    }

    @Override
    public String disconnect() {
        return "The network has been disconnected.";
    }

    @Override
    public String reconnect() {
        return "The network has been reconnected.";
    }
}