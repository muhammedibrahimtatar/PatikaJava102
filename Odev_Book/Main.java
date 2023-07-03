package Odev_Book;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookTreeSet = new TreeSet();
        bookTreeSet.add(new Book("Dance with the stars", 5683, "Vegas black", "01.10.2000"));
        bookTreeSet.add(new Book("lorem with the stars", 3524, "Vegas black", "05.11.2000"));
        bookTreeSet.add(new Book("param with the stars", 113, "Vegas black", "01.12.2000"));
        bookTreeSet.add(new Book("MUNDance with the stars", 13245, "Vegas black", "01.10.2000"));
        bookTreeSet.add(new Book("yordle with the stars", 2020, "Vegas black", "19.04.2000"));
        Iterator var2 = bookTreeSet.iterator();

        while(var2.hasNext()) {
            Book b = (Book)var2.next();
            PrintStream var10000 = System.out;
            String var10001 = b.getName();
            var10000.println(var10001 + ", " + b.getTotalPage());
        }
    }
}