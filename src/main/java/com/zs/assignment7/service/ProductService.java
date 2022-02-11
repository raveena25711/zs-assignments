package com.zs.assignment7.service;

import com.zs.assignment7.entity.ProductEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductService {
    static Map<Integer, ProductEntity> product = new HashMap<>();

    public static Map<Integer, ProductEntity> addProduct(Map<Integer, ProductEntity> productDetails) {
        ProductEntity productDetailsModel = new ProductEntity();
        Scanner sc = new Scanner(System.in);
        System.out.println("Product id: ");
        Integer id = sc.nextInt();
        productDetailsModel.setId(id);
        sc.nextLine();
        System.out.println("Product Name: ");
        String productName = sc.nextLine();
        productDetailsModel.setProduct(productName);
        System.out.println("Model Name: ");
        String modelName = sc.nextLine();
        productDetailsModel.setModelName(modelName);
        System.out.println("brand: ");
        String brandName = sc.nextLine();
        productDetailsModel.setBrand(brandName);
        System.out.println("material Name: ");
        String material = sc.nextLine();
        productDetailsModel.setMaterial(material);
        product.put(id, productDetailsModel);
        return product;
    }

    public static void readProduct(Map<Integer, ProductEntity> details) {
        for (Integer product : details.keySet()) {
            System.out.println(details.get(product).getId() + " " + details.get(product).getProduct() + " " + details.get(product).getModelName() + " " + details.get(product).getBrand() + " " + details.get(product).getMaterial());
        }
    }

    public static Map<Integer, ProductEntity> update(Map<Integer, ProductEntity> productDetails) {
        ProductEntity productDetailsModel = new ProductEntity();
        Scanner sc = new Scanner(System.in);
        System.out.println("Product id: ");
        Integer id = sc.nextInt();
        productDetailsModel.setId(id);
        sc.nextLine();
        if (productDetails.containsKey(id)) {
            System.out.println("Product Name: ");
            String productName = sc.nextLine();
            productDetailsModel.setProduct(productName);
            System.out.println("Model Name: ");
            String modelName = sc.nextLine();
            productDetailsModel.setModelName(modelName);
            System.out.println("brand: ");
            String brandName = sc.nextLine();
            productDetailsModel.setBrand(brandName);
            System.out.println("material Name: ");
            String material = sc.nextLine();
            productDetailsModel.setMaterial(material);
            product.put(id, productDetailsModel);
        }
        else{
            System.out.println("product you are trying to update doesn't exists:");
        }
        return productDetails;
    }

    public static Map<Integer, ProductEntity> deleteProduct(Map<Integer, ProductEntity> productDetails) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter product id to remove: ");
        Integer id = sc.nextInt();
        if (productDetails.containsKey(id)) {
            productDetails.remove(id);
        }
        else{
            System.out.println("product you are trying to delete doesn't exists: ");
        }
        return productDetails;
    }
}
