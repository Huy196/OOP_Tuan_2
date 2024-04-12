import java.util.Arrays;
import java.util.Scanner;

public class Them {
    public static void main(String[] args) {
        int[] array = {1,3,4,6,55};
        System.out.println("Các phần tử trong mảng:  "+ Arrays.toString(array));

        int N = array.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Add : ");
        int number_1 = sc.nextInt();

        System.out.println("Vị trí bắt đầu từ : 0 - 4 ");


        System.out.print("Vị trí số : ");
        int number_2 = sc.nextInt();

        if (number_2 < 0 || number_2 >= N){
            System.out.println("Không chèn được phần rử vào mảng. Vui lòng nhập vị trí hợp lệ ! ");
        }else {
            int[] new_Array = new int[N + 1];

            //hiển thị các vị trí trước đó
            for (int i = 0; i < number_2; i++) {
                new_Array[i] = array[i];
            }
            //giá trị khi nhập vào được lưu vào mảng mới
            new_Array[number_2] = number_1;

            //rồi lần lượt chạy qua các phần tử của mảng
            for (int j = number_2 + 1 ; j < new_Array.length ; j++){
                //vì vị trí trong mảng là 1 số nhỏ hơn 1 đv lên khi in ra trừ bỏ 1 để lấy đúng vị trí cần thêm vào
                new_Array[j] = array[j - 1];
            }
            System.out.println(Arrays.toString(new_Array));
        }


    }
}
