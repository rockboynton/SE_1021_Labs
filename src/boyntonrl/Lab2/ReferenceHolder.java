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
        references.add(book);
    }

    /**
     * Add an article reference to the bibliography
     * @param article the article reference to be added
     */
    public void addReference(Article article) {
        references.add(article);
    }

    /**
     * Return a string containing all BibTeX entries in the Reference list
     * @return a string containing all BibTeX entries
     */
    @Override
    public String toString() {
        StringBuilder allRefs = new StringBuilder();
        for (Reference reference : references) {
            allRefs.append(reference.toString());
        }
        return allRefs.toString();
    }

    /**
     * Asks the reference corresponding to the uniqueID to update itself
     * @param uniqueID the id for the reference to be updated
     * @param in Input stream to read user input
     */
    public void updateReference(String uniqueID, Scanner in) {
        // if the user inputted the full name e.g. "REF0" (short-circuits if it isn't long enough)
        if ( (uniqueID.length() >= 3) && uniqueID.startsWith("REF")) {
            references.get(Integer.parseInt(uniqueID.substring(3))).promptForUpdate(in);
        // if the user only inputted the number
        // lambda expression found on stack overflow
        } else if (uniqueID.chars().allMatch( Character::isDigit ) && Integer.parseInt(uniqueID) < references.size()) {
            references.get(Integer.parseInt(uniqueID)).promptForUpdate(in);
        } // does nothing if input was not valid
    } 
}
