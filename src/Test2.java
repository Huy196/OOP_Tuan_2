public class Test2 {
    static int Number(int x, int y){
        return x + y;
    }
    static  double Letter(double x ,double y ){
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = Number(8,2);
        double myNum2 = Letter(53,52);
        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}
