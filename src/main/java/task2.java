package main.java;

import java.util.*;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String args[]) {
        List<String> list1 = new ArrayList<String>();
        list1.add("abca");
        list1.add("abbb");
        list1.add("addddda");
        list1=search(list1);
        for(String i:list1)
            System.out.println(i);
    }
    static List<String> search(List<String> l1)
    {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }
}