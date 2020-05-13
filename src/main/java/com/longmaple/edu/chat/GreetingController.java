package com.longmaple.edu.chat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class GreetingController {

	@MessageMapping("/ctobiz")
	@SendTo("/topic/ctobiz")
	public ChatMessage ctobiz(ChatMessage msg) throws Exception {
		return msg;
	}
	
	@MessageMapping("/biztoc")
	@SendTo("/topic/biztoc")
	public Greeting biztoc(Greeting msg) throws Exception {
		return msg;
	}

}
