import java.util.Scanner;

public class Main_diagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[4][4];
        // Nhap phần tử cho mảng
        System.out.println("Nhập phần tử cho mảng : ");
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = sc.nextInt();
            }
        }
        // in mảng ra
        System.out.println("phần tử trong mảng");
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                    System.out.print(array[row][column] + " " );
                }
            System.out.println();
        }

        // in đường chéo của mảng
        System.out.println("các số của đương chéo");
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                if(row == column){
                System.out.print(array[row][column] + " " );
            }}
            System.out.print("  ");
        }
        System.out.println();
        //tổng đường cheo
        System.out.println("Tổng đường chéo chính của hình vuông là");
        int number = 0;

        for (int row = 0;row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                if (row == column){
                number += array[row][column];
                }
            }
        }
        System.out.println(number);
    }
}
