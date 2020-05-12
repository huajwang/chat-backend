package com.example.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class GreetingController {

	@MessageMapping("/ctobiz")
	@SendTo("/topic/ctobiz")
	public Greeting ctobiz(ChatMessage msg) throws Exception {
		return new Greeting(msg.getName());
	}
	
	@MessageMapping("/biztoc")
	@SendTo("/topic/biztoc")
	public Greeting biztoc(ChatMessage msg) throws Exception {
		return new Greeting(msg.getName());
	}

}
