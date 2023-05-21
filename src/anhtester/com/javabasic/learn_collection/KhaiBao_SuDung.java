package anhtester.com.javabasic.learn_collection;

import java.util.*;

public class KhaiBao_SuDung {
    public static void main(String[] args) {

        //ArrayList
        List<String> arrayList = new ArrayList<String>();

        arrayList.add("Selenium");
        arrayList.add("Appium");
        arrayList.add("Playwright");
        arrayList.add("Selenium");


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }


        System.out.println("============================");
        Set<String> stringSet = new TreeSet<String>();

        stringSet.add("Cypress");
        stringSet.add("akaAT Studio");
        stringSet.add("Cypress");
        stringSet.add("Katalon");

        //stringSet.stream().sorted();

        for (String str : stringSet) {
            System.out.println(str);
        }

        System.out.println("============================");
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("company", "FPT Software");
        stringMap.put("address", "Hà Nội");
        stringMap.put("address", "Hồ Chí Minh");

        System.out.println(stringMap.get("address"));

    }
}
