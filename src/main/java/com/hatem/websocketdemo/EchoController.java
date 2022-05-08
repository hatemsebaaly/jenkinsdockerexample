package com.hatem.websocketdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class EchoController {

    private static final Logger LOG = LoggerFactory.getLogger(EchoController.class);

    @MessageMapping("/name")
    @SendTo("/topic/echos")
    public Echo greeting(NameMessage message) throws Exception {
        LOG.info( "Received name  " + message.getName());
        LOG.info("Sending  Version 1.0: Your name, " + HtmlUtils.htmlEscape(message.getName()) + "!");
        return new Echo("Version 1.0: Your name, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}