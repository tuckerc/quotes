package quotes;

public class BreakingBadQuote {

  String author;
  String quote;

  public BreakingBadQuote(String author, String quote) {

    this.author = author;
    this.quote = quote;

  }

  @Override
  public String toString() {
    return "Quote: " + this.quote + "\nBy: " + this.author;
  }
}
