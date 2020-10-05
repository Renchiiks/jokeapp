package com.example.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
//For java configuration
//@Configuration

public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
