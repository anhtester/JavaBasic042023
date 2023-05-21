package anhtester.com.javabasic.vonglapfor;

public class VongLapForDonGian {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i = i + 2) {
            System.out.println("Số thứ tự: " + i);
            System.out.println("Selenium");
        }

        for (int j = 0; j <= 30; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

//        while (true) {
//            System.out.println("Vòng lặp while vô tận...");
//        }

    }
}
