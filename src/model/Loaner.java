package model;

import library.Loan;

import java.util.ArrayList;

public class Loaner extends Person{

    private ArrayList<Loan> borrowedBooks;

    public Loaner(String name, String email, String password) {
        super(name, email, password);
        borrowedBooks = new ArrayList();
    }

    public void addBorrowedBook(Loan iBook)
    {
        borrowedBooks.add(iBook);
    }

    public void removeBorrowedBook(Loan iBook)
    {
        borrowedBooks.remove(iBook);
    }

    public ArrayList<Loan> getBorrowedBooks()
    {
        return borrowedBooks;
    }

}
