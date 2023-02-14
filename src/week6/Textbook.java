package week6;

public class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, double price, String subject) {
        super(title, author, price);
    }

    @Override
    public void changePrice(double newPrice) {
        super.changePrice(newPrice + 10);
    }

    public String toString() {
        String out = super.toString();
        out += " with subject " + subject;
        return out;
    }
}
