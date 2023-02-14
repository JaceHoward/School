package week6;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }
    public String toString() {
        return title + " by " + author + " costs $" + price;
    }

}
