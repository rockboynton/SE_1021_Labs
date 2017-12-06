/*
 * SE1021 - 021
 * Winter 2017
 * Lab: Lab2
 * Name: Rock Boynton
 * Created: 12/4/17
 */

package boyntonrl.Lab2;

import java.util.Scanner;

/**
 * Represents bibliographical information about a book
 * @version 1
 * @author boyntonrl
 */
public class Book extends Reference{

    /**
     * Name of the publisher of the book
     */
    private String publisher;


    /**
     * Constructor for a book object
     * @param author Name of the person who wrote this book
     * @param title Name of this book
     * @param publicationYear Year this book was published
     * @param publisher Name of the publisher of this book
     */
    public Book(String author, String title, int publicationYear, String publisher) {
        super(author, title, publicationYear);
        this.publisher = publisher;
    }

    /**
     * Gets the name of the publisher of this book
     * @return Name of the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the name of the publisher of this book
     * @param publisher Name of the publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Prompts the user (via the console) to update the attributes of the book object.
     * @param in Input stream to read user input
     */
    @Override
    public void promptForUpdate(Scanner in) {

    }

    /**
     * Returns a String of information in BibTeX format
     * @return
     */
    @Override
    public String toString() {
        return "@BOOK { REF" + super.getMyUniqueID() + ",\n" +
                "author = \"" + super.getAuthor() + "\",\n" +
                "title = \"" + super.getTitle() + "\",\n" +
                "publisher = \"" + this.getPublisher() + "\",\n" +
                "year = \"" + super.getPublicationYear() + "\"\n" +
                "}\n";
    }
}
