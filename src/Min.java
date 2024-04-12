import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        int[] array = new int[5];
        int number;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print("Hãy nhập số vào vị trí " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Mảng vừa nhập vào : " );
        for (int j : array) {
            System.out.print( j + " ") ;
        }
        System.out.println();

        int min = array[0];
        int index = 1;

        for (int j = 0; j < array.length;j++){
            if (array[j] < min){
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị nhỏ nhất là : " + min + "\n" + "Vị trí số " + index);

    }
}
