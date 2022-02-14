package com.zs.assignment7.controller;

import com.zs.assignment7.entity.ProductEntity;
import com.zs.assignment7.service.ProductService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * according to user entered number, it will call the particular method and executes it.
 * if user enter 5 it will exit the process.
 * if user entered number is not matching between 1 to 5 then the default message will get printed.
 */
public class ProductController {
    Map<Integer, ProductEntity> productDetails=new HashMap<>();
    /**
     * created constructor of ProductService class.
     */
    ProductService ps = new ProductService();
    public void Controller() {
        int number = 0;
        while (number != 5) {
            System.out.println("enter 1 for adding an product: ");
            System.out.println("enter 2 for reading the product info: ");
            System.out.println("enter 3 for updating the product info: ");
            System.out.println("enter 4 for delete the product info: ");
            System.out.println("enter 5 for exit: ");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choose:");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    productDetails = ps.addProduct();
                    break;

                case 2:
                    ps.readProduct(productDetails);
                    break;
                case 3:
                    ps.update(productDetails);
                    break;
                case 4:
                    ps.deleteProduct(productDetails);
                    break;
                case 5:
                    System.out.println("exit:");
                    break;
                default:
                    System.out.println("code to be executed if all cases are not matched:");

            }
        }
    }
}
