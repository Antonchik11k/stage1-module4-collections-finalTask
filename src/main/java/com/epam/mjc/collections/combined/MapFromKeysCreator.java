package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result_map = new HashMap<>();
        for(String key : sourceMap.keySet()){
            int length = key.length();
            result_map.putIfAbsent(length, new HashSet<>());
            result_map.get(length).add(key);
        }
        return result_map;
    }
}
