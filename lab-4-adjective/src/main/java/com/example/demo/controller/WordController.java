package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by mikehoughton on 11/09/2017.
 */
@RestController


public class WordController {

    @Value("${words}")
    private String words;

    @GetMapping("/")
    public @ResponseBody String getWord(){
       String[] wordArray = words.split(",");
       int i =  new Random().ints(0, wordArray.length).findFirst().getAsInt();
       return wordArray[i];
    }
}
