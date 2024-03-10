package com.ai.service;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    @Autowired
    ChatClient chatClient;

    public String getResult(String promptString){
        return chatClient.call(promptString);
    }
}
