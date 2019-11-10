package com.springframework.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImp implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImp(){
        chuckNorrisQuotes=new ChuckNorrisQuotes();
    }
    @Override
    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
