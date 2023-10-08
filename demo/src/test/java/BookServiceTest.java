
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.example.Book;
import com.example.BookService;

public class BookServiceTest {

    BookService bookService = Mockito.mock(BookService.class);
    Book book1 = new Book("1", "Book1", "Author1");
    Book book2 = new Book("2", "Book2", "Author2");

    @Test
    void findBookById() {
        
        Mockito.when(bookService.findBookById("1")).thenReturn(book1);
    }

    @Test
    void findAllBooks() {
        List<Book> allBooks = new ArrayList<Book>();
        allBooks.add(book1);
        allBooks.add(book2);

        Mockito.when(bookService.findAllBooks()).thenReturn(allBooks);

    }

}
