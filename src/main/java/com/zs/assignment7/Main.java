package com.zs.assignment7;

import com.zs.assignment7.controller.ProductController;

/**
 * calling the productConstructor method.
 */
public class Main {
    public static void main(String[] args){
        ProductConstructor();
    }

    public static void ProductConstructor(){
        /**
         * created constructor of ProductController class.
         */
        ProductController pc = new ProductController();
        pc.Controller();
    }
}
