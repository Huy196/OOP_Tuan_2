import java.util.Arrays;

public class Gop_mang {
    public static void main(String[] args) {
        int[] array_1 = {1,2,3,4,5};
        int[] array_2 = {7,8754,6468,749};

        System.out.print("Mảng 1 có các giá trị : " );
        for (int i : array_1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Mảng 2 có các giá trị : " );
        for (int i : array_2){
            System.out.print( i + " ");
        }
        System.out.println();


        int[] new_array = new int[array_1.length + array_2.length];

        for (int i = 0; i < array_1.length;i++){
            new_array[i] = array_1[i];
        }
        for (int j = 0; j < array_2.length;j++){
            new_array[array_1.length + j] = array_2[j];
        }
        System.out.println("Mảng sau khi đã gộp : " + Arrays.toString(new_array));
    }
}
