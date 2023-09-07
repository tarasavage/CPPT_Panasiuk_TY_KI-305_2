package KI305.Panasiuk.Lab7;

/**
 * A class representing a piece of paper that implements the Item interface.
 * It provides methods to get the content of the paper and to print its details.
 * This class also implements the Comparable interface for comparison with other items.
 * 
 * @author Taras Panasiuk
 * @version 1.0
 */
public class Paper implements Item {

    private String content;

    /**
     * Constructs a piece of paper with the specified content.
     *
     * @param content The content of the paper.
     */
    public Paper(String content) {
        this.content = content;
    }

    /**
     * Gets the content of the paper.
     *
     * @return The content of the paper.
     */
    public String getContent() {
        return content;
    }

    @Override
    public int getSize() {
        return content.length();
    }

    @Override
    public void print() {
        System.out.println("Paper Content: " + content);
    }

    @Override
    public int compareTo(Item other) {
        if (other instanceof Paper) {
            Paper otherPaper = (Paper) other;
            return this.content.compareTo(otherPaper.content);
        }
        return 0;
    }
}
