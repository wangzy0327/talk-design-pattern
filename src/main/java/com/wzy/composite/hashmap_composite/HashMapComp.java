package com.wzy.composite.hashmap_composite;

import java.util.HashMap;
import java.util.Map;

public class HashMapComp {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(0,"东游记"); //直接存放叶子节点
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"西游记");
        map.put(2,"东游记");
        hashMap.putAll(map);  //存放子组件
        System.out.println(hashMap);
    }
}
