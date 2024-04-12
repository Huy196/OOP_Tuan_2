import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int[] array = new int[5];
        int number;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < array.length ){
            System.out.print("Hãy nhập số vào mảng " + (i +1) + " : " );
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Các phần tử trong mảng : ");
        for (int j : array){
            System.out.print(j + " ");
        }
        System.out.println();

        int max = array[0];
        int index = 1;

        for (int j = 0 ; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất là : " + max + "\n"+ "Vị trí số : " + index);
    }
}
