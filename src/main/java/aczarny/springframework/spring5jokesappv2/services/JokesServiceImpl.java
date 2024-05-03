package aczarny.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes quotes;

    public JokesServiceImpl() {
        quotes = new ChuckNorrisQuotes();
    }

    public String printJoke() {

       return quotes.getRandomQuote();
    }
}
