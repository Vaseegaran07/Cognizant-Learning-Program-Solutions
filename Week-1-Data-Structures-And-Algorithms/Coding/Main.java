package test;

import model.Product;
import search.ProductSearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Smartphone", "Electronics"),
                new Product(3, "Shampoo", "Health"),
                new Product(4, "Book", "Education"),
                new Product(5, "Sneakers", "Footwear"),
        };

  
        System.out.print("Enter product name to search: ");
        String searchTerm = scanner.nextLine();

        System.out.println("\n Linear Search:");
        Product linearResult = ProductSearch.linearSearch(products, searchTerm);
        System.out.println(linearResult != null ? linearResult : "Product not found.");

        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        System.out.println("\n Binary Search:");
        Product binaryResult = ProductSearch.binarySearch(products, searchTerm);
        System.out.println(binaryResult != null ? binaryResult : "Product not found.");

        scanner.close();
    }
}
