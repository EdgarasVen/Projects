import com.eisgroup.javaexam.library.Book;
import com.eisgroup.javaexam.library.Library;

import java.util.*;
import java.util.stream.Collectors;

public class Lib implements Library {
    Set<Book> list = new HashSet<>();

    @Override
    public void takeABook(Book book) {
        list.add(book);
    }

    @Override
    public int getNumberOfBooks() {
        return list.size();
    }

    @Override
    public Book findByTitle(String s) {
        return list.stream()
                .filter(book -> book.getTitle().equals(s))
                .findAny()
                .orElse(null);
    }

    @Override
    public Collection<Book> findByAuthor(String s) {
        return list.stream()
                .filter(book -> book.getAuthor().equals(s))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Book> getBooksSortedByPageCount() {
        return list.stream()
                .sorted(Comparator.comparing(Book::getPageCount))
                .collect(Collectors.toList());
    }
}
