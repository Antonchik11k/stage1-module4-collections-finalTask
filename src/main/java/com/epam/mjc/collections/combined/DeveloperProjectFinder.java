package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result_str = new ArrayList<>();
        for(Map.Entry<String, Set<String>> pr : projects.entrySet()){
            if(pr.getValue().contains(developer)){
                result_str.add(pr.getKey());
            }
        }
        Collections.sort(result_str, new Comparator<String>(){
            public int compare(String str1, String str2){
                int length_compare = Integer.compare(str2.length(), str1.length());
                if(length_compare != 0){
                    return length_compare;
                }
                return str2.compareTo(str1);
            }
        });
        return result_str;
    }
}
