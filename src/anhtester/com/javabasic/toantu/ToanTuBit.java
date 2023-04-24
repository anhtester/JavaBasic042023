package anhtester.com.javabasic.toantu;

public class ToanTuBit {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        boolean checkValue1 = (a > 1) & (b < 2); //false
        boolean checkValue2 = (a > 1) || (b < 2); //true

        String expectedText = "Login"; //Data cứng từ Excel
        String actualText = "Login"; //Lấy bằng auto với Selenium //driver.findElement(headerHomePage).getText()

        String buttonExpectedColor = "#f77b0b";
        String buttonActualColor = ""; //Lấy bằng auto với Selenium

        System.out.println(checkValue1);
        System.out.println(checkValue2);
        System.out.println((expectedText == actualText) && (buttonExpectedColor == buttonActualColor));

    }
}
