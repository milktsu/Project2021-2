package com.tom;
import java.util.HashMap;
import java.util.Map;
public class MapTester {
    public static void main(String[] args) {
        Map<String, String> students =
                new HashMap<>();
        students.put("001", "Cynthia");
        students.put("002", "Willie");
        students.put("003", "Angela");
        students.put("004", "Ken");
        String name = students.get("001"); //Cynthia
        System.out.println(name);
    }
}
