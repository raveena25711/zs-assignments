package com.zs.assignment7.service;

import com.zs.assignment7.entity.ProductEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductService {
    static Map<Integer, ProductEntity> product = new HashMap<>();

    /**
     *
     * @return the map where key is integer which is product id and values are product information.
     */
    public static Map<Integer, ProductEntity> addProduct() {
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

    /**
     *
     * @param productDetails
     * it will read the information of product added.
     */
    public static void readProduct(Map<Integer, ProductEntity> productDetails) {
        for (Integer product : productDetails.keySet()) {
            System.out.println(productDetails.get(product).getId() + " " + productDetails.get(product).getProduct() + " " + productDetails.get(product).getModelName() + " " + productDetails.get(product).getBrand() + " " + productDetails.get(product).getMaterial());
        }
    }

    /**
     *
     * @param productDetails
     * @return map, after updating the existed product.
     */
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

    /**
     *
     * @param productDetails
     * @return map, after deleting the existed product.
     */
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
