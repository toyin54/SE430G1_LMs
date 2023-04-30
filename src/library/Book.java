package library;

import java.io.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Book {

    private int bookID;           // ID given by a library to a book to make it distinguishable from other books
    private String title;         // Title of a book
    private String genre;       // Subject to which a book is related!
    private String author;        // Author of book!
    private boolean isIssued;        // this will be true if the book is currently issued to some borrower.
    static int currentIdNumber = 0;     //This will be unique for every book, since it will be incremented when everytime
    //when a book is created


    public Book(int bookID, String title, String genre, String author) {


        currentIdNumber++;
        if(bookID==-1)
        {
            bookID = currentIdNumber;
        }
        else
            bookID=bookID;

        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public static int getCurrentIdNumber() {
        return currentIdNumber;
    }

    public static void setCurrentIdNumber(int currentIdNumber) {
        Book.currentIdNumber = currentIdNumber;
    }
}
