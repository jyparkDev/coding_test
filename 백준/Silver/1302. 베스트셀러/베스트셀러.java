import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static class Book{
        String name;
        int sellCount ;

        public Book(String name) {
            this.name = name;
            this.sellCount = 0;
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Book> books = new HashMap<>();

        while (N-- > 0){
            String book = br.readLine();
            if(books.containsKey(book)){
                Book b = books.get(book);
                b.sellCount++;
                continue;
            }
            books.put(book,new Book(book));
        }

        List<Book> collect = books.values().stream().sorted(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if(o1.sellCount == o2.sellCount)
                    return o1.name.compareTo(o2.name);
                return o2.sellCount - o1.sellCount;
            }
        }).collect(Collectors.toList());

        System.out.println(collect.get(0).name);
    }
}
