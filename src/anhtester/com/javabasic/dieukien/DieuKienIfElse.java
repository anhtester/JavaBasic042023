package anhtester.com.javabasic.dieukien;

public class DieuKienIfElse {
    public static void main(String[] args) {

        //Điều kiện IF
        int age = 30;
        String name = "Auto";
        String message = "Add Category successful.";

        if (age > 20 && (name.equals("Manual") || message.contains("success"))) {
            System.out.println("Thoả điều kiện");
        }

        int number = 14;
        if (number % 2 == 0) {
            System.out.println("Số " + number + " là số chẵn.");
        } else {
            System.out.println("Số " + number + " là số lẻ.");
        }

        System.out.println();


    }
}
