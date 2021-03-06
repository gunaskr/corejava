import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Iterable;

 class Book {
 
    String name;
    String author;
    long isbn;
    float price;
   
 
    public Book(String name, String author, long isbn, float price) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }
 
 public String toString() {
        return name + "\t" + author + "\t" + isbn + "\t" + ": Rs" + price;
  }
 
}
 
public class BookShop implements Iterable<Book> {
 
    List<Book> avail_books;
 
    public BookShop() {
        avail_books = new ArrayList<Book>();
    }
 
    public void addBook(Book book) {
        avail_books.add(book);
    }
 
    public Iterator<Book> iterator() {
        return (Iterator<Book>) new BookShopIterator();
    }
 
    class BookShopIterator implements Iterator<Book> {
        int currentIndex = 0;
 
        @Override
        public boolean hasNext() {
            if (currentIndex >= avail_books.size()) {
                return false;
            } else {
                return true;
            }
        }
 
        @Override
        public Book next() {
            return avail_books.get(currentIndex++);
        }
 
        @Override
        public void remove() {
            avail_books.remove(--currentIndex);
        }
 
    }
    
    //main method
    
  public static void main(String[] args) {
 
        Book book1 = new Book("Java", "JamesGosling", 123456, 1000.0f);
        Book book2 = new Book("Spring", "RodJohnson", 789123, 1500.0f);
        Book book3 = new Book("Struts", "Apache", 456789, 800.0f);
 
        BookShop avail_books = new BookShop();
        avail_books.addBook(book1);
        avail_books.addBook(book2);
        avail_books.addBook(book3);
 
        System.out.println("Displaying Books:");
        for(Book total_books : avail_books){
            System.out.println(total_books);
        }
 
    }
 
}