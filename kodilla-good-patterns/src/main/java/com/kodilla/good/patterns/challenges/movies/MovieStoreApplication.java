package com.kodilla.good.patterns.challenges.movies;

import java.util.stream.Collectors;

public class MovieStoreApplication {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String theResultStringOfBooks = movieStore.getMovies().values().stream()
                .flatMap(s -> s.stream())
                .collect(Collectors.joining("!", "", ""));
        System.out.println(theResultStringOfBooks);
    }
}