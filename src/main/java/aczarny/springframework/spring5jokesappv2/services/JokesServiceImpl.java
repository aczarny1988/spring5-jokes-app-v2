package aczarny.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {
    public String printJoke() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
       return quotes.getRandomQuote();
    }
}
