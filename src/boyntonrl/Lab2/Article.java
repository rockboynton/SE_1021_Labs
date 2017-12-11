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
 * Represents bibliographical information about an article published in a journal
 * @version 1
 * @author boyntonrl
 */
public class Article extends Reference{

    /**
     * The page number that the article ends on
     */
    private int endingPage;

    /**
     * The name of the journal the article was published in
     */
    private String journal;

    /**
     * The page number that the article starts on
     */
    private int startingPage;


    /**
     * Constructor for an Article object. Makes sure that the starting page is positive, and the ending page
     * is greater than the starting page.
     * @param author Author of the article
     * @param title Title of the article
     * @param publicationYear Year the article was published
     * @param journal Journal the article was published in
     * @param startingPage First page of the article
     * @param endingPage Last page of the article
     */
    public Article(String author, String title, int publicationYear, String journal, int startingPage, int endingPage) {
        super(author, title, publicationYear);
        this.journal = journal;
        this.startingPage = startingPage;
        this.endingPage = endingPage;
    }

    /**
     * Gets last page of article
     * @return page number for last page
     */
    public int getEndingPage() {
        return endingPage;
    }

    /**
     * Sets the ending page of the article. If the desired ending page is less than the starting page, no change is made.
     * @param endingPage
     */
    public void setEndingPage(int endingPage) {
        this.endingPage = endingPage;
    }

    /**
     * Gets name of journal
     * @return name of the journal article was published in
     */
    public String getJournal() {
        return journal;
    }

    /**
     * Sets name of journal
     * @param journal name of the journal the article was published in
     */
    public void setJournal(String journal) {
        this.journal = journal;
    }

    /**
     * Gets first page of article
     * @return page number for first page
     */
    public int getStartingPage() {
        return startingPage;
    }

    /**
     * Sets first page of the article. If the desired starting page is not positive or is greater
     * than the current ending page, no change is made.
     * @param startingPage Page number of the first page of the article.
     */
    public void setStartingPage(int startingPage) {
        this.startingPage = startingPage;
    }

    /**
     * Prompts the user (via the console) to update the attributes of the article object.
     * @param in Input stream to read user input
     */
    @Override
    public void promptForUpdate(Scanner in) {
        super.promptForUpdate(in);

        System.out.println("Enter the author of the article");
        this.setAuthor(in.nextLine());

        System.out.println("Enter the title of the article");
        this.setTitle(in.nextLine());

        System.out.println("Enter the title of the journal.");
        this.setJournal(in.nextLine());

        System.out.println("Enter the first page of the article.");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Enter the first page of the article.");
        }
        this.setStartingPage(in.nextInt());

        System.out.println("Enter the last page of the article.");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Enter the last page of the article.");
        }
        this.setEndingPage(in.nextInt());
        in.nextLine();

        System.out.println("Enter the copyright year for the article.");
        while(!in.hasNextInt()) {
            in.next();
            System.out.println("Enter the copyright year for the article.");
        }
        this.setPublicationYear(in.nextInt());
        in.nextLine();
    }

    /**
     * Returns a String of information in BibTeX format
     * @return String of BibTeX information
     */
    @Override
    public String toString() {
        return "@ARTICLE { " + super.getMyUniqueID() + ",\n" +
                "author = \"" + super.getAuthor() + "\",\n" +
                "title = \"" + super.getTitle() + "\",\n" +
                "journal = \"" + this.getJournal() + "\",\n" +
                "pages = \"" + this.getStartingPage() + "-" + this.getEndingPage() + "\",\n" +
                "year = \"" + super.getPublicationYear() + "\"\n" +
                "}\n";
    }
}
