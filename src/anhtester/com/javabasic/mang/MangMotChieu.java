package anhtester.com.javabasic.mang;

public class MangMotChieu {
    public static void main(String[] args) {

        //Khai báo mảng
        int songuyen[] = new int[20];

        //Thêm giá trị vào mảng thủ công từng vị trí
        //Mảng bắt đầu từ vị trí là 0
        songuyen[0] = 5;
        songuyen[2] = 10;
        songuyen[19] = 30;

        //In giá trị trong mảng theo thủ công từng vị trí
//        System.out.println(songuyen[0]);
//        System.out.println(songuyen[1]);
//        System.out.println(songuyen[2]);
//        System.out.println(songuyen[3]);
//        System.out.println(songuyen[19]);

        System.out.println("Độ dài mảng: " + songuyen.length);

        //Duyệt phần tử trong mảng với vòng lặp FOR
        //Nhớ dừng lại với giá trị bé hơn độ dài của mảng đó. Vì nó bắt đầu từ 0
        for (int i = 2; i < songuyen.length; i++) {
            System.out.println(songuyen[i]);
        }

        //Thêm giá trị vào mảng thông qua vòng lặp FOR
        for (int i = 0; i < songuyen.length; i++) {
            if(i % 2 == 0){
                songuyen[i] = 10;
            }

        }

        for (int i = 0; i < songuyen.length; i++) {
            System.out.println(songuyen[i]);
        }

        //Gán mảng nặc danh cho mảng a
        int a[] = { 33, 3, 4, 5 };
        System.out.println(a.length);

        String b[] = new String[3];
        b[0] = "Selenium";

        //WebElement là một element trên web


    }
}
