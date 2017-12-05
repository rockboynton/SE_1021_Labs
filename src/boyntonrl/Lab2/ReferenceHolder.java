/*
 * SE1021 - 021
 * Winter 2017
 * Lab: Lab2
 * Name: Rock Boynton
 * Created: 12/4/17
 */

package boyntonrl.Lab2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to hold all the BibTeX references
 * @version 1
 * @author boyntonrl
 */
public class ReferenceHolder {

    /**
     * ArrayList to store the references
     */
    private ArrayList<Reference> references = new ArrayList<>();

    /**
     * Constructor for ReferenceHolder object
     */
    public ReferenceHolder() {
    }

    /**
     * Add a book reference to the bibliography
     * @param book the book reference to be added
     */
    public void addReference(Book book) {

    }

    /**
     * Add an article reference to the bibliography
     * @param article the article reference to be added
     */
    public void addReference(Article article) {

    }

    /**
     * Return a string containing all BibTeX entries in the Reference list
     * @return a string containing all BibTeX entries
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Asks the reference corresponding to the uniqueID to update itself
     * @param uniqueID the id for the reference to be updated
     * @param in Input stream to read user input
     */
    public void updateReference(String uniqueID, Scanner in) {

    }
}
