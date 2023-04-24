package anhtester.com.javabasic.kieudulieu;

public class Bank {
    static int VAT = 10000;

    static String BANKNAME = "Vietinbank";
    static String ADDRESS = "Ô Môn, Cần Thơ";
    static String PHONE = "0939206009";
    static float INTEREST_RATE = 7.3F;
    static String EMAIL = "admin@example.com";

    public static void getBankInfo() {
        //Viết nhiều dòng code trong đây
        System.out.println("Bank Name: " + BANKNAME);
        System.out.println("Bank Address: " + ADDRESS);
        System.out.println("Bank Phone: " + PHONE);
        System.out.println("Bank Interest Rate: " + INTEREST_RATE);

    }

    public static float getInterestRate() {
        //Viết nhiều dòng code trong đây
        return INTEREST_RATE;
    }

}
