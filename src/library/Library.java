package library;

import model.Librarian;
import model.Person;
import model.User;

// Including Header Files.
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.sql.Types;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Library {
    public static Librarian librarian;                        // object of Librarian (only one)
    public static ArrayList <User> users;                 // all registered library members
    public static ArrayList <Librarian> librarians;  // ALl the Librarian Users
    private ArrayList <Book> booksInLibrary;            // all books in library are here!
    public int book_return_deadline;                   //return deadline after which fine will be generated each day
    public double per_day_fine;
    public int hold_request_expiry;                    //number of days after which a hold request will expire
    private static Library obj;

    public static Library getInstance()
    {
        if(obj==null)
        {
            obj = new Library();
        }

        return obj;
    }
    /*---------------------------------------------------------------------*/

    private Library()   // default cons.
    {

        librarian = null;
        users = new ArrayList();
        librarians = new ArrayList();
        booksInLibrary = new ArrayList();

    }
}
