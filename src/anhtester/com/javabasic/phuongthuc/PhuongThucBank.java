package anhtester.com.javabasic.phuongthuc;

import anhtester.com.javabasic.kieudulieu.Bank;

public class PhuongThucBank {

    public static void main(String[] args) {
        Bank.getBankInfo();
        double tongTien = (Bank.getInterestRate() * 100000000) / 100;
        System.out.println("Tổng tiền lãi: " + tongTien);
    }

}
