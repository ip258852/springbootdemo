package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class DemoCtl {

    @Autowired
    SimpMessagingTemplate template;

    @MessageMapping("/test1")
    public void demo(Principal principal){
        template.convertAndSendToUser(principal.getName(),"/queue/sub","123456789");
    }
}
