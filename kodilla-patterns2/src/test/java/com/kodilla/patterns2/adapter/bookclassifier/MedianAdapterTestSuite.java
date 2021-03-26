package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("Title1", "Author1",2010,"1234");
        Book book2 = new Book("Title2", "Author2",2020,"567");
//        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book book1 = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Author1","Title1",2015);
//        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book book2 = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Author2","Title2",2018);
//        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book book3 = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Author3","Title3",2020);

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
//        bookSet.add(book3);
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int expectedMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(expectedMedian, 2020);
    }
}
