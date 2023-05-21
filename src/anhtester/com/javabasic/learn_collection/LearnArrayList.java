package anhtester.com.javabasic.learn_collection;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        //Khai báo ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();

        //Thêm phần tử vào ArrayList
        arrayList.add("Selenium");
        arrayList.add("TestNG Framework");
        arrayList.add("Selenium");
        arrayList.add(1, "Extent Report"); //Thêm vào với vị trí chỉ định
        arrayList.add("");
        arrayList.add("");

        //Trim Size - cắt bỏ giá trị rỗng
        arrayList.trimToSize();

        System.out.println("Tổng số phần tử: " + arrayList.size());

        //Remove phần tử trong ArrayList
        arrayList.remove("Selenium");
        arrayList.remove(1);

        //Duyệt ArayList - dùng FOR cơ bản
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("=======================");
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Playwright");
        arrayList2.add("Cypress");

        //Add All ArrayList2 vaof ArrayList1
        arrayList.addAll(arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //Tìm kiếm phần tử trpng ArrayList

        System.out.println("Tìm kiếm phần tử: " + arrayList.contains("Selenium"));

        //Chuyển ArrayList về dạng Array
        Object[] mang = arrayList.toArray();
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i]);
        }

        
    }
}
