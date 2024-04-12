import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        String[] student = {"hanh","huy","hoan","anh","em","đức"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập tên bạn muốn tìm : ");
        String name = sc.nextLine();

        boolean Ok = false;
        for (int i = 0; i < student.length; i++){
            if (student[i].equals(name)){    //equals -- thuộc tính so sánh
                System.out.println("Vị trí tên trong danh sách " + name + " "+ i);
                Ok = true;
                break;
            }


            }
        if (!Ok){
            System.out.println("Không có tên " + name + " trong danh sách" );
        }
    }
}
