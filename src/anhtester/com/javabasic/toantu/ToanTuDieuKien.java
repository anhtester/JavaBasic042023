package anhtester.com.javabasic.toantu;

public class ToanTuDieuKien {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;

//        String name;
//        String address;
//        String email;

        //Khai báo biến đồng loạt
        String name, address, email;
        int aa,bb,cc;
        aa = bb = cc = 10;

        //Khai báo biến để so sánh giá trị
        String expectedText = "Login"; //Data cứng từ Excel
        String actualText = "Login 123"; //Lấy bằng auto với Selenium //driver.findElement(headerHomePage).getText()

        String buttonExpectedColor = "#f77b0b";
        String buttonActualColor = ""; //Lấy bằng auto với Selenium

        String s = ((expectedText == actualText) && (buttonExpectedColor == buttonActualColor)) ? "Test case pass" : "Test case fail. Text trên button không đúng.";
        System.out.println(s);
    }
}
