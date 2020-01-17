package quotes;

public class APIQuoteContent {
    String author;
    String body;

    public APIQuoteContent(String author, String body) {
        this.author = author;
        this.body = body;
    }

    public String toString() {
        return body + "\n" + " - " + author;
    }
}
