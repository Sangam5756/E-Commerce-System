package com.shopify.main;

import java.util.Scanner;

import com.shopify.services.ProductService;
import com.shopify.services.ProductServiceImpl;

public class Test {

	public static void main(String args[]) {

		try (Scanner sc = new Scanner(System.in)) {
			int ch;

//			here will create product service
			ProductService productService = new ProductServiceImpl();

			do {

				System.out.println("1.Add Product" + "\n2.Display Products" + "\n3.Show All Products "
						+ "\n4.Show Product With Stock Status");
				System.out.println("Enter the choice ");
				ch = sc.nextInt();

				try {
					switch (ch) {
					case 1: {
						System.out.println("\n-----------------ADD PRODUCTS-----------------\n");
						System.out.println(productService.addProduct("Mapple iPhone 15", "ELECTRONICS", 79999.99, 10));
						System.out.println(productService.addProduct("ZARA T-shirt", "CLOTHING", 5999.50, 25));
						System.out.println("\n-----------------_____________________-----------------\n");
						break;
					}
					case 2: {

						System.out.println("\n-----------------ALL PRODUCTS-----------------\n");
						productService.DisplayProduct();
						System.out.println("\n-----------------_____________________-----------------\n");
						break;
					}
					case 3: {
						System.out.println("\n-----------------PRODUCTS WITH STOCK STATUS-----------------\n");
						productService.DisplayProductWithStockStatus();
						System.out.println("\n-----------------_____________________-----------------\n");
						break;
					}
					case 4: {
						System.out.println("\n-----------------REGISTER CUSTOMER-----------------\n");

						System.out.println("\n-----------------_____________________-----------------\n");
					}

					default:
						System.out.println("invalid choice");
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			} while (ch != 0);

		}

	}

}
