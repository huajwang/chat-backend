package com.longmaple.edu.chat;

public class ChatMessage {
	
	private Integer chatId;
	private String name;
	private String content;

	public ChatMessage() {
	}

	public ChatMessage(Integer chatId, String name, String content) {
		this.chatId = chatId;
		this.name = name;
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public Integer getChatId() {
		return chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setName(String name) {
		this.name = name;
	}
}
