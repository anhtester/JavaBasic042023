package anhtester.com.javabasic.statictrongjava;

public class PhuongThucStatic {
    public static void getAllInformation(){
        System.out.println(BienStatic.URL);
        System.out.println(BienStatic.BROWSER);
        System.out.println(BienStatic.EMAIL);
        System.out.println(BienStatic.PASSWORD);
    }

    public static int cong2So(int a, int b){
        return a + b;
    }

    public static String getURL(){
        return BienStatic.URL;
    }

    public void compareHeaderLoginPage(){

    }
}
