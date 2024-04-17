import java.util.Arrays;
import java.util.Scanner;

public class Xoa {
    public static void main(String[] args) {
        int[] array = {1,5,3,4,5,140,423,4325,24,53,24234,52};
        int index = -1;
        System.out.println("Các phần tử trong mảng array : " + Arrays.toString(array));

        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số bạn muốn xóa : ");
        int number = sc.nextInt();

        // lấy số để thay cho index
        for (int j = 0 ; j < array.length;j++){
            if (array[j] == number){
                index = j;
                break;
            }
        }
        if (index == -1){
            System.out.println("Không có giá trị trong phần tử");
        }

        int[] new_array = new int[array.length -1];

        for (int j = 0, i = 0 ; j < array.length; j++,i++){
           if (array[j]==number){
               i--;
               continue;
           }
           new_array[i] = array[j];
        }
        System.out.println("Các phần tử trong mảng new_array : " + Arrays.toString(new_array));

    }
}

