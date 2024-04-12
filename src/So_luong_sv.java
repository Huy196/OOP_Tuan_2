import java.util.Scanner;

public class So_luong_sv {
    public static void main(String[] args) {
        int size;
        int [] array = new int[10];
        Scanner sc =new Scanner(System.in);

        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if (size > 10){
                System.out.println("Size should not exceed 10");
            }
        }while (size > 10);

        for (int i = 0; i < array.length; i++){
            System.out.print("Nhập điểm  " + i + " - ");
            array[i] = sc.nextInt();
        }
        int number = 0;
        for (int j = 0 ;j < array.length;j++){
            System.out.print(array[j] + " ");
            if (array[j] >= 5 && array[j] <= 10){
                number++;
            }
        }
        System.out.println();
        System.out.println("The number of students passing the exam is " + number);
    }
}
