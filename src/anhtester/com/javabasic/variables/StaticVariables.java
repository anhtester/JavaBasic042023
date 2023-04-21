package anhtester.com.javabasic.variables;

public class StaticVariables {

    int tuoi = 20; //Biến toàn cục
    static int age = 30; //Biến static

    public static void main(String[] args) {
        StaticVariables staticVariables = new StaticVariables();
        System.out.println("Tuổi: " + staticVariables.tuoi);

        System.out.println("Tuổi: " + age);
    }
}
