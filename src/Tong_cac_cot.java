import java.util.Scanner;

public class Tong_cac_cot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập số phần tử cho mảng : ");
//        int max = sc.nextInt();
//
//        int[] array = new int[max];
//        for (int i = 0; i < max ;i++){
//            System.out.println("Nhập phần tử thứ " + i);
//            array[i] = sc.nextInt();
//        }
//
//        System.out.println("Mảng vừa nhập vào là : ");
//        for (int j = 0; j < max;j++){
//            System.out.print(array[j] + " ");
//        }



        int[][] array = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {3,5,6,7,8}
        };
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                System.out.print(array[row][column] + " " );
            }
            System.out.println();
        }
        System.out.println("Bạn muốn cộng cột thứ mấy từ 0 --> 4 : ");
        int number = sc.nextInt();
        int number1 = 0;
        for (int row = 0; row < array.length;row++){
            for (int column = 0; column < array[row].length;column++){
                if (number == column){
                    number1 += array[row][column];
                }
            }
        }
        System.out.println("Tổng của cột đó là : " +  number1);

    }
}
