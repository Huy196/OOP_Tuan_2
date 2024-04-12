import java.util.Scanner;

public class Dem_so_ki_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String array = "1,2,3,4,5,5,2,33,3,2,1,1,1";

        System.out.println( "Kí tự trong mảng : " + array);


        System.out.println("Kí tự bạn muốn kiểm tra là : ");
        int number = 0;
        String text = sc.nextLine();
        for (int i = 0 ; i < array.length();i++){
            if (array.charAt(i) == text.charAt(0)){ // Vị trí được chỉ định
                number++;
            }
        }

        System.out.println("Số lần xuất hiện của kí tự " + text + " là " + number );
    }
}
