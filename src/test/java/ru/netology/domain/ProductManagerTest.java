package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    void shouldSearchSmartphoneByName() {
        ProductManager manager = new ProductManager();
        Smartphone iPhone1 = new Smartphone(1, "iPhone 13", 69900, "Apple");
        Smartphone iPhone2 = new Smartphone(2, "iPhone 12", 54900, "Apple");
        Smartphone iPhone3 = new Smartphone(3, "iPhone SE", 39900, "Apple");
        Smartphone samsung = new Smartphone(4, "Samsung Galaxy", 88890, "Samsung");

        String textForSearch = "iPhone";

        manager.add(iPhone1);
        manager.add(samsung);

        manager.searchBy(textForSearch);
        Product[] expected = new Product[]{iPhone1};
        Product[] actual = manager.searchBy(textForSearch);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchSmartphoneByManufacturer() {
        ProductManager manager = new ProductManager();
        Smartphone iPhone1 = new Smartphone(1, "iPhone 13", 69900, "Apple");
        Smartphone iPhone2 = new Smartphone(2, "iPhone 12", 54900, "Apple");
        Smartphone iPhone3 = new Smartphone(3, "iPhone SE", 39900, "Apple");
        Smartphone samsung = new Smartphone(4, "Samsung Galaxy", 88890, "Samsung");

        String textForSearch = "Apple";

        manager.add(iPhone2);
        manager.add(samsung);

        manager.searchBy(textForSearch);
        Product[] expected = new Product[]{iPhone2};
        Product[] actual = manager.searchBy(textForSearch);
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldSearchBookByName() {
        ProductManager manager = new ProductManager();
        Book book1 = new Book(1, "Book1", 255, "Steinbeck");
        Book book2 = new Book(2, "Book2", 150, "Maugham");
        Book book3 = new Book(3, "Book3", 250, "Faulkner");
        Book siesta = new Book(4, "Siesta", 350, "Hemingway");

        String textForSearch = "Book";


        manager.add(book2);
        manager.add(siesta);

        manager.searchBy(textForSearch);
        Product[] expected = new Product[]{book2};
        Product[] actual = manager.searchBy(textForSearch);
        assertArrayEquals(expected, actual);


    }

    @Test
    void shouldSearchBookByAuthor() {
        ProductManager manager = new ProductManager();
        Book book1 = new Book(1, "Book1", 255, "Steinbeck");
        Book book2 = new Book(2, "Book2", 150, "Maugham");
        Book book3 = new Book(3, "Book3", 250, "Faulkner");
        Book siesta = new Book(4, "Siesta", 350, "Hemingway");

        String textForSearch = "Maugham";

        manager.add(book2);
        manager.add(siesta);

        manager.searchBy(textForSearch);
        Product[] expected = new Product[]{book2};
        Product[] actual = manager.searchBy(textForSearch);
        assertArrayEquals(expected, actual);


    }
}