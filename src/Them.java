import java.util.Arrays;
import java.util.Scanner;

public class Them {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 55};
        System.out.println("Các phần tử trong mảng:  " + Arrays.toString(array));
        int N = array.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Add : ");
        int number_1 = sc.nextInt();

        System.out.println("Vị trí bắt đầu từ : 0 - 5 ");
        System.out.print("Vị trí số : ");

        int number_2 = sc.nextInt();

        if (number_2 < 0 || number_2 >= N + 1) {
            System.out.println("Không chèn được phần rử vào mảng. Vui lòng nhập vị trí hợp lệ ! ");
        } else {
            int[] new_Array = new int[N + 1];

            for (int i = 0; i < number_2; i++) {
                new_Array[i] = array[i];
            }
            new_Array[number_2] = number_1;

            for (int j = number_2 + 1; j < new_Array.length; j++) {
                new_Array[j] = array[j - 1];
            }
            System.out.println("Mảng mới : " + Arrays.toString(new_Array));
        }
    }
}
