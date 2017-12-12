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
 * Represents bibliographical information about a reference
 * @version 1
 * @author boyntonrl
 */
public class Reference {

    /**
     * Keeps track of how many instances of this type have been created
     */
    private static int instanceCount = 0;

    /**
     * The person who wrote the item
     */
    private String author;

    /**
     * The unique ID assigned to this instance of the reference
     */
    private final String myUniqueID;

    /**
     * Year of publication
     */
    private int publicationYear;

    /**
     * The title for the reference
     */
    private String title;


    /**
     * Creates a reference and assigns a unique ID to it
     * @param author author of this item
     * @param title title of this item
     * @param publicationYear year item was published
     */
    public Reference(String author,  String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.myUniqueID = "REF" + instanceCount; //TODO add REF
        instanceCount++;
    }

    /**
     * Get the author
     * @return author of this item
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Get the unique ID associated with this item
     * @return the unique ID
     */
    public String getMyUniqueID() {
        return myUniqueID;
    }

    /**
     * Get publication year
     * @return publication year of this item
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * Get title
     * @return title of this item
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set author
     * @param author the author of the item
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets publication year
     * @param publicationYear year item was published. Must be positive, or change will not occur
     */
    public void setPublicationYear(int publicationYear) {
        if (publicationYear > 0) {
            this.publicationYear = publicationYear;
        }
    }

    /**
     * Sets title
     * @param title title of the item
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Prompts the user (via the console) to update the attributes of the reference object.
     * @param in Input stream to read user input
     */
    public void promptForUpdate(Scanner in) {
        System.out.println("Please update the following attributes..."); // subclasses do the rest of the work

    }
}
