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
    static Deque<Integer> deque = new LinkedList<>();
    static Map<Integer, Cache> map = new HashMap<>();
    int CACHE_CAPACITY = 4;

    public void putElementInCache(int key, int id,String category,String subCategory,String productName,String cost)
    {
        if(map.containsKey(key))
        {
            Cache curr = map.get(key);
            deque.remove(curr.key);
        }
        else
        {
            if(deque.size() == CACHE_CAPACITY)
            {
                int temp = deque.removeLast();
                map.remove(temp);
            }
        }
        Cache newItem = new Cache(key, id, category, subCategory, productName, cost);
        deque.addFirst(newItem.key);
        map.put(key, newItem);
    }
public static void main(String[] args){
    Lru cache = new Lru();
    cache.putElementInCache(1, 1,"electronic","mobiles","oppo","12000");
    cache.putElementInCache(2, 2,"grocery","vegitables","tomato","50");
    cache.putElementInCache(3, 3,"electronic","laptops","dell","50000");
    cache.putElementInCache(4, 4,"electronic","desktops","iMac","200000");
}
}