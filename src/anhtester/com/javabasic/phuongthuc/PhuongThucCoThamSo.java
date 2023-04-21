package anhtester.com.javabasic.phuongthuc;

public class PhuongThucCoThamSo {

    static float INTEREST_RATE = 7.3F;

    public static double tinhLai(long soTienGui) {
        return ((soTienGui * INTEREST_RATE) / 100);
    }

    public static double cong2So(double number1, double number2) {
        return number1 + number2;
    }

    public static int cong2SoNguyen(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.println("Tiền lãi sau 12 tháng: " + tinhLai(100000000));
        System.out.println("Cộng 2 số nguyên: " + cong2SoNguyen(15, 20));
    }

}
