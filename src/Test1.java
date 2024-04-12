import java.util.Scanner;

public class Test1 {
//      không trả về 1 giá trị
//     static void myMethod(String frame, int  age){
//        System.out.println(frame + "co cai dau buoi " + age);
//    }
//
//    public static void main(String[] args) {
//        myMethod("liam", 5);
//        myMethod("jenny", 6);
//        myMethod("Anja", 8);
//    }

    //Trả về 1 giá trị
//    static int myMethod(int x, int  y){
//        return y + x;
//    }
//
//    public static void main(String[] args) {
////        System.out.println(myMethod(3,5));
////        System.out.println(myMethod(6,4));
//        int z = myMethod(5,3);
//        System.out.println(z);
//
//    }

    static void checkAge(int age){
        if (age < 18){
            System.out.println("chưa đủ tuổi đăng kí ");
        }else {
            System.out.println("Đủ tuổi trăm mâm");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số tuổi của bạn : ");
        int number = sc.nextInt();
        checkAge(number);
    }
}
