package com.ai.controller;

import com.ai.service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class AiController {

    @Autowired
    AiService aiService;

    @RequestMapping("/ai/getresponse/{promptString}")
    public String getResponse(@PathVariable("promptString") String promptString){
        return aiService.getResult(promptString);
    }
}

