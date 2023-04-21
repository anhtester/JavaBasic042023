package anhtester.com.javabasic.variables;

public class LearnVariables {

    public static void sayHello() {
        int n = 10;  // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        //Cách 1
//        LearnVariables abc = new LearnVariables();
//        abc.sayHello();
        //Cách 2
        sayHello();
    }
}
