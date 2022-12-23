package libr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book-bean")
public class Book {
    @Value("GoldFish")
    private String name;

    @Value("A. S. Pushkin")
    private String author;

    @Value("1835")
    private int yearPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }
}
