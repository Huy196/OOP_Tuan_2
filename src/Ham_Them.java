import java.util.Arrays;
import java.util.Scanner;

public class Ham_Them {
    double a, b;
    int N;

    public Ham_Them(double a, double b, int N) {
        this.a = a;
        this.b = b;
        this.N = N;
    }

    public int[] getAdd(int[] array) {
        if (a < 0 || a >= N) {
            System.out.println("Không chèn được phần tử vào mảng. Vui lòng nhập vị trí lớp lệ!");
            return array;
        } else {
            int[] new_Array = new int[N + 1];
            for (int i = 0; i < array.length; i++) {
                new_Array[i] = array[i];
            }
            for (int i = new_Array.length - 1; i > (int) a; i--) {
                new_Array[i] = new_Array[i - 1];
            }
            new_Array[(int) a] = (int) b;

            return new_Array; // Trả về mảng mới đã được thêm phần tử
        }
    }
}

class Ham_Them_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;

        int[] array = {1, 3, 4, 6, 55};
        System.out.println("Các phần tử trong mảng:  " + Arrays.toString(array));

        int N = array.length;

//        while (true) {
            System.out.println("Hãy nhập sự lựa chọn của bạn :");
            System.out.println("1. Add ");
            System.out.println("2. Delete ");
            System.out.println("3. Thoát ");

            int number = input.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Hãy nhập vị trí muốn thêm : 0 --> " + (N - 1));
                    a = input.nextDouble();
                    System.out.println("Hãy nhập số bạn muốn thêm : ");
                    b = input.nextDouble();

                    Ham_Them hamThem = new Ham_Them(a, b, N);
                    array = hamThem.getAdd(array); // Gán mảng mới trở lại mảng ban đầu
                    System.out.println("Mảng mới: " + Arrays.toString(array));
                    break;

            }
//        }
    }
}