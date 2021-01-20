package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    void testGetBooks(){
        //Given
        Book book1 = new Book("ABC", "Adam Smith", LocalDate.of(2010,10,3));
        Book book2 = new Book("Cień wiatru", "Carloz Zafon", LocalDate.of(2006,5,27));
        Book book3 = new Book("Far from home", "Adela Majdan", LocalDate.of(2018,2,26));
        Library library = new Library("Library1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowClone();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepClone();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assertions.assertEquals(2, library.getBooks().size());
        Assertions.assertEquals(2, clonedLibrary.getBooks().size());
        Assertions.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assertions.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assertions.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
