package com.zs.assignment8.lru;

import java.util.*;


class Cache{

    int key;
    int id;
    String category;
    String subCategory;
    String productName;
    String cost;

    Cache(int key, int id,String category,String subCategory,String productName,String cost) {
        this.key = key;
        this.id = id;
        this.category=category;
        this.subCategory=subCategory;
        this.productName=productName;
        this.cost=cost;
    }

}
public class Lru{

}