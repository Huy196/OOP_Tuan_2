import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        //Nhập phần tử vào mảng
        int size;
        int[] array;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size : ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20 ");
            }
        }while (size > 20);

        //In ra các phần tử
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        //Hiển thị chúng
        System.out.println("Element is array: " );
        for (int j= 0; j < array.length; j++){
            System.out.println(array[j] );
        }

        //Đảo ngược
        for (int j = 0; j < array.length / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 -j];
            array[size - 1 - j] = temp;
        }
        //Hiển thị
        System.out.println("Reverse array: ");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }
}
