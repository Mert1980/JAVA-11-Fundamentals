package extraExercises;

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(30, "name30"));
        books.add(new Book(40, "name40"));
        books.add(new Book(60, "name60"));
        books.add(new Book(90, "name30"));
        books.add(new Book(100, "name40"));
        books.add(new Book(110, "name60"));
        books.add(new Book(130, "name30"));
        books.add(new Book(140, "name40"));
        books.add(new Book(160, "name60"));

        int binarySearchId = binarySearch(books, 140);

        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int begin = 0;
        int end = books.size()-1;

        while(begin <= end){
            int middle = (begin + end) / 2;

            if (books.get(middle).getId() == searchedId) {
                return middle;
            }

            if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            }

            if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }
        }


        return -1;
    }
}
