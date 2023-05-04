package library;


import model.*;

import java.util.Date;

public class Loan {

    private Loaner loaner;
    private Book book;

    public Loan(Loaner loan, Book b)  // Para cons.
    {
        this.loaner = loan;
        this.book = b;

    }


}
