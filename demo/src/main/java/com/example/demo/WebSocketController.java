package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;

@Controller
public class WebSocketController {

    @MessageMapping("/code.edit")
    @SendTo("/topic/code")
    public CodeMessage send(CodeMessage message, SimpMessageHeaderAccessor headerAccessor) {
        return message;
    }
}
