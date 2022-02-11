package com.zs.assignment7.controller;

import com.zs.assignment7.entity.ProductEntity;
import com.zs.assignment7.service.ProductService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductController {
    Map<Integer, ProductEntity> productDetails=new HashMap<>();
    ProductService ps = new ProductService();
    public void Controller() {
        int number = 0;
        while (number != 2) {
            System.out.println("enter 1 for adding an product: ");
            System.out.println("enter 2 for exit: ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choose:");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    productDetails = ProductService.addProduct(productDetails);
                    break;
                case 2:
                    System.out.println("exit:");
                    break;
                default:
                    System.out.println("code to be executed if all cases are not matched:");

            }
        }
    }
}
