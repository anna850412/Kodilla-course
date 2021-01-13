package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)


public class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [3]
        List<Book> resultListOfBooks = new ArrayList<>();                                // [4]
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);                   // [5]
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);    // [6]
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);    // [7]
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);                 // [8]
        resultListOfBooks.add(book1);                                                    // [9]
        resultListOfBooks.add(book2);                                                    // [10]
        resultListOfBooks.add(book3);                                                    // [11]
        resultListOfBooks.add(book4);                                                    // [12]
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [1]
        List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
        List<Book> resultListOf15Books = generateListOfNBooks(15);                       // [3]
        List<Book> resultListOf40Books = generateListOfNBooks(40);                       // [4]
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");    // [11]
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");   // [12]
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");  // [13]
        // Then

        assertEquals(0, theListOfBooks0.size());                                         // [14]
        assertEquals(15, theListOfBooks15.size());                                       // [15]
        assertEquals(0, theListOfBooks40.size());                                        // [16]
    }


//    @Test
//    void testListBooksWithConditionFragmentShorterThan3() {
//        // Given
//        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);            // [2]
//        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);               // [3]
//        List<Book> resultListOf10Books = generateListOfNBooks(10);                    // [4]
//        when(libraryDatabaseMock.listBooksWithCondition(anyString()))                 // [5]
//                .thenReturn(resultListOf10Books);                                          // [6]
//
//        // When
//        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");       // [7]
//
//        // Then
//        assertEquals(0, theListOfBooks10.size());                                     // [8]
//        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
//    }
    @Test
    void testListBooksInHandsOfUserWithoutBook(){
        //Given
        LibraryUser libraryUser = new LibraryUser("Anna","Kolodziejczyk","85041204466");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        bookLibrary.userBookMap.put(libraryUser,new ArrayList <Book>());

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
        List<Book> expectedResult = new ArrayList <Book>();

        //Then
        assertEquals(expectedResult, result);
    }
    @Test
    void testListBooksInHandsOfUserWith1Book(){
        //Given
        LibraryUser libraryUser = new LibraryUser("Anna","Kolodziejczyk","85041204466");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfUserBook = new ArrayList <Book>();
        listOfUserBook.add(new Book("Title", "Author", 2006));
        bookLibrary.userBookMap.put(libraryUser,listOfUserBook);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(listOfUserBook, result);
    }
    @Test
    void testListBooksInHandsOfUserWith5Books(){
        //Given
        LibraryUser libraryUser = new LibraryUser("Anna","Kolodziejczyk","85041204466");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfUserBook = new ArrayList <Book>();
        listOfUserBook.add(new Book("Title1", "Author1", 2006));
        listOfUserBook.add(new Book("Title2", "Author2", 2016));
        listOfUserBook.add(new Book("Title3", "Author3", 2002));
        listOfUserBook.add(new Book("Title4", "Author4", 2019));
        listOfUserBook.add(new Book("Title5", "Author5", 2000));
        bookLibrary.userBookMap.put(libraryUser,listOfUserBook);

        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);

        //Then
        assertEquals(listOfUserBook, result);
    }
}
