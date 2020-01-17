package quotes;

public class RecentQuote {

  String author;
  String text;

  public RecentQuote(String author, String text) {

    this.author = author;
    this.text = text;

  }

  @Override
  public String toString() {
    return "Quote: " + this.text + "\nBy: " + this.author;
  }
}
