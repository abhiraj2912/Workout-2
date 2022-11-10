
public class MathFunction {
    static int multiply(int x, int y){
        return x*y;
    }
    static double multiply(double x,double y){
        return x*y;
    }
    static double multiply(double x,int y){
        return x*y;
    }
public static void main(String args []){

        System.out.println("Two Integers "+multiply(10,20));
        System.out.println("Two Floats "+multiply(20.5,30.5));
        System.out.println("One Float and One Integer "+multiply(15.5,20));
}
}
