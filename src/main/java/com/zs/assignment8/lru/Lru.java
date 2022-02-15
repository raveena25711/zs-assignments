package com.zs.assignment8.lru;

import java.util.*;


class Cache{
    int key;
    int id;
    String category;
    String subCategory;
    String productName;
    String cost;

    /**
     * @param key
     * @param id
     * @param category
     * @param subCategory
     * @param productName
     * @param cost
     */
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

    /**
     * @param key
     * @param id
     * @param category
     * @param subCategory
     * @param productName
     * @param cost
     * this method will put the elements in cache
     */
    public void putElementInCache(int key, int id,String category,String subCategory,String productName,String cost) {
        if(map.containsKey(key))
        {
            Cache currentValue= map.get(key);
            deque.remove(currentValue.key);
        }
        else
        {
            if(deque.size() == CACHE_CAPACITY)
            {
                int removeLastElement = deque.removeLast();
                map.remove(removeLastElement);
            }
        }
        Cache newItem = new Cache(key, id, category, subCategory, productName, cost);
        deque.addFirst(newItem.key);
        map.put(key, newItem);
    }

    /**
     * @param key
     * @return int, if the searching key is found it will return id or else it will return -1
     */
    public int getElementFromCache(int key) {
        if(map.containsKey(key))
        {
            Cache current = map.get(key);
            deque.remove(current.key);
            deque.addFirst(current.key);
            System.out.println("found key already exists in map so, key removed from current position and kept in head:");
            return current.id;

        }
        System.out.println("if searching key doesn't exits it will print -1");
        return -1;
    }

    /**
     * @return list of string which will include the information of categories.
     */
    public static List<String> displayCategories(){
        List<String> categories=new ArrayList<>();
        for(Integer key:map.keySet()){

            if(!categories.contains(map.get(key).category)){
                categories.add(map.get(key).category);
            }
        }return categories;

    }

public static void main(String[] args){
    Lru cache = new Lru();
    cache.putElementInCache(1, 1,"electronic","mobiles","oppo","12000");
    cache.putElementInCache(2, 2,"grocery","vegitables","tomato","50");
    cache.putElementInCache(3, 3,"electronic","laptops","dell","50000");
    cache.putElementInCache(4, 4,"electronic","desktops","iMac","200000");
    System.out.println(cache.getElementFromCache(2));
    System.out.println();
    System.out.println(deque);
    System.out.println();
    System.out.println(cache.getElementFromCache(5));
    cache.putElementInCache(5,5,"grocery","fruits","apple","200");
    System.out.println();
    System.out.println(deque);
    System.out.println();
    List<String> categories=displayCategories();
    System.out.println("categories: "+categories);
}
}